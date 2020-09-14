package naveenInterview;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		//Factorial of a Number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fct=1;
		for(int i=1;i<=num;i++) {
			fct=fct*i;
			
		}
		System.out.println("Factorial of "+num+" is : "+fct);
		/*int temp;
		temp=num;
		
		while(temp>0)
		{
			fct=fct*temp;
			temp--;
		}
		System.out.println("Factorial of "+num+" is : "+fct);*/

	}

}
