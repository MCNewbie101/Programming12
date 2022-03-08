package CaeserCipher;

public class BruteForce {
    public BruteForce() {

    }

    public void printAll(String cipherText) {
        for (int i = 1; i < 26; i++) {
            Cipher cipher = new Cipher(i);
            System.out.println(cipher.decrypt(cipherText));
        }
    }
}
