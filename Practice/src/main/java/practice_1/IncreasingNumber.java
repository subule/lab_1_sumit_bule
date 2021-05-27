package practice_1;
import java.io.*;
public class IncreasingNumber {
private static int num1;
private static int num2;
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the number: ");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String numStr = rd.readLine();
		int number = Integer.parseInt(numStr);
		IncreasingNumber obj = new IncreasingNumber();
		boolean xyz = obj.checkNumber(number);
		if(xyz == true) {
			System.out.println("The Number is an increasing number");
		}else {
			System.out.println("The Number is not an increasing number");
		}
	}

	public boolean checkNumber(int num) {
		if(num<10) {
			return false;
		}
		num1 = num%10;
		while(num!=0) {
			num2 = num%10;
			if(num1<num2) {
				return false;
			}
			num1=num2;
			num/=10;
		}
		return true;
	}
}
