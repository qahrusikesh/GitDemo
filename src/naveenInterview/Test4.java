package naveenInterview;

public class Test4 {

	public static void main(String[] args) {
	//Swapping 2 number
		int a=10;
		int b=20;
		System.out.println("Before swipe A: "+a+" B:"+b);
		
		a=a+b; 
		b=a-b;
		a=a-b;
		
		System.out.println("After swipe A: "+a+" B:"+b);
		System.out.println("----------------------");
		int x=30;
		int y=40;
		System.out.println("After swipe X: "+x+" Y:"+y);
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("After swipe X: "+x+" Y:"+y);
				
		
	}

}
