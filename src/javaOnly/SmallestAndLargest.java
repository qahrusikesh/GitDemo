package javaOnly;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int numbers[]= {20,29,-23,32,57,-1,0};
		int smalest=numbers[0];
		int largest=numbers[0];
		
		for(int i=1;i< numbers.length;i++) {
		if(largest<numbers[i])	{
			largest=numbers[i];
		}
		else if(smalest>numbers[i]) {
			smalest=numbers[i];
		}
	}
		System.out.println(Arrays.toString(numbers));
		System.out.println("largest number: "+largest);
		System.out.println("smalest number: "+smalest);

}
}