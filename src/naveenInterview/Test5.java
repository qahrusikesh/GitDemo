package naveenInterview;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//Find Ascii value of a character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.nextLine();
		for(int i=0;i<word.length();i++) {
			char a=word.charAt(i);
			char ascii=a;
			int asciiNumber=a;
			System.out.println(ascii+"  = "+asciiNumber);
			
		}
		
	}

}
