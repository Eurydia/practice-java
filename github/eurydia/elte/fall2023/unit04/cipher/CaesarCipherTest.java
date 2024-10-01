package github.eurydia.elte.fall2023.unit04.cipher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CaesarCipherTest {

  @Test
  public void noShift() {
    var cipher = new CaesarCipher(0);

    assertEquals("hello", cipher.encrypt("hello"));
  }

  @Test
  public void encryptBy() {
    var cipher = new CaesarCipher(1);

    assertEquals("", cipher.encrypt(""));
    assertEquals("b", cipher.encrypt("a"));
    assertEquals("ccc", cipher.encrypt("bbb"));
    assertNotEquals("CCC", cipher.encrypt("BBB"));
  }

  @Test
  public void inverseOperation() {
    var cipherPlus = new CaesarCipher(1);
    var cipherMinus = new CaesarCipher(-1);

    assertEquals("a", cipherPlus.decrypt(cipherPlus.encrypt("a")));
    assertEquals("b", cipherPlus.encrypt(cipherPlus.decrypt("b")));

    assertEquals("c", cipherMinus.encrypt(cipherPlus.encrypt("c")));
    assertEquals("d", cipherPlus.encrypt(cipherMinus.encrypt("d")));
    assertEquals("e", cipherMinus.decrypt(cipherPlus.decrypt("e")));
    assertEquals("f", cipherPlus.decrypt(cipherMinus.decrypt("f")));

  }

}
