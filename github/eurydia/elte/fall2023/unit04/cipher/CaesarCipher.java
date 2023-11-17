package github.eurydia.elte.fall2023.unit04.cipher;

public class CaesarCipher {
  private int shift;

  public CaesarCipher(int shift) {
    this.shift = shift;
  }

  public String encrypt(String unencryptedString) {
    var encrptedStringBuilder = new StringBuilder();
    for (char c : unencryptedString.toCharArray()) {

      int encrptedChar = (c + this.shift - 97) % 26;

      encrptedStringBuilder.append(encrptedChar);
    }

  }

}