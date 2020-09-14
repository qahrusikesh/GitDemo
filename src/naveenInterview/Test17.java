package naveenInterview;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		//Find digit size of a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		long num=sc.nextLong();
	 
	 int count=0;
	  
	 while(num!=0) {
		 num=num/10;
		 count++;
		
	 }
	 System.out.println(count);

	}

}
