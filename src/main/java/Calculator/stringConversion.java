package Calculator;

import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringConversion {

    public static int [] convert(String input){

        int []number_array = new int[20] ;

        if(input.startsWith("//"))
        {
            multiregrextoarray(input, number_array);
        }
        else {
            String number[] = input.split(",|\n");
            number_array =  new int[number.length];
            for (int i = 0; i < number.length; i++) {
                number_array[i] = Integer.parseInt(number[i]);
            }
        }
        return number_array;

    }

    private static void multiregrextoarray(String input, int[] number_array) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        m.matches();
        String regrex = m.group(1);
        String number = m.group(2);
        String numbers[] = number.split(Pattern.quote(regrex));
        for (int i = 0; i < numbers.length; i++) {
            number_array[i] = Integer.parseInt(numbers[i]);
        }
    }
}
