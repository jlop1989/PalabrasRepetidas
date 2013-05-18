package TextProcessor;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultipleTextProcessorTest {
    
    @Test
    public void getRepeatedWorsOfTwoDifferentTexts(){
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        
        MultipleTextProcessor multipleTextProcessor = new MultipleTextProcessor(text,text2);
        String [] repeatedWords = multipleTextProcessor.getRepeatedWords();
        assertEquals(8, repeatedWords.length);
        
    }
    
    @Test
    public void getRepeatedWorsOfTwoDifferentTextswithNumbers(){
        String text = "en2 un lugar1 de la Mancha, 3 de cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en1 mi lugar1, no 3 tengo mucho tiempo para acordarme de tu nombre";
        
        MultipleTextProcessor multipleTextProcessor = new MultipleTextProcessor(text,text2);
        String [] repeatedWords = multipleTextProcessor.getRepeatedWords();
        assertEquals(8, repeatedWords.length);
        
    }
    
    @Test
    public void getRepeatedWorsOfTwoDifferentTextswithNumbersandInterrogationSigns(){
        String text = "en2 un lugar1 de? la Mancha, 3 de?? cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en1 mi lugar1, no 3 tengo mucho tiempo para acordarme de tu nombre";
        
        MultipleTextProcessor multipleTextProcessor = new MultipleTextProcessor(text,text2);
        String [] repeatedWords = multipleTextProcessor.getRepeatedWords();
        assertEquals(8, repeatedWords.length);   
    }
    
    @Test
    public void getRepeatedWorsOfTwoDifferentTextswithNumbersandInterjectionSigns(){
        String text = "en2 un lugar1 de?! la Mancha, 3 ¿de! cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en1 mi lugar1, no 3 tengo mucho tiempo para acordarme de¡ tu nombre";
        
        MultipleTextProcessor multipleTextProcessor = new MultipleTextProcessor(text,text2);
        String [] repeatedWords = multipleTextProcessor.getRepeatedWords();
        assertEquals(8, repeatedWords.length);   
    }
}
