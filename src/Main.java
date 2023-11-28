import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        simpel_logik statistics2 = new simpel_logik();
        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            String input = scanner.nextLine();
            statistics2.updateStatistics(input);
            statistics2.lineCount();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }

        System.out.println("Statistik:");
        System.out.println("Antal rader: " + statistics2.lineCount);
        System.out.println("Antal tecken: " + statistics2.characterCount);
        scanner.close();
    }
}