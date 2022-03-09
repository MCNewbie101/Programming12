package WordCounter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/*
 * Counts # of unique words in string.
 */

public class WordCounter {
    private HashSet words = new HashSet();

    public WordCounter() {

    }

    public WordCounter(String text) {
        String[] words = text.split(" ");
        for (String s : words) {
            String word = stripWord(s);
            if (!word.equals("")) {
                this.words.add(word);
            }
        }
    }

    /*
     * Get rid of punctuation and make all letters lower case.
     */
    public String stripWord(String word) {
        StringBuilder baseWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                baseWord.append((char) (word.charAt(i) + 32));
            } else if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                baseWord.append(word.charAt(i));
            }
        }
        return baseWord.toString();
    }

    /*
     * Return number of unique words.
     */
    public int wordCount() {
        return words.size();
    }

    /*
     * Add more possible words to a set of unique words.
     */
    public void addWords(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = stripWord(words[i]);
            if (!word.equals("")) {
                this.words.add(word);
            }
        }
    }
}
