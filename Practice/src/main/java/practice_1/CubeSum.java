package practice_1;
import java.io.*;
import static java.lang.Math.*;

public class CubeSum {

	public static void main(String[] args) throws Exception{
		System.out.println("PROGRAMME TO FIND SUM OF CUBES OF THE DIGITS OF A NUMBER");
		int sum=0;
		int flag=0;
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number: ");
		String numStr = b.readLine();
		int number = Integer.parseInt(numStr);
		for(; number!=0 ; number/=10) {
			flag = number%10;
			sum+=pow(flag, 3); /*ALTERNATE CODE-> flag = (int)pow(flag, 3); sum+=flag;*/					
		}
		System.out.println("Sum of the cubes of the digits of the number "+numStr+" is = "+sum);
	}
}