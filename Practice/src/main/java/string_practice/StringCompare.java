package string_practice;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String(s1);
		String s3 = new String("Hola");
		
		//System.out.println(s1+" Equals "+s2+"->"+s1.contentEquals(s2));
		
		if(s1.contentEquals(s2) && s1.equals(s3)) {
			System.out.println("Strings are equal");
		} else {
			System.out.print("Not equal");
		}
	}

}
