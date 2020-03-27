import java.util.*;
import java.util.stream.Collectors;

public class Rimsky implements Function {



  // Функции сложения, вычитания, умножения, деления с римскими цифрами

  public String addition(String a, String b) {

      return Utils.arabicToRoman(Utils.romanToArabic(a) + Utils.romanToArabic(b));
  }


    public String subtraction(String a, String b) {
        return Utils.arabicToRoman(Utils.romanToArabic(a) - Utils.romanToArabic(b));
    }


    public String multiply(String a, String b) {
        return Utils.arabicToRoman(Utils.romanToArabic(a) * Utils.romanToArabic(b));
    }


    public String division(String a, String b) {
        return Utils.arabicToRoman(Utils.romanToArabic(a) / Utils.romanToArabic(b));
    }


    //Конвертируем арабские цифры в римские



}
