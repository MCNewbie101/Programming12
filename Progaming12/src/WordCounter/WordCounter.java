package WordCounter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class WordCounter {
    private HashSet words = new HashSet();

    public WordCounter() {

    }

    public WordCounter(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = stripWord(words[i]);
            if (!word.equals("")) {
                this.words.add(word);
            }
        }
    }

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

    public int wordCount() {
        return words.size();
    }

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
