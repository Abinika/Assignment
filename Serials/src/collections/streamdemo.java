package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class streamdemo {
		public static void main(String[] args) {
			"malayalam".chars()
			.mapToObj(c -> Character.valueOf((char)c))
			.distinct() //remove duplicates
			.collect(Collectors.toList())
			.forEach(s -> System.out.println(s));
	
			
			
		Integer arr[] = {12,16,18,9,21,34,65,77,86};
		Integer result1 = Arrays.stream(arr)// convert in to arrays
				.distinct()//remove duplicates
				.sorted(Comparator.reverseOrder())
				.skip(1) //skip one element
				.findFirst()
				.get();
		System.out.println("Second highest element in the list "  +  result1);
		
		
		}
}