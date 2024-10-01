package github.eurydia.elte.fall2023.unit04.cipher;

public class CaesarCipher {
  private int shift;

  public CaesarCipher(int shift) {
    this.shift = shift;
  }

  public String encrypt(String unencryptedString) {
    var encrptedStringBuilder = new StringBuilder();
    for (char c : unencryptedString.toCharArray()) {

      int encryptedChar = ((c + this.shift - 97) % 26) + 97;

      encrptedStringBuilder.append(Character.toChars(encryptedChar));
    }

    return encrptedStringBuilder.toString();
  }

  public String decrypt(String encryptedString) {
    var decryptedStringBuilder = new StringBuilder();
    for (char c : encryptedString.toCharArray()) {

      int decryptedChar = c - this.shift;
      if (decryptedChar < 97) {
        decryptedChar += 26;
      }

      decryptedStringBuilder.append(Character.toChars(decryptedChar));
    }

    return decryptedStringBuilder.toString();
  }

}