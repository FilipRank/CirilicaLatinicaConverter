package ui;

import file_choosers.FileChoosers;
import file_choosers.NoFileSelectedException;
import logic.Transcription;
import main.GlobalBus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI extends JFrame {

    private JPanel contentPane;
    private JLabel ucitaniFajlLabel;
    private JButton ucitajFajlButton;
    private JButton prevediButton;
    private JLabel fileSacuvanNaDestinacijiLabel;

    public MainUI() {
        setContentPane(contentPane);
        setTitle("Prevedi cirilicu u latinicu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        ucitajFajlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GlobalBus.setInputFilePath(FileChoosers.startInputFileChooser());
                    ucitaniFajlLabel.setText("Učitani fajl: " + GlobalBus.getInputFilePath());
                } catch (NoFileSelectedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        prevediButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    GlobalBus.setOutputFilePath(FileChoosers.startOutputFileChooser());
                    Transcription.cyrillicToLatin(
                            GlobalBus.getInputFilePath(), GlobalBus.getOutputFilePath()
                    );
                    fileSacuvanNaDestinacijiLabel.setText("File sačuvan na destinaciji: " + GlobalBus.getOutputFilePath());
                } catch (NoFileSelectedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        new MainUI();
    }
}
