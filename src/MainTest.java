import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    int maxNum = Integer.MAX_VALUE;
    int minNum = Integer.MIN_VALUE;

    @Test
    void test_1() {
        Main main = new Main();
        String string = "apple";
        int size = 2;
        String expectedOutput = "ap, pl, e";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_2() {
        Main main = new Main();
        String string = "@pple";
        int size = 2;
        String expectedOutput = "@p, pl, e";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_3() {
        Main main = new Main();
        String string = "";
        int size = 0;
        String expectedOutput = "";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_4() {
        Main main = new Main();
        String string = "\\t\\n\\r\\c";
        int size = 2;
        String expectedOutput = "\\t, \\n, \\r, \\c";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_5() {
        Main main = new Main();
        String string = "12345";
        int size = 2;
        String expectedOutput = "12, 23, 45";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_6() {
        Main main = new Main();
        String string = "1.2932";
        int size = 2;
        String expectedOutput = "1., 29, 32";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_7() {
        Main main = new Main();
        String string = null;
        int size = 2;
        String expectedOutput = "0";

        String actualOutput = main.split(string, size);
        System.out.println("actualOutput " + actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_8() {
        Main main = new Main();

        String string = "2147483648";
        int size = 0;
        String expectedOutput = "2147483648";

        String actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_9() {
        Main main = new Main();
        String string = "2147483646";
        int size = 0;
        String expectedOutput = "2147483646";

        String actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_10() {
        Main main = new Main();
        String string = "2147483648";
        int size = 2;
        String expectedOutput = "21, 47, 48, 36, 48";

        String actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_11() {
        Main main = new Main();
        String string = "2147483646";
        int size = 2;
        String expectedOutput = "21, 47, 48, 36, 46";

        String actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_12() {
        Main main = new Main();
        String string = "dog";
        int size = 10;
        String expectedOutput = "dog";

        String actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_13() {
        Main main = new Main();
        String word = "word";
        word.substring(3);
        int size = 2;
        String expectedOutput = "d";

        String actualOutput = main.split(word, size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_14() {
        Main main = new Main();
        String string = "apple";
        String expectedOutput = "error";

        String actualOutput = main.split(string, maxNum+1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_15() {
        Main main = new Main();
        String string = "apple";
        String expectedOutput = "error";

        String actualOutput = main.split(string, minNum-1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_16() {
        Main main = new Main();
        String string = "(2^31)-1";
        String expectedOutput = "error";

        String actualOutput = main.split(string, minNum+1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_17() {
        Main main = new Main();
        String string = "(2^31)+1";
        String expectedOutput = "error";

        String actualOutput = main.split(string, 0);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_18() {
        Main main = new Main();
        String string = "";
        String expectedOutput = "";

        String actualOutput = main.split(string, 0);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_19() {
        Main main = new Main();
        String string = "";
        String expectedOutput = "";

        String actualOutput = main.split(string, 2);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_20() {
        Main main = new Main();
        String string = "apple";
        String expectedOutput = "error";

        String actualOutput = main.split(string, -1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Disabled
    @Test
    void test_21() {
        Main main = new Main();

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                string.append('a');
            } catch (Throwable e) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(string.toString().length());

        int size = 0;
        String expectedOutput = "0";

        String actualOutput = main.split(string.toString(), size);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_22() {
        Main main = new Main();
        String string = "null";
        String expectedOutput = "error";

        String actualOutput = main.split(string, Integer.parseInt(null));
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_23() {
        Main main = new Main();
        String string = "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00"; // 4 emojis
        String expectedOutput = "\uD83D\uDE00\uD83D\uDE00,\uD83D\uDE00 \uD83D\uDE00";

        String actualOutput = main.split(string, 2);
        assertEquals(expectedOutput, actualOutput);
    }
    /*
    @Test
    void test_24() {
        Main main = new Main();
        String string = "\uD83D\uDE00\uD83D\uDE00"; // emojis
        String expectedOutput = "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00 " +
                "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00," +
                "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00 " +
                "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00";

        String actualOutput = main.split(string, 😀😀);
        assertEquals(expectedOutput, actualOutput);
    }
    */
    @Test
    void test_25() {
        Main main = new Main();
        String string = "apple";
        String expectedOutput = "error";

        String actualOutput = main.split(string, 0xffff);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_26() {
        Main main = new Main();
        String string = "0xffff";
        String expectedOutput = "error";

        String actualOutput = main.split(string, 0xffff);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_27() {
        Main main = new Main();
        String string = "a";
        String expectedOutput = "a";

        String actualOutput = main.split(string, 1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_28() {
        Main main = new Main();
        String string = "最近の更新新";
        String expectedOutput = "最近, の更, 新新";

        String actualOutput = main.split(string, 2);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_29() {
        Main main = new Main();
        String string = "car\\ntable";
        String expectedOutput = "error";

        String actualOutput = main.split(string, 2);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_30() {
        Main main = new Main();
        String string = "null";
        String expectedOutput = "error";

        String actualOutput = main.split(string, 1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_31() {
        Main main = new Main();
        String string = "null";
        String expectedOutput = "error";

        String actualOutput = main.split(string, -1);
        assertEquals(expectedOutput, actualOutput);
    }
}