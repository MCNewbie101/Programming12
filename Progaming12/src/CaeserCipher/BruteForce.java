package CaeserCipher;

/*
 * Try all possible shifts in order to decrypt cipher text with unknown key.
 */
public class BruteForce {
    public BruteForce() {

    }

    /*
     * Print all possible plain texts.
     */
    public void printAll(String cipherText) {
        for (int i = 1; i < 26; i++) {
            Cipher cipher = new Cipher(i);
            System.out.println(cipher.decrypt(cipherText));
        }
    }

    /*
     * Print plain texts that includes a known part of the plain text.
     */
    public void useKnownString(String cipherText, String knownText) {
        for (int i = 1; i < 26; i++) {
            Cipher cipher = new Cipher(i);
            String text = cipher.decrypt(cipherText);
            for (int i1 = 0; i1 < cipherText.length() - knownText.length(); i1++) {
                if (text.startsWith(knownText, i1)) {
                    System.out.println(text);
                }
            }
        }
    }

//    public void useDictionary(String cipherText) {
//        for (int i = 1; i < 26; i++) {
//            Cipher cipher = new Cipher(i);
//            int i1 = 0;
//            for (int i2; i2 < c)
//            System.out.println(cipher.decrypt(cipherText));
//        }
//    }
}
