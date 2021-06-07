package practice_arrays;

public class Demo1 {
/*Escape Sequence in java
  	\n- creates a new line
	\t- creates a tab space
	\b- inserts a single backspace
	\r-inserts carriage return
	\\- inserts a backslash character
	\’- inserts single quote character
	\” – inserts double-quote character
*/	
	public static void main(String[] args) {
		char[] charArray = {'1','a',' ','?','A','b'};
		for(int i=0; i<charArray.length; i++) {
			if(Character.isDigit(charArray[i])) 
				System.out.println(charArray[i]+" is a digit");
			
			if(Character.isLetter(charArray[i])) 
				System.out.println(charArray[i]+" is a letter");
			
			if(Character.isWhitespace(charArray[i])) 
				System.out.println(charArray[i]+" is a whitespace");
			
			if(Character.isUpperCase(charArray[i])) 
				System.out.println(charArray[i]+" is uppercase");
				System.out.println(Character.toLowerCase(charArray[i])+" Converted to LoweCase");
			if(Character.isLowerCase(charArray[i])) {
				System.out.println(charArray[i]+" is lowercase");
				System.out.println(Character.toUpperCase(charArray[i])+" Converted to UpperCase");
		}
	}
	}
}
