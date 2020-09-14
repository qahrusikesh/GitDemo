package javaOnly;

public class DuplicateElement {

	public static void main(String[] args) {
		String name[]= {"java","java","c","c++",".net","python","c"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}
		
	}

}
