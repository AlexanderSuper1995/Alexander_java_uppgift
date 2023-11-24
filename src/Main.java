import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
           String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println(logik.antalTecken(input));
                break;

            }


            System.out.println(input);
            System.out.println("Programmet har avslutats.");
         //   System.out.println("Antal rader (exklusive 'stop'): " + logik.antal_raderna(input));
            System.out.println(logik.antalTecken(input));

        }

        System.out.println("Programmet har avslutats.");

    }

}