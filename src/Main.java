import java.util.Scanner;
// dett är klasen som ta emot input andra klassen är till för att räkna raderna
class User{
    static Scanner scanner = new Scanner(System.in);

    static String x2 = scanner.nextLine();

}

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("skiv in text rad för rad. skiv stop för att avsluta.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }
        User myObj = new User();
        System.out.println(User.x2);
        line_counter_class ob= new line_counter_class();
        scanner.close();
    }


}