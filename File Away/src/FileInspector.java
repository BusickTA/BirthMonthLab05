import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.File;
import java.util.Scanner;

public class FileInspector {
    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser("c:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Please select a text file:");


        int returned = fileChooser.showOpenDialog(null);


        File txtFile = null;


        String currLine;
        String[] currWords;


        int numLines = 0;
        int numWords = 0;
        int numChars = 0;

        if (returned == JFileChooser.APPROVE_OPTION) {
            txtFile = fileChooser.getSelectedFile();


            System.out.println("File name: " + txtFile.getAbsolutePath());


            try {

                Scanner fileReader = new Scanner(txtFile);


                while (fileReader.hasNextLine()) {
                    numLines++;


                    currLine = fileReader.nextLine();


                    System.out.println(currLine);


                    currWords = currLine.split("\\s+");


                    numWords += currWords.length;


                    for (String word : currWords) {
                        numChars += word.length();
                    }
                }


                System.out.println("\n--- Summary Report ---");
                System.out.println("File name: " + txtFile.getName());
                System.out.println("Number of lines: " + numLines);
                System.out.println("Number of words: " + numWords);
                System.out.println("Number of characters: " + numChars);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please restart this program and try again.");
            }
        } else {
            System.out.println("No file chosen. Exiting.");
        }
    }
}
