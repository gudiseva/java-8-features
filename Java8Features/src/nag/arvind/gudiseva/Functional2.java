package nag.arvind.gudiseva;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Functional2 {

	public Functional2() {}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
	      // Predicate<Integer> predicate = num -> true
	      // num is passed as parameter to test method of Predicate interface
	      // test method will always return true no matter what value num has.
			
	      System.out.println("Print all numbers:");
	      //pass num as parameter
	      evaluate(list, num -> true);
	      
	      
	      // Predicate<Integer> predicate1 = num -> num%2 == 0
	      // num is passed as parameter to test method of Predicate interface
	      // test method will return true if num%2 comes to be zero
			
	      System.out.println("Print even numbers:");
	      evaluate(list, num -> num % 2 == 0);
	      
	      
	      // Predicate<Integer> predicate2 = num -> num%2 != 0
	      // num is passed as parameter to test method of Predicate interface
	      // test method will return true if num%2 is not zero.
			
	      System.out.println("Print odd numbers:");
	      evaluate(list, num -> num % 2 != 0);
	      
	}

	public static void evaluate(List<Integer> numbers, Predicate<Integer> predicate) {
      for(Integer num: numbers) {
         if(predicate.test(num)) {
            System.out.print(num + ", ");
         }
      }
      System.out.println();
	}
	
}
