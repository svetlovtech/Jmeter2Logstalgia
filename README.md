# JmeterLog2Logstalgia
This is This utility converts JMeter logs to Logstalgia custom log format

<img src="https://i.imgur.com/5wHgoyD.gif" width="600"/>

#### Usage
usage: jmeter2logstalgia-19.08.jar -i inputFileName [-h] -i <arg> [-o <arg>]
  
 -h,--help                     print this message
 
 -i,--input-file-path <arg>    input file destination (required)
 
 -o,--output-file-path <arg>   output file destination. Default: j2l.log

 Compiled fat jar: <a href="https://drive.google.com/file/d/1pwiDG910J3BiO0J0mpxu8qO8rhur7Rkj/view?usp=sharing">download JAR from Google drive</a>
 
#### Results
After the program finishes, log file will be created with content:

> 1371769989|127.0.0.1|/index.html|200|1024

More detail information about log format: https://github.com/acaudwell/Logstalgia/wiki/Custom-Log-Format

#### Running in Logstalgia
To run this log in Logstalgia, you need to run the following command in the console:

> logstalgia data/example.log

#### More about Logstalgia
Youtube video:

[![Logstalgia - Website Access Log Visualization](https://i.ytimg.com/an_webp/HeWfkPeDQbY/mqdefault_6s.webp?du=3000&sqp=CPLvhusF&rs=AOn4CLDnhIlYlg30WT5bZX5Gr8lWnS3MtA)](https://youtu.be/HeWfkPeDQbY "Logstalgia - Website Access Log Visualization")

More detail information about running Logstalgia: https://logstalgia.io/#examples
