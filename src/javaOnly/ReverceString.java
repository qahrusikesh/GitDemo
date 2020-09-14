package javaOnly;

public class ReverceString {

	public static void main(String[] args) {
		String s="Selenium";
		int length=s.length();
		
		String rev="";
		System.out.println(s);
		for(int i=length-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
			 
		}
		System.out.println("By for Loop : "+rev);
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println("by String Buffred : "+sb.reverse());

	}

}
