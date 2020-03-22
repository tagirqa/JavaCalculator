import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  private static String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
  private static String[] signs = {"+", "-", "*", "/"};
  private static String[] rimskyNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


  // Ввод строки
  static String start() throws IOException {
    System.out.println("Введите выражение: ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String text = bufferedReader.readLine();
    bufferedReader.close();
    return text;
  }

  //определяем символ и запускаем нужную нам функцию
  public static String calculate(String number1, String symbol, String number2, Function function) {
    switch (symbol) {
      case "+":

        return function.addition(number1, number2);

      case "-":
        return function.subtraction(number1, number2);

      case "*":
        return function.multiply(number1, number2);

      case "/":
        return function.division(number1, number2);

      default:
        return "Неправильный символ!";
    }
  }



  //разбиваем строку на массив
  static  String[] convertText(String text){
    return text.split(" ");
  }

  //провека на ввод
  static  boolean checkText(String text) {
    String[] str = convertText(text);
    if (str.length != 3) {
      return false;
    }
    return (isExpressionArgumentsValid(rimskyNumbers, str[0]) && isExpressionArgumentsValid(rimskyNumbers, str[2])
            && isExpressionArgumentsValid(signs, str[1])) ||
            (isExpressionArgumentsValid(arabicNumbers, str[0]) && isExpressionArgumentsValid(arabicNumbers, str[2])
            && isExpressionArgumentsValid(signs, str[1]));

  }

  //проверка текста на вход в массив
   static boolean isExpressionArgumentsValid(String[] alphabet, String text) {

    return Arrays.asList(alphabet).contains(text);
  }



  // Проверяем римские или арабские цифры
   static String languageNumbers(boolean b, String text) {
    String[] str = convertText(text);
    if (b) {
      if (isExpressionArgumentsValid(rimskyNumbers, str[0])) {
        return calculate(str[0], str[1], str[2], new Rimsky());
      }
      else  {
        return calculate(str[0], str[1], str[2], new Arabic());
      }
    } else return "Неправльно ввели данные!";
}



  public static void main(String[] args) throws IOException {
    String text = start();
    String result = languageNumbers(checkText(text), text);
    System.out.println(result);
  }
}
