package javaProject;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(Integer.valueOf(10));
		al.add(Character.valueOf('P'));
		al.add("ramayan");
		al.add(Double.valueOf(10.3));
		System.out.println(al);
		System.out.println(al.toString());
		System.out.println("----------------------");
		
		
		//Auto Boxing (Automate Conversion of primitive to wrapper object)
		ArrayList al1=new ArrayList();
		al1.add('a');
		al1.add("omm");
		al1.add(23);
		al1.add('a');
		al1.add(23.6);
		al1.add(23);
		System.out.println(al1);
		System.out.println(al.toString());
	
		
	}

}
