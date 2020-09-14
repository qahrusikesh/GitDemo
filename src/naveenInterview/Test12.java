package naveenInterview;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double num=sc.nextDouble();
		if(num<0.0) {
			System.out.println(num+" is a negative number");
		}
		else if(num>0.0) {
			System.out.println(num+" is a positive number");
			
		}
		else {
			System.out.println("definitely 0");
		}
	}

}
