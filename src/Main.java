import java.util.Scanner;
// dett är klasen som ta emot input andra klassen är till för att räkna raderna
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
        line_counter_class ob= new line_counter_class();
        System.out.println(line_counter_class.x);
        scanner.close();
    }


}