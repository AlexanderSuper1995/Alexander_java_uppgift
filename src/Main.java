import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("skiv in text rad för rad. skiv stop för att avsluta.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("Du skrev men för att avsluta skiv Stop: " + input);
        }

        scanner.close();

    }


}