import java.util.Scanner;
public class User {
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("om du vill stänga av programet skiv stop: ");
        // to do skriv när man skiver stop hantar det här

        return scanner.nextLine();


    }
}