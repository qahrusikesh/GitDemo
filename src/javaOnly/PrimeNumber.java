package javaOnly;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(10));
		System.out.println(isPrimeNumber(13));
		
	}
	public static boolean isPrimeNumber(int x) {
		if(x<=1) {
			return false;
		}
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				return  false;
			}
		}
		return true;
	}
}