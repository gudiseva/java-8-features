package nag.arvind.gudiseva;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams2 {

	public Streams2() {}

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Arvind", "", "Gudiseva", "Haritha", "Dhyuti", "", "Surejya");
		
		// Collectors
		List<String> filtered = names.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		
		System.out.println("-------------------------------");
		
		String mergedString = names.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		System.out.println("-------------------------------");
		
		// forEach and limit
		Random random = new Random(10);
		random.ints().limit(10).forEach(System.out::println);
		
		System.out.println("-------------------------------");

		// sorted
		random.ints().limit(10).sorted().forEach(System.out::println);

		System.out.println("-------------------------------");
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 5, 7, 7);
		
		// map
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);
		
		System.out.println("-------------------------------");
		
		// filter and count
		//get count of empty string
		long emptyCount1 = names.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Count [Stream] of empty names: " + emptyCount1);
		
		System.out.println("-------------------------------");
		
		//get count of empty string
		long emptyCount2 = names.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Count [ParallelStream] of empty names: " + emptyCount2);
		
		System.out.println("-------------------------------");
		
		// Statistics
		IntSummaryStatistics stats = numbers.stream().mapToInt((num) -> num).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
	}

}
