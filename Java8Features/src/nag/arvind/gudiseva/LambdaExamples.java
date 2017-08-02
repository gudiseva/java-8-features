package nag.arvind.gudiseva;

public class LambdaExamples {

	public LambdaExamples() {}

	// Using lambda expression, you can refer to final variable
	private final static String salutation = "Hello! ";
	
	public static void main(String[] args) {

		LambdaExamples reference = new LambdaExamples();
		
		//with type declaration
		Operation sum = (double a, double b) -> a + b;
		
		//with out type declaration
	    Operation subtract = (a, b) -> a - b;
	    
	    //with return statement along with curly braces
	    Operation multiply = (double a, double b) -> { return a * b; };
	    
	    //without return statement and without curly braces
	    Operation divide = (double a, double b) -> a / b;
		
		System.out.println("10 + 5 = " + reference.operate(10, 5, sum));
		System.out.println("10 - 5 = " + reference.operate(10, 5, subtract));
	    System.out.println("10 x 5 = " + reference.operate(10, 5, multiply));
	    System.out.println("10 / 5 = " + reference.operate(10, 5, divide));
	    
	    System.out.println("--------------------------------");
	    
	    //without parenthesis
	    Greeting greeting1 = message -> System.out.println(salutation + message);
	    greeting1.hello("Arvind");
	    
	    //with parenthesis
	    Greeting greeting2 = (message) -> System.out.println(salutation + message);
	    greeting2.hello("Gudiseva");
	    
	}

	interface Operation {
		double result(double num1, double num2);
	}

	private double operate(double num1, double num2, Operation operation) {
		return operation.result(num1, num2);
	}
	
	interface Greeting {
	      void hello(String message);
	}

}
