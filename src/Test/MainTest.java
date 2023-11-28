package Test;

import org.junit.jupiter.api.Test;

class MainTest {
    private  int lineCount = 0;
    private  int characterCount = 0;



    // TEST FÖR STOP
    @Test
    void main() {


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
    void main2() {


        System.out.println("Statistik:");

        System.out.println("Antal rader: " );
        System.out.println("Antal tecken: " );


    }







    @Test
    public int getLineCount() {
        return lineCount;

    }

    @Test
    public int getCharacterCount() {
        return characterCount;

    }


    @Test
    public  void updateStatistics() {

       var test = new updateStatistics();



    }

}
