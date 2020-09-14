package naveenInterview;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// Table
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("Table of "+num+" is :");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+num+"="+i*num);
			
		}
		

	}

}
