package stringManupulation;

public class Test1 {

	public static void main(String[] args) {
		String s1="ratan";
		System.out.println(s1);
		String s2=new String("ratan");
		System.out.println(s2);
		char[] ch= {'a','b', 'c','d','e'};
		String s3=new String(ch);
		System.out.println(s3);
		String s4=new String(ch,2,2);
		System.out.println(s4);
		byte[] b= {65,66,67,68,69,70};
		
		String s5=new String(b);
		System.out.println(s5);

	}

}
