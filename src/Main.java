
public class Main {
    public static void main(String[] args) {

// skapa en klass som tar emot user data
        // Skapa en klas som skiver ut från  USER klass
        Counter myObj2 = new Counter();
        User input = new User();

        // Använd UserInputHandler för att få användarens input
        String userInput = input.getUserInput();

        // Skriv ut användarens input
        System.out.println("Du skrev: " + input);
    }
}