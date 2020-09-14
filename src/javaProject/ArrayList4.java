package javaProject;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ratan");
		al.add(10000);
		al.add('P');
		
		al.add(10.5f);
		
		System.out.println(al);
		System.out.println(al.size());
		al.add(1,"Priyasa");
		System.out.println(al);
	
	al.set(0, "Priyasa");
	
	System.out.println(al);
	System.out.println(al.isEmpty());
	al.clear();
	System.out.println(al.isEmpty());
	}

}
