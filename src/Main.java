import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int antalRader = 0;
int antalTecken =0;
System.out.println("skiv in text rad för rad. skiv stop för att avsluta.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            antalRader++;
            antalTecken += input.length();
            System.out.println("Du skrev men för att avsluta skiv Stop: " + input);
            System.out.println("Antal rader (exklusive 'stop'): " + antalRader);
            System.out.println("Antal tecken (exklusive 'stop'): " + antalTecken);
        }


        scanner.close();

    }


}