package nag.arvind.gudiseva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public SortList() {}

	public static void main(String[] args) {

		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("Australia");
		countries.add("China");
		countries.add("Brazil");
		countries.add("Russia");

		List<String> states = new ArrayList<String>();
		states.add("Andhra Pradesh");
		states.add("Telangana");
		states.add("Karnataka");
		states.add("Kerala");
		states.add("Tamil Nadu");
		states.add("Maharashtra");
		states.add("Delhi");

		Collections.sort(countries, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("Sort using Java 7 syntax: ");
		System.out.println(countries);
		
		// using sort function with a lambda expression as parameter to get the sorting criteria
		Collections.sort(states, (s1, s2) -> s1.compareTo(s2));
		System.out.println("Sort using Java 8 syntax: ");
		System.out.println(states);
	}

}
