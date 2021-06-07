package lab3;
import java.io.*;
import java.util.*;

public class Example1 {
	/*Exercise 1: Write a Java program that reads a line of integers
	 * and then displays each integer and the sum of all integers. 
	 * (Use String Tokenizer class)?
	 */
	public static void main(String[] args) throws Exception {
		int sum=0;
		int j;
		System.out.println("Enter the integers with one space: ");
		BufferedReader rdLine = new BufferedReader(new InputStreamReader(System.in));
		String line = rdLine.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		while(st.hasMoreTokens()) {
			String flag = st.nextToken();
			j = Integer.parseInt(flag);
			System.out.println(j);
			sum+=j;
		}
		System.out.println("Sum of the integers is: "+sum);
	}
}
/*Public method	Description
boolean hasMoreTokens() - checks if there is more tokens available.
String nextToken() - returns the next token from the StringTokenizer object.
String nextToken(String delim) - returns the next token based on the delimeter.
boolean hasMoreElements() - same as hasMoreTokens() method.
Object nextElement() - same as nextToken() but its return type is Object.
int countTokens() - returns the total number of tokens.*/