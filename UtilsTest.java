import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

  @Test
  public void arabicToRoman() {
    int number = 0;
    int number1 = 16;
    int number2 = 3999;

    Assert.assertEquals(Utils.arabicToRoman(number), "0 is not in range (0,4000]");
    Assert.assertEquals(Utils.arabicToRoman(number1), "XVI");
    Assert.assertEquals(Utils.arabicToRoman(number2), "MMMCMXCIX");
  }

  @Test
  public void romanToArabic() {
    String number = "XII";
    String number1 = "VI";
    String number2 = "XCIX";

    Assert.assertEquals(Utils.romanToArabic(number), 12);
    Assert.assertEquals(Utils.romanToArabic(number1), 6);
    Assert.assertEquals(Utils.romanToArabic(number2), 99);
  }
}