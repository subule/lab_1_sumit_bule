package practice_arrays;
import java.io.*;
import java.util.*;

public class ArrayStringConversion {

	public static void main(String[] args) throws Exception {
//String to array
		System.out.println("Enter the string: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] charArray = new char[str.length()];
		//Using for loop or using indexing
		System.out.println("The String to Array is: ");
		for(int i=0; i<str.length(); i++) {
			charArray[i] = str.charAt(i);
			System.out.println(charArray[i]+",");
		}
//Using toCharArray() Method
		System.out.println("Enter another string: ");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		char[] charArray1 = str1.toCharArray();
		for(int i=0; i<str1.length(); i++)
		System.out.println(charArray1[i]);
	}
}
