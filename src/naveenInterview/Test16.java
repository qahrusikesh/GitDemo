package naveenInterview;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// Fibonacci series
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int t1=0;
		int t2=1;
		
		for(int i=0; i<num;i++) {
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			//System.out.println(t1);
		}

	}

}
