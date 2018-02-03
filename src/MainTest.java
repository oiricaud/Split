import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    int maxNum = Integer.MAX_VALUE;
    int minNum = Integer.MIN_VALUE;

    @Test
    void test_1() {
        Main main = new Main();
        String string = "a";
        int size = 1;
        String[] expectedOutput = new String[]{"a"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_2() {
        Main main = new Main();
        String string = "a";
        int size = 1;
        String[] expectedOutput = new String[]{"a", "a"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
        assertEquals(expectedOutput[1], actualOutput[1]);
    }

    @Test
    void test_3() {
        Main main = new Main();
        String string = "最近の更新新";
        int size = 2;
        String[] expectedOutput = new String[]{"最近", "の更", "新新"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
        assertEquals(expectedOutput[1], actualOutput[1]);
    }

    @Test
    void test_4() {
        Main main = new Main();
        String string = "@pple";
        int size = 2;
        String[] expectedOutput = new String[]{"@p", "pl", "le"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
        assertEquals(expectedOutput[1], actualOutput[1]);
        assertEquals(expectedOutput[2], actualOutput[2]);
    }

    @Test
    void test_5() {
        Main main = new Main();
        String string = "(2^31)-1";
        int size = maxNum + 1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
    }

    @Test
    void test_6() {
        Main main = new Main();
        String string = "(2^31)+1";
        int size = 0;
        String[] expectedOutput = new String[]{"(2^31)-1"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_7() {
        Main main = new Main();
        String string = "dog";
        int size = 10;
        String[] expectedOutput = new String[]{"dog"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_8() {
        Main main = new Main();

        String string = "d0g";
        int size = 10;
        String[] expectedOutput = new String[]{"dog"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_9() {
        Main main = new Main();

        String string = "d0g";
        int size = -1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_10() {
        Main main = new Main();
        String string = "apple";
        int size = 0xffff;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_11() {
        Main main = new Main();
        String string = "apple";
        int size = maxNum + 1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_12() {
        Main main = new Main();
        String string = "apple";
        int size = minNum - 1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_13() {
        Main main = new Main();
        String string = "";
        int size = 0;
        String[] expectedOutput = new String[]{""};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_14() {
        Main main = new Main();
        String string = "a\\tp\\np\\rl\\ce";
        int size = 0;
        String[] expectedOutput = new String[]{"a't\'", "p'n\'", "p'r\'", "e'c\'"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test_15() {
        Main main = new Main();
        String[] array = new String[100];
        String numbers = "";
        for (int a = 1; a < array.length; a++) {
            numbers = numbers + a + " ";
        }
        int size = 0;

        String[] actualOutput = main.split(numbers, size);
        for (int i = 0; i < array.length; i++) {
            assertEquals(String.valueOf(i + 1), actualOutput[i]);
        }
    }

    @Test
    void test_16() {
        Main main = new Main();
        float floatingnNum = 1.2932f;
        int size = maxNum + 2;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(String.valueOf(floatingnNum), size);
        assertEquals(expectedOutput[0], actualOutput[0]);

    }

    @Test
    void test_17() {
        Main main = new Main();
        String string = null;
        int size = 2;
        String[] expectedOutput = new String[]{"0"};

        String[] actualOutput = main.split(string, size);
        assertEquals(expectedOutput[0], actualOutput[0]);

    }

    @Test
    void test_18() {
        Main main = new Main();
        long num = new Long("2147483648");
        int size = 0;
        String[] expectedOutput = new String[]{"2147483648"};

        String[] actualOutput = main.split(String.valueOf(num), size);
        assertEquals(expectedOutput[0], actualOutput[0]);

    }

    @Test
    void test_19() {
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
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(String.valueOf(string), size);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_20() {
        Main main = new Main();
        String nullString = null;
        int size = Integer.parseInt(null);
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(nullString, size);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }

    @Test
    void test_21() {
        Main main = new Main();
        String emoji = "\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00";
        int size = Integer.parseInt(null);
        String[] expectedOutput = new String[]{"\uD83D\uDE00", "\uD83D\uDE00", "\uD83D\uDE00", "\uD83D\uDE00"};

        String[] actualOutput = main.split(emoji, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test_22() {
        Main main = new Main();
        String string = "car\\ntable";
        int size = 2;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_23() {
        Main main = new Main();
        String string = null;
        int size = 1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_24() {
        Main main = new Main();
        String string = null;
        int size = -1;
        String[] expectedOutput = new String[]{"error"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_25() {
        Main main = new Main();
        double doubleDouble = 2.0000;
        int size = 2;
        String[] expectedOutput = new String[]{"2.", "00", "00"};

        String[] actualOutput = main.split(String.valueOf(doubleDouble), size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_26() {
        Main main = new Main();
        double doubleDouble = -2.0000;
        int size = 2;
        String[] expectedOutput = new String[]{"-2", ".0", "00", "0"};

        String[] actualOutput = main.split(String.valueOf(doubleDouble), size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_27() {
        Main main = new Main();
        String string = "U+0041U+0041 U+0041U+0041";
        int size = 2;
        String[] expectedOutput = new String[]{"aa", "aa"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_28() {
        Main main = new Main();
        String string = "U+0041U+0041 U+0041U+0041";
        int size = 0;
        String[] expectedOutput = new String[]{"aaaa"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_29() {
        Main main = new Main();
        String string = "U+0041U+0041 U+0041U+0041";
        int size = -1;
        String[] expectedOutput = new String[]{"invalid"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
    @Test
    void test_30() {
        Main main = new Main();
        String string = "U+0041pple";
        int size = -1;
        String[] expectedOutput = new String[]{"ap", "pp", "le"};

        String[] actualOutput = main.split(string, size);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}