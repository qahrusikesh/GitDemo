package javaProject;

import java.util.ArrayList;
import java.util.Collections;

public class Array1 {

	public static void main(String[] args) {
		 ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      System.out.println(fruits);
	      System.out.println(fruits.get(2));
	      System.out.println(fruits.indexOf("Pineapple"));
	      Collections.sort(fruits);
	      System.out.println(fruits);
	      System.out.println(fruits.contains("mango"));
	      fruits.clear();
	      System.out.println(fruits);
	      

}
}