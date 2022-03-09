package CaeserCipher;

public class Main {
    public static void main(String[] args) {
        Cipher mod26 = new Cipher(13);
        System.out.println(mod26.encrypt("cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_GYpX0HqX}"));
        System.out.println(mod26.decrypt("cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_GYpX0HqX}"));
        Cipher shift15 = new Cipher(15);
        System.out.println(shift15.encrypt("Genshin Memepact"));
        BruteForce bruteForce = new BruteForce();
//        bruteForce.printAll("cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_GYpX0HqX}");
        bruteForce.useKnownString("cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_GYpX0HqX}", "picoCTF");
    }
}
