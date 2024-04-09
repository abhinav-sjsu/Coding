import java.util.HashMap;
import java.util.Map;

public class IntegerToWords {
	
	// Static map to hold number to words mapping
    private static final Map<Integer, String> NUMBER_TO_WORDS_MAP;

    // Static initializer block used to populate the map
    static {
        NUMBER_TO_WORDS_MAP = new HashMap<>();
        // Single digit mappings
        NUMBER_TO_WORDS_MAP.put(1, "One");
        NUMBER_TO_WORDS_MAP.put(2, "Two");
        NUMBER_TO_WORDS_MAP.put(3, "Three");
        NUMBER_TO_WORDS_MAP.put(4, "Four");
        NUMBER_TO_WORDS_MAP.put(5, "Five");
        NUMBER_TO_WORDS_MAP.put(6, "Six");
        NUMBER_TO_WORDS_MAP.put(7, "Seven");
        NUMBER_TO_WORDS_MAP.put(8, "Eight");
        NUMBER_TO_WORDS_MAP.put(9, "Nine");
        // Teen mappings
        NUMBER_TO_WORDS_MAP.put(10, "Ten");
        NUMBER_TO_WORDS_MAP.put(11, "Eleven");
        NUMBER_TO_WORDS_MAP.put(12, "Twelve");
        NUMBER_TO_WORDS_MAP.put(13, "Thirteen");
        NUMBER_TO_WORDS_MAP.put(14, "Fourteen");
        NUMBER_TO_WORDS_MAP.put(15, "Fifteen");
        NUMBER_TO_WORDS_MAP.put(16, "Sixteen");
        NUMBER_TO_WORDS_MAP.put(17, "Seventeen");
        NUMBER_TO_WORDS_MAP.put(18, "Eighteen");
        NUMBER_TO_WORDS_MAP.put(19, "Nineteen");
        // Tens place mappings
        NUMBER_TO_WORDS_MAP.put(20, "Twenty");
        NUMBER_TO_WORDS_MAP.put(30, "Thirty");
        NUMBER_TO_WORDS_MAP.put(40, "Forty");
        NUMBER_TO_WORDS_MAP.put(50, "Fifty");
        NUMBER_TO_WORDS_MAP.put(60, "Sixty");
        NUMBER_TO_WORDS_MAP.put(70, "Seventy");
        NUMBER_TO_WORDS_MAP.put(80, "Eighty");
        NUMBER_TO_WORDS_MAP.put(90, "Ninety");
        // Scale mappings
        NUMBER_TO_WORDS_MAP.put(100, "Hundred");
        NUMBER_TO_WORDS_MAP.put(1000, "Thousand");
        NUMBER_TO_WORDS_MAP.put(1000000, "Million");
        NUMBER_TO_WORDS_MAP.put(1000000000, "Billion");
    }

    // Converts a number to words
    public String numberToWords(int num) {
        // Special case for zero
        if (num == 0) {
            return "Zero";
        }

        StringBuilder wordsBuilder = new StringBuilder();
      
        // Process the number for billions, millions, and thousands
        for (int i = 1000000000; i >= 1000; i /= 1000) {
            if (num >= i) {
                wordsBuilder.append(processThreeDigits(num / i)).append(" ").append(NUMBER_TO_WORDS_MAP.get(i));
                num %= i;
            }
        }
      
        // Append the remaining words for numbers less than a thousand
        if (num > 0) {
            wordsBuilder.append(processThreeDigits(num));
            System.out.println("Words Builder is "+wordsBuilder.toString());
        }
      
        // Remove the leading space and return the result
        return wordsBuilder.substring(1);
    }

    // Helper function to process up to three digits of the number
    private String processThreeDigits(int num) {
        StringBuilder threeDigitsBuilder = new StringBuilder();
        System.out.println("Number is "+num);
        if (num >= 100) {
            threeDigitsBuilder.append(" ")
                             .append(NUMBER_TO_WORDS_MAP.get(num / 100))
                             .append(" ")
                             .append(NUMBER_TO_WORDS_MAP.get(100));
            System.out.println("First Three Digits Builder is "+threeDigitsBuilder.toString());
            num %= 100;
        }
        if (num > 0) {
            // Direct mapping for numbers less than 20 or multiples of 10
            if (num < 20 || num % 10 == 0) {
                threeDigitsBuilder.append(" ").append(NUMBER_TO_WORDS_MAP.get(num));
                System.out.println("Second Three Digits Builder is "+threeDigitsBuilder.toString());
            } else {
                // Combine the tens and ones place for other numbers
                threeDigitsBuilder.append(" ")
                                  .append(NUMBER_TO_WORDS_MAP.get(num / 10 * 10))
                                  .append(" ")
                                  .append(NUMBER_TO_WORDS_MAP.get(num % 10));
                System.out.println("Third Three Digits Builder is "+threeDigitsBuilder.toString());
            }
        }
        return threeDigitsBuilder.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1000000;
		IntegerToWords intToWords = new IntegerToWords();
		System.out.println(intToWords.numberToWords(number));

	}

}
