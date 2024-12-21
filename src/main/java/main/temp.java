package main;

import file_choosers.FileChoosers;
import file_choosers.NoFileSelectedException;
import logic.Transcription;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static logic.Transcription.cyrillicToLatin;

public class temp {
    public static void main(String[] args) throws NoFileSelectedException, InterruptedException {
        String outputFile = FileChoosers.startOutputFileChooser();

        System.out.println(outputFile);


    }


}
