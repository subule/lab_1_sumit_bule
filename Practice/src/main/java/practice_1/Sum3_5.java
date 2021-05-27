package practice_1;
import java.io.*;

public class Sum3_5 {
	static int sum;
	
	public int calculateSum(int number){
		for(int x=1; x<=number; x++) {
			if(x%3==0 || x%5==0) {
				sum+=x;
			}else {
				continue;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		int sumFinal;
		Sum3_5 obj = new Sum3_5();
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		String numstr = num.readLine();
		int n = Integer.parseInt(numstr);
		sumFinal = obj.calculateSum(n);
		System.out.println("Sum of Natural numbers divisible by 3 or 5 are: "+sumFinal);
	}
}