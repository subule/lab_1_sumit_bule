package practice_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class SumSq {
private int sumSqr1;
private int sumSqr2;
private int sum;

	public static void main(String[] args) throws Exception{
		int difFinal;
		SumSq obj = new SumSq();
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		String numstr = num.readLine();
		int n = Integer.parseInt(numstr);
		difFinal = obj.calculateDifference(n);
		System.out.println("The difference between the sum of the squares and the square of the sum of the first "+n+" natural numbers= "+difFinal);
	}
	
	public int calculateDifference(int number) {
		for(int i=1; i<=number; i++) {
			sumSqr1 += pow(i, 2);
			sumSqr2 += i;
		}
		sumSqr2 = (int)pow(sumSqr2, 2);
		sum = sumSqr1 - sumSqr2;
		return sum;
	}
}