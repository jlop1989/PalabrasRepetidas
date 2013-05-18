
package Operations;

import TextProcessor.MultipleTextProcessor;

public class Operations {
    private final static String [] interjectionSigns = {",",";",".","?","¿","¡","!"};
    
    public static String[] addWord(String finalWord, String[] repeatedWords) {
        String[] words = new String[repeatedWords.length + 1];
        System.arraycopy(repeatedWords, 0, words, 0, repeatedWords.length);
        words[repeatedWords.length] = finalWord;
        return words;
    }

    public static boolean containsWord(String word, String[] repeatedWords) {
        for (String textWord : repeatedWords) {
            if (word.equals(cleanWord(textWord))) {
                return true;
            }
        }
        return false;
    }

    public static String cleanWord(String word) {
        String finalWord = word;
        for (String sign : interjectionSigns) {
            finalWord = finalWord.replace(sign, "");
        }
        return finalWord;
    }
    
}
