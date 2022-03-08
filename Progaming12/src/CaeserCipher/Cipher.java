package CaeserCipher;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cipher {
    HashMap<Character, Character> alphabet;

    public Cipher(int shift) {
        generateAlphabet(shift);
    }

    public void generateAlphabet(int shift) {
        this.alphabet = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            if (i + shift <= 'z') {
                this.alphabet.put((char) i, (char) (i + shift));
            } else {
                this.alphabet.put((char) i, (char) (i + shift - 26));
            }
        }
    }

    public String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) <= 'Z' && plainText.charAt(i) >= 'A') {
                cipherText.append((char) (alphabet.get((char) (plainText.charAt(i) + 32)) - 32));
            } else if (plainText.charAt(i) >= 'a' && plainText.charAt(i) <= 'z') {
                cipherText.append(alphabet.get(plainText.charAt(i)));
            } else {
                cipherText.append(plainText.charAt(i));
            }
        }
        return cipherText.toString();
    }

    public String decrypt(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            int num;
            if (cipherText.charAt(i) >= 'A' && cipherText.charAt(i) <= 'Z') {
                num = 32;
            }
            else  if (cipherText.charAt(i) >= 'a' && cipherText.charAt(i) <= 'z') {
                num = 0;
            } else {
                plainText.append(cipherText.charAt(i));
                continue;
            }
            for (Map.Entry<Character, Character> i1 : this.alphabet.entrySet()) {
                if (cipherText.charAt(i) + num == i1.getValue()) {
                    plainText.append((char) (i1.getKey() - num));
                }
            }
        }
        return plainText.toString();
    }
}
