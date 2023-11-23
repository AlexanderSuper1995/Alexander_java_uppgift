import java.util.Scanner;
public class User2 {
    static Scanner scanner;
int x = 10;
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public User2() {
        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
        scanner = new Scanner(System.in);
         while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println(input);
            scanner.nextLine();
        }

        scanner.close();

    }
}
