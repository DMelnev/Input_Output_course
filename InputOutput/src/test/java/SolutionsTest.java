import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    String[] test;
    Integer[] answer;
    Solutions solutions;
    Solution solution;

    @BeforeEach
    void setUp() {
        test = new String[]{
                "LVIII","III", "IV", "IX",  "MCMXCIV",
                "I", "V", "X", "L", "C", "D", "M",
                "MMM", "XXVII", "XL", "XC", "CD", "CM",
                "XLI", "XLVI", "XLIX", "MDCCCLXXXIV", "IIIIIIIIII"

        };
        answer = new Integer[]{
                58, 3, 4, 9, 1994,
                1, 5, 10, 50, 100, 500, 1000,
                3000, 27, 40, 90, 400, 900,
                41, 46, 49, 1884, 10
        };
    }

    @Test
    void romanToInt() {
        for (int i = 0; i < test.length; i++) {
            solutions = new Solutions();
            assertEquals(answer[i], solutions.romanToInt(test[i]), "Error in " + (i) + " element");
        }

    }
    @Test
    void roman2(){
        for (int i = 0; i < test.length; i++) {
            solution = new Solution();
            assertEquals(answer[i], solution.romanToInt(test[i]), "Error2 in " + (i) + " element");
        }
    }
}