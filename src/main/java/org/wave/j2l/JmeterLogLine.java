package org.wave.j2l;

import com.opencsv.bean.CsvBindByName;

public class JmeterLogLine {
    @CsvBindByName(column = "timeStamp", required = true)
    private String timeStamp;

    @CsvBindByName(column = "elapsed", required = false)
    private String elapsed;

    @CsvBindByName(column = "label", required = false)
    private String label;

    @CsvBindByName(column = "responseCode", required = true)
    private String responseCode;

    @CsvBindByName(column = "responseMessage", required = false)
    private String responseMessage;

    @CsvBindByName(column = "threadName", required = true)
    private String threadName;

    @CsvBindByName(column = "dataType", required = false)
    private String dataType;

    @CsvBindByName(column = "success", required = false)
    private String isSuccess;

    @CsvBindByName(column = "failureMessage", required = false)
    private String failureMessage;

    @CsvBindByName(column = "bytes", required = false)
    private String bytes;

    @CsvBindByName(column = "sentBytes", required = true)
    private String sentBytes;

    @CsvBindByName(column = "grpThreads", required = false)
    private String grpThreads;

    @CsvBindByName(column = "allThreads", required = false)
    private String allThreads;

    @CsvBindByName(column = "URL", required = true)
    private String url;

    @CsvBindByName(column = "Filename", required = false)
    private String fileName;

    @CsvBindByName(column = "Latency", required = false)
    private String latency;

    @CsvBindByName(column = "Encoding", required = false)
    private String encoding;

    @CsvBindByName(column = "SampleCount", required = false)
    private String sampleCount;

    @CsvBindByName(column = "ErrorCount", required = false)
    private String errorCount;

    @CsvBindByName(column = "Hostname", required = false)
    private String hostName;

    @CsvBindByName(column = "IdleTime", required = false)
    private String idleTime;

    @CsvBindByName(column = "Connect", required = false)
    private String connect;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public String getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(String sentBytes) {
        this.sentBytes = sentBytes;
    }

    public String getGrpThreads() {
        return grpThreads;
    }

    public void setGrpThreads(String grpThreads) {
        this.grpThreads = grpThreads;
    }

    public String getAllThreads() {
        return allThreads;
    }

    public void setAllThreads(String allThreads) {
        this.allThreads = allThreads;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(String sampleCount) {
        this.sampleCount = sampleCount;
    }

    public String getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    @Override
    public String toString() {
        return "JmeterLogLine{" +
                "timeStamp='" + timeStamp + '\'' +
                ", elapsed='" + elapsed + '\'' +
                ", label='" + label + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", threadName='" + threadName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", isSuccess='" + isSuccess + '\'' +
                ", failureMessage='" + failureMessage + '\'' +
                ", bytes='" + bytes + '\'' +
                ", sentBytes='" + sentBytes + '\'' +
                ", grpThreads='" + grpThreads + '\'' +
                ", allThreads='" + allThreads + '\'' +
                ", url='" + url + '\'' +
                ", fileName='" + fileName + '\'' +
                ", latency='" + latency + '\'' +
                ", encoding='" + encoding + '\'' +
                ", sampleCount='" + sampleCount + '\'' +
                ", errorCount='" + errorCount + '\'' +
                ", hostName='" + hostName + '\'' +
                ", idleTime='" + idleTime + '\'' +
                ", connect='" + connect + '\'' +
                '}';
    }
}
