import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
	    
	    public static void nthHighestSalary(int n) {
	    	List<Employee> list = new ArrayList<>();
			
			list.add(new Employee(1,"A",1,"01/01/2000",10000.00));
			list.add(new Employee(2,"B",1,"01/01/2002",20000.00));
			list.add(new Employee(3,"C",1,"01/01/2004",30000.00));
			list.add(new Employee(4,"D",1,"01/01/2006",40000.00));
			list.add(new Employee(5,"E",1,"01/01/2008",50000.00));
			list.add(new Employee(6,"F",1,"01/01/2010",60000.00));
	    	
	    	// Find Nth highest salary using Stream API
			Optional<Double> salary = list.stream()
					.map(e -> e.getSalary())
					.sorted(Comparator.reverseOrder())
					.skip(n-1).findFirst();
			
			LOGGER.info(salary.get().toString());
	    }
	    
	    
//	    Input: jewels = "aA", stones = "aAAbbbb"
//	    Output: 3
	    
	    public static int numJewelsInStones(String jewels, String stones) {
	        int count=0;
	        
	        for(int i=0;i<jewels.length();i++) {
	        	CharSequence c = jewels.subSequence(i, i);
	        	
	        	System.out.println("Character is "+c.toString());
	        	System.out.println("Count is "+count);
	        	if(stones.contains(c)) {
	        		count++;
	        	}
	        }
	        return count;
	    }
	    
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution s = new Solution();
		
//		String output = reverseWords("Let's take LeetCode contest");
//		
//		LOGGER.info(output);
//		
//		nthHighestSalary(1);
		
		int count = numJewelsInStones("aA","aAAbbbb");
		
		System.out.println("Count is "+count);
		
	}

}
