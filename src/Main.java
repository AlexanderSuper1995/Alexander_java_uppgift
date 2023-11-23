
public class Main {
    public static void main(String[] args) {

        while (true) {
            // Anropa metoden för att få getUserInput
            String userInput = User.getUserInput();

            // Kontrollera om User vill avsluta programmet
            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

    }
}}