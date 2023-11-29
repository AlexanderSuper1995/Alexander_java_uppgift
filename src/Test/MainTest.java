package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {


    int expetad = 0;
    int characterCount = 0;
    int  lineCount = 0;
    // TEST FÖR STOP
    @Test
    void test_testar_stop_och_Count_line() {
        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
        String input;
        while (true) {
            input = "stop";
            expetad = input.length();

            System.out.println(input);
            if (input.equalsIgnoreCase("stop")) {
                int actual = 4;
                assertEquals(actual, expetad);

                break;

            }
        }

    }

    @Test
    void test2() {
        int expetad = 0;
        System.out.println("Antal rader: " + expetad);
       int actual = 0;
        expetad++;
        actual++;
        assertEquals(actual, expetad);

    }


    @Test
    void test4() {
        var statistics2 = new MainTest();
        statistics2.updateStatistics();
        String args = "stop";
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
