package Test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
// TEST FÖR STOP
    @Test
    void main() {
        Scanner scanner = new Scanner(System.in);

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

    }




    @Test
    void Logik3() {

    }


}
