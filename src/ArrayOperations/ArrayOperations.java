
package ArrayOperations;

public class ArrayOperations {

    public static String[] addWord(String finalWord, String[] repeatedWords) {
        String[] words = new String[repeatedWords.length + 1];
        System.arraycopy(repeatedWords, 0, words, 0, repeatedWords.length);
        words[repeatedWords.length] = finalWord;
        return words;
    }

    public static boolean containsWord(String word, String[] repeatedWords) {
        for (String textWord : repeatedWords) {
            if (word.equals(textWord)) {
                return true;
            }
        }
        return false;
    }
    
}
