

import ru.site.Arabic;
import org.junit.Assert;
import org.junit.Test;

public class ArabicTest {

  @Test
  public void addition() {
    Arabic arabic = new Arabic();
    String a = "8";
    String b = "2";

    Assert.assertEquals(arabic.addition(a, b), "10");
  }

  @Test
  public void subtraction() {
    Arabic arabic = new Arabic();
    String a = "8";
    String b = "2";

    Assert.assertEquals(arabic.subtraction(a, b), "6");
  }

  @Test
  public void multiply() {
    Arabic arabic = new Arabic();
    String a = "8";
    String b = "2";

    Assert.assertEquals(arabic.multiply(a, b), "16");
  }

  @Test
  public void division() {
    Arabic arabic = new Arabic();
    String a = "8";
    String b = "2";

    Assert.assertEquals(arabic.division(a, b), "4");
  }
}