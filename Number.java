// package com.thispointer.examples.java.collection.hashmap;

import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
 
import java.util.HashMap;
import java.util.List;

public class Number {
	//String userInput;



	public static void main(String[] args) throws IOException {

		System.out.println("Введите выражение:");
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        Converter massive = new Converter();
        CheckInput check = new CheckInput();
        Count result = new Count();
        Rim rimConv = new Rim();

        String[] userArray = massive.Converter(userInput);


        // System.out.println(check.CheckInput(userArray));

        if (check.CheckInput(userArray)) {
        	if (check.isArabNumber(userArray[0])) {
        		System.out.println(result.Count(userArray));
        	} else { 
        		String one = rimConv.RimToArab(userArray[0]);
        		String two = rimConv.RimToArab(userArray[2]);

        		System.out.println(rimConv.ArabToRim(result.Count(new String[] {one, userArray[1], two})));
        	}


        } else { System.out.println("Некорректный ввод данных!");}
        

		// String[] ary = "2 + 1".split(" ");

		// String aryYo = Arrays.toString(ary);

		// System.out.println(aryYo);


	} 
}

class Count {
	public String Count(String[] arrayCount) {
		int first = Integer.parseInt(arrayCount[0]);
		int second = Integer.parseInt(arrayCount[2]);
		
		switch(arrayCount[1]) {
			case "+":
			return Integer.toString(first + second);

			case "-":
			return Integer.toString(first - second);

			case "*":
			return Integer.toString(first * second);

			case "/":
			// float firstFloat = Float.parseFloat(arrayCount[0]);
			return Integer.toString(first / second);
		}
		return "0";
	}
}


class Rim {

	public String RepeatString(String str, int time) {
		
		String result = "";

		for (int i = 0; i < time; i++ ) {
			result += str;
		}
		return result;
	}

	public String ArabToRim(String arabNumber) {

		String result = "";
		
		HashMap<Integer, List<String>> map = new HashMap<>();
		map.put(1, Arrays.asList(new String[] {"I", "V", "X"}));
		map.put(2, Arrays.asList(new String[] {"X", "L", "C"}));
		map.put(3, Arrays.asList(new String[] {"C", "D", "M"}));
		// result = map.get("1")[0];
		String[] arabNumberArray = arabNumber.split("");

		for (int x = 0; x < arabNumber.length() ; x++) {
			int key = arabNumber.length() - x;
		
			List<String> mapValues = map.get(key);
			
			switch (arabNumberArray[x]) {

				case "1": 
				case "2":
				case "3":
					result += RepeatString(mapValues.get(0), Integer.parseInt(arabNumberArray[x]));
					break;
				case "4":
					result += mapValues.get(0) + mapValues.get(1);
					break;
				case "5":
					result += mapValues.get(1);
					break;
				case "6":
				case "7":
				case "8":
					int five = 5;
					int repeat = Integer.parseInt(arabNumberArray[x]) - five;
					result += mapValues.get(1) + RepeatString(mapValues.get(0), repeat);
					break;

				case "9":
					result += mapValues.get(0) + mapValues.get(2);
					break;

				default:
					break;
			}
		}



	return result;
	}

	public String RimToArab(String rimNumber) {

		int decimal = 0;
	    int lastNumber = 0;

	    HashMap<String,Integer> mapNumbers = new HashMap<String,Integer>();
	    mapNumbers.put("X", 10);
        mapNumbers.put("V", 5);
        mapNumbers.put("I", 1);

		for (int x = rimNumber.length() - 1; x >= 0 ; x--) {
            char convertToArab = rimNumber.charAt(x);
            String convertToArabString = String.valueOf(convertToArab);
        	decimal = processDecimal(mapNumbers.get(convertToArabString), lastNumber, decimal);
        	lastNumber = mapNumbers.get(convertToArabString);
		}
		return Integer.toString(decimal);
	}


	public int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }

    }
	
}


class Converter {

	public String[] Converter(String userinp){  
        String[] numbers = userinp.split(" ");

        return numbers; 
    }
}

class CheckInput {

	String[] arabNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	String[] signs = {"+", "-", "*", "/"};
	String[] rimNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


	public boolean CheckInput(String[] arrForCheck){  

    	if (arrForCheck.length != 3) { 
        	return false; }

    	if (Arrays.asList(signs).contains(arrForCheck[1]) == false) {
     		return false;
     	}

    	if (Arrays.asList(arabNumbers).contains(arrForCheck[0]) && Arrays.asList(arabNumbers).contains(arrForCheck[2])) {
    		return true;
    	}

    	if (Arrays.asList(rimNumbers).contains(arrForCheck[0]) && Arrays.asList(rimNumbers).contains(arrForCheck[2])) {
    		return true;
		}

    	return false;
	}

	public boolean isArabNumber(String number) {

		return Arrays.asList(arabNumbers).contains(number);
	}
}
