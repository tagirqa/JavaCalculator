

import ru.site.Rimsky;
import org.junit.Assert;
import org.junit.Test;

public class RimskyTest {

  @Test
  public void addition() {
    Rimsky rim = new Rimsky();
    String a = "III";
    String b = "I";

    Assert.assertEquals(rim.addition(a, b), "IV");
  }

  @Test
  public void subtraction() {
    Rimsky rim = new Rimsky();
    String a = "III";
    String b = "I";

    Assert.assertEquals(rim.subtraction(a, b), "II");
  }

  @Test
  public void multiply() {
    Rimsky rim = new Rimsky();
    String a = "III";
    String b = "I";

    Assert.assertEquals(rim.multiply(a, b), "III");
  }

  @Test
  public void division() {
    Rimsky rim = new Rimsky();
    String a = "III";
    String b = "I";

    Assert.assertEquals(rim.division(a, b), "III");
  }
}