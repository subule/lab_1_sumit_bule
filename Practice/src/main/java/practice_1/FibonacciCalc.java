package practice_1;
import java.io.*;

public class FibonacciCalc {
//USING RECURSIVE METHOD
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
	public static void main(String[] args) throws Exception {
		System.out.print("Enter The no of terms for Fibonacci Series: ");
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		String fibStr = f.readLine();
		int maxNumber = Integer.parseInt(fibStr);
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
					System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}
