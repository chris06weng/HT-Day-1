import java.io.File;
import java.io.IOException;

public class FileHelperTester {
    public static void main(String[] args) throws IOException {
        FileHelper.stringToFile("filetester.txt", "abcdefg");
        File file = new File("filetester2.txt");

        System.out.println(FileHelper.countCharacters("hello.txt"));
    }

}