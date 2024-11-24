 public class TextAnalysis {


   public int charCount( int ch, String aText) {

       ch = ch + aText.length();   // count char including space
       return (ch);
    }

    public int charCountWithoutSpace( int ch1, String aText) {

       String []  aTextArray = aText.split(" ");
       int number = aTextArray.length;

         for ( int i = 0; i < number; i++) {
             ch1 = ch1 + aTextArray[i].length();
         }

         return (ch1);
    }


    public int wordCount(int wordNumber, String aText) {
       if (!aText.isEmpty()) {

           String []  aTextArray = aText.split(" ");
           int number = aTextArray.length;

           for (int i = 0; i < number; i++)  {                    // loopen är till att kontrollera att arrayelementet med nummer i
                  if ( aTextArray[i] != "")   wordNumber ++;      // är inte tomt, då räknas det med i antal orden
           }

       }
       return wordNumber;
    }


    public int rowCount(int r) {

            return r + 1;
    }

    public String longestWord(String word, String aText) {

        if (! ( word.isEmpty() && aText.isEmpty()) ) {

            int w1 = word.length();
            int w2 = 0;

            String[] aTextArray = aText.split(" ");
            int number = aTextArray.length;

            for (int i = 0; i < number; i++) {
                w2 = aTextArray[i].length();
                if (w1 < w2) {
                    w1 = w2;
                    word = aTextArray[i];
                }
            }
        } else {
            word = "--- (finns inga ord)";
        }

       return word;
    }


    public boolean notStop(String aText) {

        if (!aText.isEmpty()) {                                      // jag valde att göra koden på det viset i fall det kommer saknas mellanrum
                                                                     // på sidor av ordet "stop"
            for (int i = 0; i < (aText.length() - 3); i++) {         // och i fall man skriver "STOP"

                if ((aText.charAt(i) == 's') & (aText.charAt(i + 1) == 't') & (aText.charAt(i + 2) == 'o') & (aText.charAt(i + 3) == 'p')) {
                    return false;
                }

                if ((aText.charAt(i) == 'S') & (aText.charAt(i + 1) == 'T') & (aText.charAt(i + 2) == 'O') & (aText.charAt(i + 3) == 'P')) {
                    return false;
                }

            }
        }
        return true;

    }

}



