import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MainTest {



  @Test
  public void calculate() {
    String number1 = "5";
    String symbol = "+";
    String number2 = "10";

    Assert.assertEquals(Main.calculate(number1, symbol, number2, new Arabic()), "15");

    String number12 = "5";
    String symbol2 = "-";
    String number22 = "10";

    Assert.assertEquals(Main.calculate(number22, symbol2, number12, new Arabic()), "5");

    String number13 = "5";
    String symbol3 = "*";
    String number23 = "10";

    Assert.assertEquals(Main.calculate(number13, symbol3, number23, new Arabic()), "50");

    String number14 = "5";
    String symbol4 = "/";
    String number24 = "10";

    Assert.assertEquals(Main.calculate(number24, symbol4, number14, new Arabic()), "2");
  }



  @Test
  public void convertText() {
    String test1 = "5 - 10";
    String[] test = {"5", "-", "10"};
    Assert.assertEquals(Main.convertText(test1), test);
  }

  @Test
  public void checkText() {
    String text = "I + 3";
    String text1 = "II * IV";
    String text2 = "helloWorld";
    String text3 = "IV + i";
    String text4 = "7 * 3";
    String text5 = "g / 3";
    String text6 = "";

    Assert.assertEquals(Main.checkText(text), false);
    Assert.assertEquals(Main.checkText(text1), true);
    Assert.assertEquals(Main.checkText(text2), false);
    Assert.assertEquals(Main.checkText(text3), false);
    Assert.assertEquals(Main.checkText(text4), true);
    Assert.assertEquals(Main.checkText(text5), false);
    Assert.assertEquals(Main.checkText(text6), false);

  }

  @Test
  public void isExpressionArgumentsValid() {
    String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] signs = {"+", "-", "*", "/"};
    String[] rimskyNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String text1 = "I";
    String text2 = "hi";
    String text3 = "8";
    String text4 = "*";


    Assert.assertEquals(Main.isExpressionArgumentsValid(rimskyNumbers,text1), true);
    Assert.assertEquals(Main.isExpressionArgumentsValid(rimskyNumbers,text2), false);
    Assert.assertEquals(Main.isExpressionArgumentsValid(arabicNumbers,text3), true);
    Assert.assertEquals(Main.isExpressionArgumentsValid(rimskyNumbers,text4), false);
    Assert.assertEquals(Main.isExpressionArgumentsValid(arabicNumbers,text4), false);
    Assert.assertEquals(Main.isExpressionArgumentsValid(signs,text4), true);

  }

  @Test
  public void languageNumbers() {

    String text1 = "II * IV";
    String text4 = "7 * 3";
    String text7 = "I + I";



    Assert.assertEquals(Main.languageNumbers(text1), "VIII");
    Assert.assertEquals(Main.languageNumbers(text4), "21");
    Assert.assertEquals(Main.languageNumbers( text7), "II");


  }
}