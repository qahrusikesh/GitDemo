package naveenInterview;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// Quotient &  Reminder
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Divident");
		float x=sc.nextFloat();
		System.out.println("Enter Divisor");
		int y=sc.nextInt();
		 float Quotient=x/y;
		 float Reminder=x%y;
		 System.out.println("Quotient is : "+Quotient);
		 System.out.println("Reminder is : "+ Reminder);
		 

	}

}
