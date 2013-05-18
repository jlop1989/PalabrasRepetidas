
package TextProcessor;

import Operations.Operations;

public class MultipleTextProcessor {
    private String text1, text2;

    public MultipleTextProcessor(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }
    
    public String [] getRepeatedWords(){
        String [] repeatedWords= new String [0];
        String [] text1Words = text1.split(" ");
        String [] text2Words = text2.split(" ");
        for(String word :text1Words){
            String finalWord = Operations.cleanWord(word);
            if(Operations.containsWord(finalWord, text2Words)&&!Operations.containsWord(finalWord, repeatedWords))
                repeatedWords= Operations.addWord(finalWord, repeatedWords);
        }
        return repeatedWords;
    }

}
