import java.util.HashMap;
import java.util.Map;

public class Arabic implements Function {

    Arabic(String number1, String symbol, String number2) {

        switch (symbol) {
      case "+":
        System.out.println(addition(number1, number2));
        break;

      case "-":
        System.out.println(subtraction(number1, number2));
        break;

      case "*":
        System.out.println(multiply(number1, number2));
        break;

      case "/":
        System.out.println(division(number1, number2));
        break;
    }
  }

  // Функции сложения, вычитания, умножения, деления с арабскими цифрами

  @Override
  public String addition(String a, String b) {
    return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
  }

  @Override
  public String subtraction(String a, String b) {
    return Integer.toString(Integer.parseInt(a) - Integer.parseInt(b));
  }

  @Override
  public String multiply(String a, String b) {
    return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
  }

  @Override
  public String division(String a, String b) {
    return Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
  }
}
