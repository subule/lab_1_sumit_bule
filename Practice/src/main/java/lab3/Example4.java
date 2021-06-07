package lab3;

import java.util.*;
import static java.lang.Math.*;

public class Example4 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		sc.close(); 
		
		String str = String.valueOf(number);
		char ch = 0;
		int length=str.length();

		for (int i = 0; i < str.length() - 1; i++) {
		    ch = str.charAt(i);  
		    int di = Character.getNumericValue(ch);
		    char ch2 = str.charAt(i + 1);
		    int di2 = Character.getNumericValue(ch2);
		    int diff = abs(di - di2);
		    System.out.print(diff);
		        
		} 
		System.out.print(str.charAt(length-1));
	}

}
