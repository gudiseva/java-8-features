package nag.arvind.gudiseva;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional1 {

	public Functional1() {}

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		      
		// Print Even Numbers
	    System.out.println("Even Numbers: " + filterNumbers(numList, isEven()));
	    
	    // Print Odd Numbers
	    System.out.println("Odd Numbers: " + filterNumbers(numList, isOdd()));
	      
	}
	
	public static Predicate<Integer> isEven() {
        return num -> (num % 2 == 0);
    }

	public static Predicate<Integer> isOdd() {
        return num -> (num % 2 != 0);
    }

	public static List<Integer> filterNumbers (List<Integer> numbers, Predicate<Integer> predicate) {
		return numbers.stream().filter(predicate).collect(Collectors.<Integer>toList());
	}
	 	 
}
