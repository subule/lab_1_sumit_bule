package Lab4;
import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter Numbers : ");
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		String arr1 = Arrays.toString(arr);
		System.out.println(arr1);
		String[] arr2 = modifyArray(arr);
		System.out.println("The new Array without repeated numbers is:"+Arrays.toString(arr2));
		//System.out.println("The Array without repeated integers is: "+Arrays.toString(arr));
	}

	
	  public static String[] modifyArray(String[] arrIP) { 
		  int length = arrIP.length;
		  int counter=0;
		  Arrays.sort(arrIP); 
		  for(int i=0; i<length-1; i++) { 
			  if(arrIP[i] != arrIP[i+1]) 
				  counter++; 
		  } 
		  String[] newArr = new String[counter];
		  for(int i=0; i<length-1; i++) { 
			  if(arrIP[i] != arrIP[i+1])
				  newArr[i]=arrIP[i];
		  }
		  return newArr;
	  }
}