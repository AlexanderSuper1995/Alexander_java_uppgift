import java.util.Scanner;

public class User
{
    public String getUserInput() {

  System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
  System.out.print("Skriv in något: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       scanner.nextLine();
      scanner.close();
        return input;


        }

    }


