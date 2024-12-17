package Ciphers;

public class CaesarCipherApp {

  public static void main(String[] args) {
    System.out.println("*********************************************************\n\n");
    String plainText = "AaAa!";
    SubstitutionCipher c = new SubstitutionCipher();
    String cipherText = c.encode(plainText);
    String decodedText = c.decode(cipherText);
    System.out.println("PlainText =   " + plainText);
    System.out.println("CipherText =  " + cipherText);
    System.out.println("DecodedText = " + decodedText);
  }

}