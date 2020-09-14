package javaOnly;

public class SwapString {

	public static void main(String[] args) {
		String a="hello";
		String b="world";
		System.out.println("a :"+a+" b :"+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
	
		a=a.substring(b.length());
		System.out.println("a: "+a+" b: "+b);

	}

}
