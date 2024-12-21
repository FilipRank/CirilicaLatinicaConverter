package file_choosers;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FileChoosers {

    public static String startOutputFileChooser() throws NoFileSelectedException {
        JFileChooser outputChooser = new JFileChooser();
        outputChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int cancelledStatus = outputChooser.showSaveDialog(outputChooser);

        if (cancelledStatus == JFileChooser.CANCEL_OPTION)
            throw new NoFileSelectedException("No output file selected");

        String outputFilePath = outputChooser.getSelectedFile().getAbsolutePath() + ".srt";

        return outputFilePath;
    }

    public static String startInputFileChooser() throws NoFileSelectedException {
        JFileChooser inputChooser = new JFileChooser();
        inputChooser.setFileFilter(new FileNameExtensionFilter(
                "Subtitle files", "srt", "vtt")
        );
        int cancelledStatus = inputChooser.showOpenDialog(inputChooser);

        if (cancelledStatus == JFileChooser.CANCEL_OPTION)
            throw new NoFileSelectedException("No output file selected");

        String inputFilePath = inputChooser.getSelectedFile().getAbsolutePath();

        return inputFilePath;
    }


}
