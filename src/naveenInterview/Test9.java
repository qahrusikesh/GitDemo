package naveenInterview;

public class Test9 {

	public static void main(String[] args) {
		char ch='i';
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			System.out.println(ch+" is vowel");
			break;
			default:
				System.out.println(ch+" is consonent");
		}
	}

}
