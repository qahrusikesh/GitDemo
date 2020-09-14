package javaProject;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		 Student s=new Student("Raka", 101);
		 Emp e=new Emp("Loka",111);
		 al.add(s);
		 al.add(e);
		 al.add(1999);
		 al.add("ramayan");
		 al.add(null);
		 
		 for(Object as:al) {
			 if(as instanceof Student) {
				System.out.println(s.sid+" "+s.sname); 
			 }
			 if(as instanceof Emp ) {
			 System.out.println(e.eid+" "+e.ename);
		 }
		 if(as instanceof String) {
			 System.out.println(as);
		 }
		 if(as instanceof Integer) {
			 System.out.println(as);
		 }
		 if(as==null) {
			 System.out.println(as);
		 }
		 

	}

	}
}
