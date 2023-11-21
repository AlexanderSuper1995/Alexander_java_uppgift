
public class Main {
    public static void main(String[] args) {

// skapa en klass som tar emot user data
        Counter myObj2 = new Counter();
        User input = new User();

        String userInput = input.getUserInput();
        // Skriv ut användarens input
        System.out.println("Du skrev: " + input);
    }
}