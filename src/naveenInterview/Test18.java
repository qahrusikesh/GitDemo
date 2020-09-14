package naveenInterview;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		// Reverse a Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int no=num %10;
			rev=rev*10+no;
			num=num/10;
		}
		System.out.println(rev);
	}

}
