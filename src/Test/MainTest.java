package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    int characterCount = 0;
    int  lineCount = 0;
    String args = "stop";
    // TEST FÖR STOP
    @Test
    void test1() {
        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
        String input;
        while (true) {
            input = "stop";
            System.out.println(input);
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }
        int actual = 4;
        int expetad = 0;
        expetad = input.length();
        assertEquals(actual, expetad);

    }

    @Test
    void test2() {
        lineCount++;

        System.out.println("Antal rader: " + lineCount);


    }

    @Test
    void test3() {
        characterCount = characterCount + args.length();
        System.out.println("Antal rader: " + args.length());



    }
    @Test
    void test4() {
        var statistics2 = new MainTest();

        statistics2.updateStatistics();
        characterCount = characterCount + args.length();

        lineCount++;

        int actual = 1;
        assertEquals(actual,lineCount);    }
    @Test
    public void updateStatistics() {
        String args =  "hej";
        int   antal_tecen = args.length();
        int actual = 3;
        assertEquals(actual,antal_tecen);


    }
    @Test
    public void test_lineCount() {
        lineCount++;
        int actual =0;
         actual++;
        assertEquals(actual,lineCount);
    }
}
