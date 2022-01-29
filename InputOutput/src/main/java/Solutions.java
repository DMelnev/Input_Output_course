import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Class Solutions
 *
 * @author Melnev Dmitriy
 * @version 2022-
 **/

class Solutions {
    private boolean V = false;
    private boolean X = false;
    private boolean L = false;
    private boolean C = false;
    private boolean D = false;
    private boolean M = false;

    public int romanToInt(String s) {
        char point;
        String next;

        int len = s.length();
        int result = 0;
        if (len > 1) {
            next = s.substring(0, len - 1);
            point = s.charAt(len - 1);
        } else if (len == 1) {
            next = "";
            point = s.charAt(0);
        } else {
            V = false;
            X = false;
            L = false;
            C = false;
            D = false;
            M = false;
            return 0;
        }

        switch (point) {
            case 'M' -> {
                result = 1000;
                D = false;
                M = true;
            }
            case 'D' -> {
                result = 500;
                D = true;
                C = false;
            }
            case 'C' -> {
                result = (D || M) ? -100 : 100;
                L = false;
                C = true;
            }
            case 'L' -> {
                result = 50;
                L = true;
                X = false;
            }
            case 'X' -> {
                result = (L || C) ? -10 : 10;
                V = false;
                X = true;
            }
            case 'V' -> {
                result = 5;
                V = true;
            }
            case 'I' -> result = (V || X) ? -1 : 1;
        }
        return (result + romanToInt(next));
    }
}

class Solution {
    public int romanToInt(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (String st : s.split("")) {
            list.add(0, st.charAt(0));
        }
        for (char st : list) {
            result += (map.get(st) >= (result - (2 * map.get(st)))) ? map.get(st) : -map.get(st);
            System.out.println(st + " " + result + " " + ((map.get(st) >= (result - (2 * map.get(st)))) ? map.get(st) : -map.get(st)));
        }
        return result;
    }
}
