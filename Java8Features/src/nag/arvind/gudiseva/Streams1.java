package nag.arvind.gudiseva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams1 {

	public Streams1() {}

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		
		for(int i=0; i<100; i++){
			intList.add(i);
		}
		
		//sequential stream
		Stream<Integer> sequentialStream = intList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = intList.parallelStream();
		
		//using lambda with Stream API and filter
		Stream<Integer> evenNos = parallelStream.filter(num -> (num % 2 == 0));
		
		//using lambda in forEach
		evenNos.forEach(num -> System.out.println("Even Numbers (Parallel) : " + num));
		
		//using lambda with Stream API, for sequential stream
		System.out.println("--------------------------------");
		Stream<Integer> oddNos = sequentialStream.filter(num -> (num % 2 != 0));
		oddNos.forEach(num -> System.out.println("Odd Numbers (Sequential) : " + num));

		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println(numbers.stream().filter(num -> num % 2 == 0).map(num -> num * 2).reduce(0, Integer::sum));
		
		System.out.println(numbers.stream().filter(num -> num % 2 == 0).mapToInt(num -> num * 2).sum());
		
		System.out.println(IntStream.rangeClosed(1, 9).filter(num -> num % 2 == 0).map(num -> num * 2).sum());
		
	}

}
