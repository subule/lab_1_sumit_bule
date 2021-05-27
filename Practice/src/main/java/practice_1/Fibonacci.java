package practice_1;

import java.util.*;

public class Fibonacci {
//NON-RECURSSIVE METHOD
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range till which the series is desired : ");
		int range = sc.nextInt();
		int num_0, num_1 = 0, num_2 = 1;
		System.out.println("The series up to mentioned range is : ");
		System.out.println(num_1);
		System.out.println(num_2);
		for(int i=0; i<=range; i++) {
			num_0 = num_1 + num_2;
			if(num_0>range) {
				break;
			}else {
			System.out.println(num_0);
			num_1=num_2;
			num_2=num_0;
			}
		}
		sc.close();
	}
}