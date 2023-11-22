
public class Main {
    public static void main(String[] args) {
// skapa en klas som skiver ut och hantar input fron en klss  som heter user
        User objet = new User();
        Count objetCount = new Count();
        while (true) {
            // Anropa metoden för att få getUserInput
            String userInput = User.getUserInput();

            // Kontrollera om User vill avsluta programmet
            if (userInput.equalsIgnoreCase("stop")) {
                System.out.println("Programmet avslutas.");
                break;
            }


            User userObj = new User();
        Count outputClass = new Count();

        // Anropa metoden för att få user input
        String User = userObj.getUserInput();

        // Anropa metoden för att skriva ut user input
        outputClass.printUserInput(userInput);

        // skapa sen en klass som räknar radderna även när man Skriver stopp
        //när andvänden skriver stopp ska programet stängas av men ordet  "Stop" ska även räkas med

        // alt är klart ska jag skiva tester
    }
}}