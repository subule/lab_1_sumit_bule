package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Example3 obj = new Example3();
		System.out.println("Enter the Length of the string array: ");
		Scanner sc = new Scanner(System.in);
		int strLen = sc.nextInt();
		System.out.println("Enter the elements of the string array: ");
		int[] strArray = new int[strLen];
		for(int i=0; i<strLen; i++) {
			strArray[i]=sc.nextInt();
		}
		sc.close();
		int[] sorted=obj.modifyArray(strArray);
		System.out.println("The final output is: "+Arrays.toString(sorted));
	}
	
	public int[] modifyArray(int[] string) {
		int x = string.length;
		int[] reversed = new int[x];
		for(int i=0; i<x; i++) {
			StringBuilder input = new StringBuilder();
			input.append(string[i]);
			input.reverse();
			int num = Integer.parseInt(input.toString());
			reversed[i]=num;
		}
		Arrays.sort(reversed);
		return reversed;
		
	}

}
