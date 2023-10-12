import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_To_Integer {
    private static final Map<Character, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }
    private static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanToIntegerMap.get(s.charAt(i));

            if (currValue >= prevValue)
                result += currValue;
            else
                result -= currValue;

            prevValue = currValue;
        }

        return result;
    }
}

