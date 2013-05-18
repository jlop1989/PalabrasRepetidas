
package TextProcessor;

public class TextProcessor {
    
    private String textforProcessing;
    private final static String [] interjectionSigns = {",",";","."};

    public TextProcessor(String textforProcessing) {
        this.textforProcessing = textforProcessing;
    }
    public String [] getRepeatedWords(){
        String [] repeatedWords= new String [0];
        for(String word : textforProcessing.split(" ")){
            if(isRepeatedWord(word)&& !containsWord(word,repeatedWords)){
                String finalWord = cleanWord(word);
                repeatedWords=addWord(finalWord,repeatedWords);
            }
            
        }
        return repeatedWords;
    }

    private String cleanWord(String word) {
        String finalWord=word;
        for(String sign : interjectionSigns)
            finalWord=finalWord.replace(sign, "");
        return finalWord;
    }

    private boolean isRepeatedWord(String word) {
        int count =0;
        for(String textWord : textforProcessing.split(" "))
            if(word.equals(textWord)) count++;
        return count>1;
    }

    private String [] addWord(String finalWord, String[] repeatedWords) {
        String []words = new String[repeatedWords.length+1];
        System.arraycopy(repeatedWords, 0, words, 0, repeatedWords.length);
        words[repeatedWords.length]=finalWord;
        return words;
    }

    private boolean containsWord(String word, String[] repeatedWords) {
        for(String textWord : repeatedWords)
            if(word.equals(textWord))return true;
        return false;
    }
}
