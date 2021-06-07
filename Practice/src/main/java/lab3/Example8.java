package lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Example8 {
//Create a method that accepts a String and checks if it is a positive string
	public static void main(String[] args) throws Exception {
		Example8 obj = new Example8();
		System.out.println("Enter the word: ");
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		String s = str.readLine().toLowerCase();
		boolean word = obj.posString(s);
		if(word) {
			System.out.println("The word is a positive word.");
		}else {
			System.out.println("The word is not a positive word.");
		}
	}

	public boolean posString(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			if(array[i]!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
