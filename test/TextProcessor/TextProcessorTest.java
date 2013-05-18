package TextProcessor;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextProcessorTest {
    
    @Test
    public void getRepeatedWordsOfOneText() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        TextProcessor textProcessor = new TextProcessor(text);
        String [] repeatedWords = textProcessor.getRepeatedWords();
        assertEquals(3, repeatedWords.length);
    }
    
    @Test
    public void getRepeatedWordsOfAnotherText() {
        String text = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        TextProcessor textProcessor = new TextProcessor(text);
        String [] repeatedWords = textProcessor.getRepeatedWords();
        assertEquals(0, repeatedWords.length);
    }
    
}
