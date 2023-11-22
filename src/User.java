import java.util.Scanner;
public class User {
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange en text: ");
        return scanner.nextLine();
    }
}