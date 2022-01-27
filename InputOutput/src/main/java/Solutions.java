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
    String next;
    String point;

    public int romanToInt(String s) {

        int result = 0;
        if (s.length() > 1) {
            next = s.substring(0,s.length()-1);
            point = s.substring(s.length() - 1);
        } else if (s.length() == 1) {
            next = "";
            point = s;
        } else return 0;
        System.out.println("point = " + point + "\n" + "next = " + next);

        if (point.equals("M")) {
            result = 1000;
            D = false;
            M = true;
        }
        if (point.equals("D")) {
            result = 500;
            D = true;
            C = false;
        }
        if (point.equals("C")) {
            result = (D || M) ? -100 : 100;
            L = false;
            C = true;
        }
        if (point.equals("L")) {
            result += 50;
            L = true;
            X = false;
        }
        if (point.equals("X")) {
            result = (L || C) ? -10 : 10;
            V = false;
            X = true;
        }
        if (point.equals("V")) {
            result = 5;
            V = true;
        }
        if (point.equals("I")) {
            result = (V || X) ? -1 : 1;
        }
        return (result + romanToInt(next));
    }

}
