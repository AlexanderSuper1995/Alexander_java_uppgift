public class logik {
    public logik() {
        int argsCount = 0;
        int characterCount = 0;
    }public void antalTecken2(String args) {
        int argsCount;
        // Lägg till längden av "args", även inklusive "stop"
        int characterCount = args.length();
    }
    static int antalTecken(String args) {
        // först måste kunna skiva ut det kan jag men det vill inte göra .length()); klart men  inte 100
        String args1 = args;
        int antalTecken;
        int summan = 0;
        antalTecken = args1.length();

        antalTecken = antalTecken + summan;
        return antalTecken;
    }
    public int getLineCount(int argsCount) {
        return argsCount;
    }

    public int getCharacterCount(int characterCount) {
        return characterCount;
    }

}