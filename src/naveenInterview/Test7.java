package naveenInterview;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int Num=sc.nextInt();
		if(Num%2==0) {
			System.out.println(Num+" is Even Number");
		}
		else {
		System.out.println(Num+" is ODD Number");
		}

	}

}
