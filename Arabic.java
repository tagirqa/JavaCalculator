import java.util.HashMap;
import java.util.Map;

public class Arabic implements Function {



  // Функции сложения, вычитания, умножения, деления с арабскими цифрами


  public String addition(String a, String b) {
    return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
  }


  public String subtraction(String a, String b) {
    return Integer.toString(Integer.parseInt(a) - Integer.parseInt(b));
  }


  public String multiply(String a, String b) {
    return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
  }


  public String division(String a, String b) {
    return Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
  }
}
