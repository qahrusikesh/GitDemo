package javaOnly;

public class ReverseInteger {

	public static void main(String[] args) {
		int a=123456;
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
			
		}
		System.out.println(rev);
		
		long b=246810;
		System.out.println(new StringBuffer(String.valueOf(b)).reverse());
		
		
	}

}
