package lab3;
import java.io.*;
public class Example2 {
	/*Exercise 2: Create a class containing a method to create the mirror image of a String.
	 * The method should return the two Strings separated with a pipe(|) symbol. */

	public static void main(String[] args) throws Exception {
		Example2 obj = new Example2();
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		String s = str.readLine();
		StringBuffer line = new StringBuffer(s);
		StringBuffer reverseLine = obj.getImage(line);
		System.out.println(s+" | "+reverseLine);
	}
	
	public StringBuffer getImage(StringBuffer x) {
		StringBuffer revLine = x.reverse();
		return revLine;
	}
}