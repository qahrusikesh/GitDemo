package stringManupulation;

public class Test5 {

	public static void main(String[] args) {
		String s1="ratan";
		String s2="ratan";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		String x1=new String("priyasa");
		String x2=new String("priyasa");
		System.out.println(x1.equals(x2));
		System.out.println(x1==x2);
		
		StringBuffer sb1= new StringBuffer("anu");
		StringBuffer sb2=new StringBuffer("anu");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);

	}

}
