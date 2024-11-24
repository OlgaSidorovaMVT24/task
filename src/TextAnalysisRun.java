import java.util.Scanner;

public class TextAnalysisRun {
    public static void main(String[] args) {

        System.out.println("Skriv in text, avsluta rad med 'enter'");
        System.out.println("Skriv 'stop' och tryck 'enter' när du vill avsluta skriva in texten");
        System.out.println("OBS! Raden med ordet 'stop' kommer gå förlorat.");
        System.out.println("Skriv hellre 'stop' på en ny rad för att undvika det." );

        Scanner scan = new Scanner(System.in);
        TextAnalysis textAnalysis = new TextAnalysis();

       // boolean stop = true;
        String text = "";
        int countRow = 0;
        int countChar = 0, countCharWithoutSpace = 0;
        int countWord = 0;
        String theLongestWord = "";


        while ( textAnalysis.notStop(text)) {            // anropa metoden i objektet textAnalysis av klassen TextAnalysis som kontrollerar om man skrivit ordet "stop"
                                                         // metoden returnerar true om fallet inte är så
             text = scan.nextLine();
             if ( !(textAnalysis.notStop(text)) ) break;   // om det finns "stop" då ska loopen avslutas

            countChar = textAnalysis.charCount(countChar, text);      //  anropa metoden charCount i objektet textAnalysis av klassen TaxtAnalysis - räkna antal tecken

            countCharWithoutSpace = textAnalysis.charCountWithoutSpace(countCharWithoutSpace, text);

            countRow = textAnalysis.rowCount(countRow);              // anropa metoden i objektet textAnalysis av klassen Text Analysis som räknar antal rader

            countWord = textAnalysis.wordCount(countWord, text);     // anropa metoden i objektet textAnalysis av klassen TextAnalysis som räknar antal ord

            theLongestWord = textAnalysis.longestWord(theLongestWord, text);      // anropa metoden i objektet textAnalysis av klassen TextAnalysis som har koll på det längsta ordet

        }

        System.out.println("Antal tecken i texten är " + countChar);
        System.out.println("Antal tecken i texten utan mellanrum är " + countCharWithoutSpace);
        System.out.println("Antal rader i texten är " + countRow);
        System.out.println("Antal ord i texten är " + countWord);
        System.out.println("Längsta ordet i texten är " + theLongestWord);

    }
}
