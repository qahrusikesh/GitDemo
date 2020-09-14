package javaProject;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(223);
		al.add(3224);
		System.out.println(al);
		System.out.println("---------------");
		ArrayList<Student> als=new ArrayList<Student>();
		als.add(new Student("ratan",111));
		als.add(new Student("Durga",1212));
		for(Student st: als) {
			System.out.println(st.sid+"  "+st.sname);
			 
		}
		
		ArrayList<Emp> ale=new ArrayList<Emp>();
		ale.add(new Emp("isdfnjkfsd",100));
		ale.add(new Emp("fhjs",200)); 
	}

}
