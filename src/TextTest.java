import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTest {



    @Test

    public void charCount () {

        TextAnalysis textChar = new TextAnalysis();
        assertEquals( 11 , textChar.charCount(5,"a text") );
        assertEquals( 0 , textChar.charCount(0,"") );
    }

    @Test
    public void wordCount  () {
        TextAnalysis textWord = new TextAnalysis();
        assertEquals( 13 , textWord.wordCount(10,"  a text    test  ") );
        assertEquals(0, textWord.wordCount(0, ""));
    }

    @Test
    public void rowCount () {

        TextAnalysis textRow = new TextAnalysis();
        assertEquals( 1 , textRow.rowCount(0) );
    }

    @Test
    public void longestWord  () {

        TextAnalysis textLWord = new TextAnalysis();
        assertEquals ("människan" , textLWord.longestWord("daglig","jag är den människan") );
        assertEquals ("människa" , textLWord.longestWord("","jag är en människa") );
        assertEquals ("människa" , textLWord.longestWord("människa", "en eld som bränner"));

    }

    @Test
    public void isStop () {
        TextAnalysis textStop = new TextAnalysis();
        assertEquals(true , textStop.notStop("a text") );

        assertEquals(false , textStop.notStop("the stop and nothing more"));
        assertEquals(false , textStop.notStop("thestopand nothing more"));
        assertEquals(false , textStop.notStop("theSTOPand nothing more"));

    }

}
