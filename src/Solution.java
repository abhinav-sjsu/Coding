import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;



public class Solution {
	
	private static HashMap<Integer,Boolean> availableStore = new HashMap<Integer,Boolean>();

	private static HashMap<Integer,Integer> storeCount = new HashMap<Integer,Integer>();
	
	
	
	
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
	    
	    		
	    /*
	    		Started,job_id=1,job_name=grep
	    		Ended,job_id=1,job_time=100
	    		Started,job_id=2,job_name=grep
	    		Started,job_id=3,job_name=ls
	    		Ended,job_id=3,job_time=20
	    		Ended,job_id=2,job_time=50
	    		...
	    		K = 2

	    		Output:
	    		Two longest jobs = job 1 and job 2

	    		[(1, "grep", 100), (3, "ls", 20)]

	    		Given a file in the above format and an integer K, return the K longest & distinct jobs.

	    		Assumptions:

	    		1) Input is a list ["Started,job_id=1,job_name=grep", "Ended,job_id=1,job_time=100", "Started,job_id=2,job_name=grep", ..]
	    		2) Job with the longest job time value
	    		3) De-dupe final output by job_name, distinct should be by job_name
	    
	    */
	    
	    
	    /*
I have m stores to which n items needs to be allocated. The selection of store to allocate an item will be 
random and no store will get a new allocation until all stores have received the same number of allocations. 
Build a system and implement an algorithm for this allocation process
	     */
	    
	   
	    
	    public static String allocateStore(Integer itemID,Integer storeID) {
	    	
	    	if(itemID==null || itemID.toString().isEmpty())
	    		return "Please provide valid itemID";
	    	
	    	if(storeID==null || storeID.toString().isEmpty())
	    		return "Please provide valid storeID";
	    	 
	    	 int itemCount=0;
	    	
	    	System.out.println("Item Count 1 in the store is "+itemCount);
	    	
	    	//if(storeCount) {
	    	
		    	if(availableStore.get(storeID).equals(true)) {
		    		LOGGER.info("I am inside IF");
		    		//availableStore.put(storeID, true);
		    		//System.out.println("Status of HashMap after store allocation is "+availableStore);
		    		itemCount += 1;
		    		storeCount.put(storeID,itemCount);
		    		System.out.println("Status of HashMap after item allocation is "+storeCount);
		    		availableStore.put(storeID, false);
		    		System.out.println("Item Count 2 in the store is "+itemCount);
		    	} else {
		    		
		    		return "Store " + storeID + " is not available";
		    	}
	    	
	    	//}
	    	
	    	System.out.println("Item Count 3 in the store is "+itemCount);
	    	
	    	System.out.println("HashMap size after allocation is " +availableStore.size());
			
			System.out.println("HashMap values after allocation are " +availableStore.values());
			
			System.out.println("HashMap keyset after allocation is " +availableStore.keySet());
			
			System.out.println("HashMap storeCount after allocation is "+storeCount);
	    	
	    	
	    	return "item " + itemID + " has been allocated to store " +storeID; 	
	    //return "Store is not available";
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution s = new Solution();
		
//		String output = reverseWords("Let's take LeetCode contest");
//		
//		LOGGER.info(output);
//		
//		nthHighestSalary(1);
		
		//int count = numJewelsInStones("aA","aAAbbbb");
		
		//System.out.println("Count is "+count);
		
		availableStore.put(2001,true);
		availableStore.put(2002,true);
		availableStore.put(2003,true);
		availableStore.put(2004,true);
		availableStore.put(2005,true);
		
		//System.out.println("HashMap size is " +availableStore.size());
		
		//System.out.println("HashMap values are " +availableStore.values());
		
		//System.out.println("HashMap keyset is " +availableStore.keySet());
		
		
		
		String output = allocateStore(1001,2001);
		
		LOGGER.info(output);
		
		output = allocateStore(1001,2001);
		
		LOGGER.info(output);
		
		output = allocateStore(1002,2001);
		
		LOGGER.info(output);
		
		output = allocateStore(1003,2002);
		
		LOGGER.info(output);
		
		output = allocateStore(1004,2003);
		
		LOGGER.info(output);
		
		output = allocateStore(1005,2004);
		
		LOGGER.info(output);
		
		output = allocateStore(1005,2005);
		
		LOGGER.info(output);
		
		output = allocateStore(1006,2001);
		
		LOGGER.info(output);
		
		
		
	}

}
