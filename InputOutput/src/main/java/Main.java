import java.io.File;
import java.io.IOException;

/**
 * Class Main
 *
 * @author Melnev Dmitriy
 * @version 2022-
 **/

public class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.romanToInt("IIIIIIIIII"));

        File directory = new File("fold/fold/fold");
        File file = new File("fold/fold/fold/file1.txt");
        try {
            directory.mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(directory.isDirectory());
    }
}


