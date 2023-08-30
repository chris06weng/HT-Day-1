<<<<<<< Updated upstream
import java.io.File;
=======
>>>>>>> Stashed changes
import java.io.IOException;

public class FileHelperTester {
    public static void main(String[] args) throws IOException {
        FileHelper fh = new FileHelper();
        fh.stringToFile("filetester.txt", "abcdefg");
<<<<<<< Updated upstream
        File file = new File("filetester.txt");

        System.out.println(fh.fileToString(file));

        System.out.println(fh.countCharacters("filetester.txt"));
        System.out.println(fh.countCharacters("hello2.txt"));

    }

=======
        String test = fh.fileToString("filetester2.txt");
        System.out.println(test);
    }
>>>>>>> Stashed changes
}