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
        String next;
        String point;
        Integer sum = 0;
        if (s.length() > 0) {
            next = s.substring(0, s.length() - 1);
            point = s.substring(s.length() - 1);
        } else {
            return 0;
        }

        switch (point) {
            case "M":
                sum += 1000;
                D = false;
                M = true;
            case "D":
                sum += 500;
                D = true;
                C = false;
            case "C":
                sum += (D || M) ? -100 : 100;
                L = false;
                C = true;
            case "L":
                sum += 50;
                L = true;
                X = false;
            case "X":
                sum += (L || C) ? -10 : 10;
                V = false;
                X = true;
            case "V":
                sum += 5;
                V = true;
            case "I":
                sum += (V || X) ? -1 : 1;
        }
        return sum + romanToInt(next);
    }

}
