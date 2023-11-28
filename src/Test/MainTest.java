package Test;

import org.junit.jupiter.api.Test;

class MainTest {
    int characterCount = 0;
    int  lineCount = 0;
    String args = "hej";
    // TEST FÖR STOP
    @Test
    void test1() {
        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
        while (true) {
            String input = "stop";
            System.out.println(input);
            if (input.equalsIgnoreCase("stop")) {
                 break;
            }
        }

    }

    @Test
    void test2() {
        lineCount++;
        lineCount++;
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



    }

}
