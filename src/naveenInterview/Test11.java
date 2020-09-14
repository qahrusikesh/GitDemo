package naveenInterview;

public class Test11 {

	public static void main(String[] args) {
		//Leaf Year
		//Divisible by 4 for all century year
		//Century year only when its perfectly divisible by 400
		//1900 is not leap year
		//2012 leap year
		
		int year=1900;
		boolean leap=false;
		if(year%4==0) {
			if(year%400==0) {
				leap=true;
				
			}
			else {
				leap=false;
			}
		}
		else {
			leap=true;
		}

	}

}
