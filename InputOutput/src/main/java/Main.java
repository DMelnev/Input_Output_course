import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
////        }
//        long before = System.currentTimeMillis();
////        try (InputStream inputStream = new FileInputStream(file);) {
//
//        try (Reader reader = new InputStreamReader(new FileInputStream(file))){ //, StandardCharsets.UTF_8 - не работает!
//            StringBuilder result = new StringBuilder();
////            byte[] array = new byte[16];
//            char[] array = new char[128];
//            int count = reader.read(array);
//            while (count > 0) {
//                result.append(new String(array, 0, count));
////                result.append((char)count);
//                count = reader.read(array);
//            }
////            List<String> names = new ArrayList<>(List.of((result.toString().split(" "))));
//            String[] names = result.toString().split(" ");
////            names.stream()
//            Arrays.stream(names)
//                    .filter((n) -> n.startsWith("S"))
//                    .forEach(System.out::println);
//
////            for(String as:names){
////                System.out.println("- "+as);
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        long after = System.currentTimeMillis();
//        System.out.println(after - before);


//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 1000);
////            array[i] = i;
//        }
//        for (int i : array) System.out.print(i + " ");
//        System.out.println();
//        System.out.println(bubbleBest(array));
//
//        for (int i : array) System.out.print(i + " ");
//        System.out.println();
//        System.out.println(array.length);

//        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
//            String names = "\nBob John Nicol James Jarred Garry Pol Frodo Fil Nick Patrik Symon Serg";
//            outputStream.write(names.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Scanner input = new Scanner(System.in);
//        String a = "";
//        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
//            while (!a.equals("Выход")) {
//                outputStream.write(a.getBytes());
//                a = input.next();
//                outputStream.write("\n".getBytes());
//            }
//
//            outputStream.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        StringBuilder result = new StringBuilder();
//        char[] array = new char[32];
//        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
//            int count = reader.read(array);
//            while (count > 0) {
//                result.append(new String(array, 0, count));
////                result.append("\n");
//                count = reader.read(array);
//            }
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Scanner input = new Scanner(System.in);
        String a = "";
        int page = 0;
        int SHEET = 3;

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            while (!a.equals("stop")) {
                System.out.print("Enter page number or \"stop\": ");
                a = input.next();

                try {
                    page = Integer.parseInt(a);
                } catch (NumberFormatException e) {
                    page = 0;
                }
                System.out.println();
                randomAccessFile.seek((long) page * SHEET);
                byte[] array = new byte[SHEET];
                randomAccessFile.read(array);
                System.out.println(new String(array));

            }

//            randomAccessFile.writeBytes("**********************************");
//            randomAccessFile.seek(50);
//            randomAccessFile.writeBytes("**********************************");
//            randomAccessFile.seek(0);
//
//            randomAccessFile.read(array);
//            System.out.println(new String(array));

        } catch (Exception e) {

        }
    }

//    static int bubbleBest(int[] array) {
//        int count = 0;
//        int temp;
//        int next;
//        int element;
//        int i = 0;
//        while (i < (array.length - 1)) {
//            next = array[i + 1];
//            element = array[i];
//            if (element > next) {
//                temp = next;
//                next = array[i];
//                element = temp;
//
//            }
//            array[i] = element;
//            array[i + 1] = next;
//            count++;
//            if (i > 0 && array[i - 1] > element) {
//                i--;
//            } else i++;
//        }
//        return count;
//    }
}


