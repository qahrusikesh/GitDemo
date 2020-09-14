package javaOnly;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=1223421;
		int a;
		int rev=0;
		a=num;
		while(a!=0)
		{
		rev=rev*10+a%10;
		a=a/10;
		}
		if(num==rev) {
			System.out.println(num+" palendrome Number");
		}
		else {
			System.out.println(num+ " is not Palendrome Number");
		}

	}

}
