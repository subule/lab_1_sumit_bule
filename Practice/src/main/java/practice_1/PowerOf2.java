package practice_1;

import java.io.*;

public class PowerOf2 {
	public boolean checkNumber(int num) {
		if(num==0) 
			return false;
		while(num!=1) {
			if(num%2 != 0)
			return false;
			num/=2;
		}
		return true;
	}


	public static void main(String[] args) throws Exception{
		System.out.println("Enter the number: ");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String numStr = rd.readLine();
		int number = Integer.parseInt(numStr);
		PowerOf2 object = new PowerOf2();
		boolean yon = object.checkNumber(number);
		if(yon == true) {
			System.out.println("The Number is a power of 2");
		}else {
			System.out.println("The Number is not a power of 2");
		}
	}
}
