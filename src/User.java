import java.util.Scanner;

public class User {
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in något: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
