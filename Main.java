import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  static String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
  static String[] signs = {"+", "-", "*", "/"};
  static String[] rimskyNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

  // Ввод и проверка на ввод, возвращаем строку в массиве
  static String[] start() {
    System.out.println("Введите выражение: ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String error = ("Некорректный ввод данных!");

    try {
      String input = bufferedReader.readLine();
      String[] text = input.split(" ");

      if (text.length != 3) {
        System.out.println(error);
      }

      if (!Arrays.asList(signs).contains(text[1])) {
        System.out.println(error);
        ;
      }

      if (Arrays.asList(arabicNumbers).contains(text[0])
          && Arrays.asList(arabicNumbers).contains(text[2])) {
        return text;
      }

      if (Arrays.asList(rimskyNumbers).contains(text[0])
          && Arrays.asList(rimskyNumbers).contains(text[2])) {
        return text;
      }

    } catch (Exception e) {
      System.out.println(error);
    }
    String[] zero = new String[0];
    return zero;
  }

  // Проверяем римские или арабские цифры
  static void languageNumbers(String[] text) {
    if (text.length == 0) {
      System.out.println("Ошибка! Число не больше 10!");
    } else {

      List<String> list = Arrays.asList(arabicNumbers);
      if (list.indexOf(text[0]) < 0) {
        Rimsky rimsky = new Rimsky(text[0], text[1], text[2]);
      } else {
        Arabic arabic = new Arabic(text[0], text[1], text[2]);
      }
    }
}
  public static void main(String[] args) {

    languageNumbers(start());
  }
}
