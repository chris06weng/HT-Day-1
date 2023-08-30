/*impor java.io.*;
import java.util.*;*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHelper {

    public static void stringToFile(String fileName, String input) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        for (int k = 0; k < input.length(); k++) {
            pw.print(input.charAt(k));
        }
        pw.close();
    }

    public static String fileToString(File fileName) throws IOException {
        StringBuilder record = new StringBuilder("");
        BufferedReader text = new BufferedReader(new FileReader(fileName));

        while (text.ready()) {
            record.append((char) text.read());
        }

        text.close();
        return record.toString();
    }

    public static int countCharacters(String fileName) throws FileNotFoundException, IOException {
        int counter = 0;
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        while (br.ready()) {
            counter++;
            br.read();
            ;
        }

        br.close();
        return counter; 
    }
}
