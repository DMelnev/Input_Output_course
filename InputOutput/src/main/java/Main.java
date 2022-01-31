import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Objects;

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

        File directory = new File("fold1/fold2/fold3");
        File file1 = new File("fold1/fold2/fold3/asd.txt");
        File file2 = new File("fold1/fold2/fold3/qwe.txt");
        File file3 = new File("fold1/fold2/fold3/zxc.txt");
        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(file.getName());
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(directory.isDirectory());
        for(File file : Objects.requireNonNull(directory.listFiles((dir, name) -> name.contains("w")))){
//            for(File file : directory.listFiles((dir, name) -> name.contains("w"))){
            System.out.println(file.getAbsolutePath());
        }
    }
}


