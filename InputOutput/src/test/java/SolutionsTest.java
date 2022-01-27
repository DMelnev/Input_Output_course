import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    String[] test;
    Integer[] answer;
    Solutions solutions;

    @BeforeEach
    void setUp() {
        test = new String[]{
                "III", "IV", "IX", "LVIII", "MCMXCIV",
                "I", "V", "X", "L", "C", "D", "M",
                "MMM", "XXVII", "XL", "XC", "CD", "CM",
                "XLI", "XLVI", "XLIX"

        };
        answer = new Integer[]{
                3, 4, 9, 58, 1994,
                1, 5, 10, 50, 100, 500, 1000,
                3000, 27, 40, 90, 400, 900,
                41, 46, 49
        };
        solutions = new Solutions();
    }

    @Test
    void romanToInt() {
        for (int i = 0; i < test.length; i++) {
            assertEquals(answer[i], solutions.romanToInt(test[i]), "Error in " + (i + 1) + " element");
        }

    }
}