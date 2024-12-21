package main;

public class GlobalBus {
    private static String inputFilePath;
    private static String outputFilePath;

    public static void setInputFilePath(String newInputFilePath) {
        inputFilePath = newInputFilePath;
    }

    public static void setOutputFilePath(String newOutputFilePath) {
        outputFilePath = newOutputFilePath;
    }

    public static String getInputFilePath() {
        return inputFilePath;
    }

    public static String getOutputFilePath() {
        return outputFilePath;
    }
}
