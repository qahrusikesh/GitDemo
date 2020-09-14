package wrapper;

public class Tesst4 {

	public static void main(String[] args) {
		
		//primitive to String
		int a=10, b=20;
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		System.out.println(s1+s2);
		
		//String to Primitive
		
		String st1="1000";
		String st2="15";
		int i1=Integer.parseInt(st1);
		float f1=Float.parseFloat(st2);
		System.out.println(i1+f1);
	}

}
