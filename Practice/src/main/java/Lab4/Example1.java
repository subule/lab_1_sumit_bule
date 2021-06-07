package Lab4;
import java.util.Arrays;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];
		System.out.println("Enter 5 elements of the array");
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The entered elements of array are=> "+Arrays.toString(intArray));
		
		Arrays.sort(intArray);
		System.out.println("The sorted array is=> "+Arrays.toString(intArray));
		System.out.print("Second Smallest Element of the array is "+intArray[1]);
	}
}