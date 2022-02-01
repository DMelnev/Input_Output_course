import java.io.*;
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

//        File directory = new File("fold1/fold2/fold3");
//        File file1 = new File("fold1/fold2/fold3/asd.txt");
//        File file2 = new File("fold1/fold2/fold3/qwe.txt");
//        File file3 = new File("fold1/fold2/fold3/zxc.txt");
//        try {
//            directory.mkdirs();
//            file1.createNewFile();
//            file2.createNewFile();
//            file3.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        System.out.println(file.getName());
////        System.out.println(file.exists());
////        System.out.println(file.isFile());
////        System.out.println(directory.isDirectory());
//        for(File file : Objects.requireNonNull(directory.listFiles((dir, name) -> name.contains("w")))){
////            for(File file : directory.listFiles((dir, name) -> name.contains("w"))){
//            System.out.println(file.getAbsolutePath());
//        }

        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new FileInputStream(file);) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        for (int i : array) System.out.print(i + " ");
        System.out.println();
        System.out.println(bubleBest(array));

        for (int i : array) System.out.print(i + " ");
        System.out.println();
        System.out.println(array.length);

    }

    static int bubleBest(int[] array) {
        int count = 0;
        int temp;
        int next;
        int element;
        int i =0;
//        for (int j = 0; j < 1; j++) {
            while (i < (array.length - 1)) {
                next = array[i + 1];
                element = array[i];
                if (element >= next) {
                    temp = next;
                    next = array[i];
                    element = temp;
                }
                array[i] = element;
                array[i + 1] = next;
                count++;
                if (i > 0 && array[i - 1] > element) {
                    i--;
                }else i++;
            }
//        }
        return count;
    }
}


