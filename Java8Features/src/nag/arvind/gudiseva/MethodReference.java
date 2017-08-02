package nag.arvind.gudiseva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodReference {

	public MethodReference() {}

	public static void main(String[] args) {

		List<String> nameList  = new ArrayList<String>();
		
		nameList.add("Arvind");
		nameList.add("Haritha");
		nameList.add("Dhyuti");
		nameList.add("Surejya");
			
		  Iterator<String> itr = nameList.iterator();
		  while(itr.hasNext()){
			  String name = itr.next();
			  System.out.println(name);
		  }
		  
		  System.out.println("---------------OR-----------------");
		  for (Iterator<String> it = nameList.iterator(); it.hasNext();) {
		     String name = it.next();
		     System.out.println(name);
		  }
		
	      System.out.println("---------------OR-----------------");
	      for(String name : nameList){
	    	  System.out.println(name);
	      }
	      
	      System.out.println("---------------OR-----------------");
	      nameList.forEach(name -> System.out.println(name));
	      
	      System.out.println("---------------OR-----------------");
	      nameList.forEach(System.out::println);
	      
	}

}
