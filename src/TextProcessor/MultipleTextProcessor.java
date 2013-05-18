
package TextProcessor;

import ArrayOperations.ArrayOperations;

public class MultipleTextProcessor {
    
    private String text1, text2;

    public MultipleTextProcessor(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }
    
    public String [] getRepeatedWords(){
        String [] repeatedWords= new String [0];
        String [] text1Words = new TextProcessor(text1).getRepeatedWords();
        String [] text2Words = new TextProcessor(text2).getRepeatedWords();
        for(String word :text1Words)
            if(ArrayOperations.containsWord(word, text2Words))
                repeatedWords= ArrayOperations.addWord(word, repeatedWords);
        return repeatedWords;
    }

}
