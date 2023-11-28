import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logik statistics = new logik();



        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            String input = scanner.nextLine();
            statistics.updateStatistics(input);
            System.out.println(input);

            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }

        // lägg tilll en print metod

        // skapa  en enkle matte metod för alla varka ha det som empel for skiva tester
        System.out.println("Statistik:");
       System.out.println("Antal rader: " + statistics.getLineCount());
         System.out.println("Antal tecken: " + statistics.getCharacterCount());
        scanner.close();
    }
}