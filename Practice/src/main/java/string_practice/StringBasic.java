package string_practice;

public class StringBasic {

	public static void main(String[] args) {
		//STRING USING CHAR ARRAY
		char c[] = {'J','a','v','a','1','.','8'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1+" "+s2);
		
		//CONCATENATION TO PREVENT LONG LINES
		String longStr = "This could have been " +
                "a very long line that would have " +
                "wrapped around.  But string concatenation " +
                "prevents this.";
		
		System.out.println(longStr);
	}

}
