import java.util.logging.Logger;

public class Solution {
	
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	
	 public static String reverseWords(String s) {
	        if (s == null || s.length() == 0) return s;
	        String[] strs = s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for (String str: strs) {
	            str = reverse(str);
	            sb.append(str).append(" ");
	        }
	        return sb.toString().trim();
	    }
	    private static String reverse(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = str.length()-1; i >= 0; i--) {
	            sb.append(str.charAt(i));
	        }
	        return sb.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution s = new Solution();
		
		String output = reverseWords("Let's take LeetCode contest");
		
		LOGGER.info(output);
		

	}

}
