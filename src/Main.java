import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        int antalRader = 0;
        int antalTecken = 0;


        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                antalRader++;
                antalTecken = antalTecken + input.length();

                break;
            }

        }

        System.out.println("Programmet har avslutats.");
        System.out.println("Antal rader (exklusive 'stop'): " + antalRader);
        System.out.println("Antal tecken (exklusive 'stop'): " + antalTecken);

        scanner.close();
    }

}