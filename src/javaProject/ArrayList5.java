package javaProject;


import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList5 {

	public static void main(String[] args) {
		LinkedList<String> alist=new LinkedList<String>();
		alist.add("bbsr");
		alist.add("ctc");
		alist.add("bam");
		alist.add("puri");
		alist.addFirst("bdk");
		System.out.println(alist);
		System.out.println(alist.get(2));
		alist.remove(2);
		System.out.println(alist);
		alist.removeLast();
		alist.set(1, "rkl");
		alist.addLast("bslr");
		System.out.println(alist);
	/*	Iterator<String> x=alist.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}*/
	}

}
