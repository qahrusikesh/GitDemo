package javaOnly;

public class StringManupulation {

	public static void main(String[] args) {
		String str="The rains have started here";
		String str1="The rains HAVE started here";
		System.out.println(str.length());
		System.out.println(str.charAt(12));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.indexOf("moPriya"));
		System.out.println(str.equals(str1));
		//trim
		String s="    i love you Priya    ";
		
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		String date="12-09-1992";
		System.out.println(date.replace("-", "/"));
		String sp="i'm_not_a_bad_guy";
		String[] x=sp.split("_");
		for(String y:x) {
			System.out.println(y);
		}
	}
 
}
