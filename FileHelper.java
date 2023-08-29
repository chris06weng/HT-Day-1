import java.io.*;
import java.util.*;

public class FileHelper {
    boolean exists;

    public FileHelper() {
        exists = true;
    }

    public void stringToFile(String fileName, String input) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        for (int k = 0; k < input.length(); k++) {
            pw.print(input.charAt(k));
        }
        pw.close();
    }

    public String fileToString(File fileName) throws IOException {
        StringBuilder record = new StringBuilder("");
        BufferedReader text = new BufferedReader(new FileReader(fileName));

        while (text.ready()) {
            record.append((char) text.read());
        }

        text.close();
        return record.toString();
    }

    public int countCharacters(String fileName) {

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            StringBuilder record = new StringBuilder("");

            String output = "";

            output += br.readLine();

            return output.length();

        }

        catch (Exception e) {

            System.out.println("Make sure you type the file name correctly!");

            System.out.println(e);
            return 0;
        }

    }
}