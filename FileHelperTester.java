import java.io.File;
import java.io.IOException;

public class FileHelperTester {
    public static void main(String[] args) throws IOException {
        FileHelper fh = new FileHelper();
        fh.stringToFile("filetester.txt", "abcdefg");
        File file = new File("filetester.txt");

        System.out.println(fh.fileToString(file));

        System.out.println(fh.countCharacters("filetester.txt"));
        System.out.println(fh.countCharacters("hello2.txt"));

    }

}