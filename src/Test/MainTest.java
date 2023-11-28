package Test;

import org.junit.jupiter.api.Test;

class MainTest {

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

    }



}
