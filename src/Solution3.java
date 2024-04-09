import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution3 {
	
	
	//Arrays.asList(10,15,8,49,25,98,98,32,15);
	
	public static Set<Integer> findDuplicates(List<Integer> list){
		
		Set<Integer> duplicates = new HashSet<>();
		
		return list.stream()
				.filter(i -> !duplicates.add(i))
				.collect(Collectors.toSet());
		
		
	}
	
	public static void sortList(List<Integer> list) {
		
		List <Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//Set<Integer> duplicates = findDuplicates(list);
		
		//duplicates.forEach(System.out::println);
		
		sortList(list);

	}

}
