public class logik  {
   private int lineCount = 0;
   private int characterCount = 0;


 public int getLineCount() {
     return lineCount;
  }

   public int getCharacterCount() {
    return characterCount;
    }
    public void updateStatistics(String args) {
        lineCount++;
        characterCount += args.length();


    }

}
