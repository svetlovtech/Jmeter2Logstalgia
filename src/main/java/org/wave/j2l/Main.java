package org.wave.j2l;

import com.opencsv.bean.CsvToBeanBuilder;
import me.tongfei.progressbar.ProgressBar;
import org.apache.commons.cli.*;
import org.pmw.tinylog.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        options.addRequiredOption("i", "input-file-path", true, "input file destination (required)");
        options.addOption("o", "output-file-path", true, "output file destination. Default: j2l.log");
        String header = "This is This utility converts JMeter logs to Logstalgia custom log format\n";
        String footer = "Created by 2R(32-52)";
        HelpFormatter formatter = new HelpFormatter();
        CommandLine line = null;
        try {
            line = parser.parse(options, args);
        } catch (ParseException e) {
            formatter.printHelp("j2l.jar -i inputFileName", header, options, footer, true);
            System.exit(0);
        }
        String outputFilePath;
        if (line.getOptionValue('o') != null) {
            outputFilePath = line.getOptionValue('o');
            Logger.info(String.format("output file name set on %s", outputFilePath));
        } else {
            Logger.info("output file name set on default - (j2l.log)");
            outputFilePath = "j2l.log";
        }
        Logger.info("Starting...");
        String inputFilePath = line.getOptionValue('i');
        Logger.info(String.format("Reading %s ...", inputFilePath));
        List<JmeterLogLine> jmeterLogData = new CsvToBeanBuilder(new FileReader(inputFilePath))
                .withType(JmeterLogLine.class)
                .withIgnoreLeadingWhiteSpace(true)
                .withThrowExceptions(false)
                .build().parse();
        Logger.info(String.format("Reading %s complete", inputFilePath));
        Logger.info(String.format("Parsed %s complete", jmeterLogData.size()));
        StringBuffer convertedData = new StringBuffer();
        Character separatorChar = '|';
        ProgressBar progressBar = new ProgressBar("Converting logs format...", ((long) (jmeterLogData.size())));
        jmeterLogData.forEach(jmeterLogLine -> {
            convertedData.append(jmeterLogLine.getTimeStamp().substring(0, 10));
            convertedData.append(separatorChar);
            convertedData.append(jmeterLogLine.getThreadName());
            convertedData.append(separatorChar);
            convertedData.append(jmeterLogLine.getUrl());
            convertedData.append(separatorChar);
            convertedData.append(jmeterLogLine.getResponseCode());
            convertedData.append(separatorChar);
            convertedData.append(jmeterLogLine.getSentBytes());
            convertedData.append("\n");
            progressBar.step();
        });
        progressBar.stop();
        Logger.info(String.format("Parsed %s lines complete", outputFilePath));
        Logger.info(String.format("Saving %s ...", outputFilePath));
        Files.writeString(Paths.get(outputFilePath), convertedData.toString());
        Logger.info(String.format("Saving %s complete", outputFilePath));
    }
}
