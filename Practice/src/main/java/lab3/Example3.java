package lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example3 {
/*Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels*/

	public static void main(String[] args) throws Exception{
		Example3 obj = new Example3();
		System.out.println("Enter the Word: ");
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		String s = str.readLine().toLowerCase();
		String codeWord = obj.alterString(s);
		System.out.println("The Coded Word is: "+codeWord);
	}

	public String alterString(String input) {
		char[] str = input.toCharArray();
		for(int i=0; i<str.length; i++) {
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]==' ') {
				continue;
			}else {
				str[i]+=1;
			}
		}
		String cdwrd = new String(str);
		return cdwrd;
	}
}
