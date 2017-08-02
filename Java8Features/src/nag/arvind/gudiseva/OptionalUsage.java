package nag.arvind.gudiseva;

import java.util.Optional;

public class OptionalUsage {

	public OptionalUsage() {}

	public static void main(String[] args) {

		OptionalUsage optionalUsage = new OptionalUsage();
		
		Integer value1 = null;
	    Integer value2 = new Integer(10);
			
	      //Optional.ofNullable - allows passed parameter to be null.
	      Optional<Integer> num1 = Optional.ofNullable(value1);
			
	      //Optional.of - throws NullPointerException if passed parameter is null
	      Optional<Integer> num2 = Optional.of(value2);
	      
	      System.out.println("Sum: " + optionalUsage.sum(num1, num2));
	      
	    		  
	}

	 public Integer sum(Optional<Integer> arg1, Optional<Integer> arg2){
			
	      //Optional.isPresent - checks the value is present or not
			
	      System.out.println("First parameter is present: " + arg1.isPresent());
	      System.out.println("Second parameter is present: " + arg2.isPresent());
			
	      //Optional.orElse - returns the value if present otherwise returns
	      //the default value passed.
	      Integer value1 = arg1.orElse(new Integer(0));
			
	      //Optional.get - gets the value, value should be present
	      Integer value2 = arg2.get();
	      return value1 + value2;
	 }
	 
}
