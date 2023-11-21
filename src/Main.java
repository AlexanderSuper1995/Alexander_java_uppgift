
public class Main {
    public static void main(String[] args) {


        Counter myObj2 = new Counter();
        User input = new User();
// skapa så att när man skiver stop stängs progravmet av med loop och break
     //   while (true) {

       //     if (input.equalsIgnoreCase("stop")) {
       //         break;
      //      }
        String userInput = input.getUserInput();
        // Skriv ut användarens input
        System.out.println("Du skrev: " + input);
    }
}