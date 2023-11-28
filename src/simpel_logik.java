public class simpel_logik {

   int characterCount = 0;
   int  lineCount = 0;
        public void updateStatistics(String args) {

            lineCount++;
            characterCount = characterCount + args.length();

        }
    public void lineCount(String args) {

        lineCount++;


    }

}
