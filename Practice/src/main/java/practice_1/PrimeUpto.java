package practice_1;
import java.io.*;

public class PrimeUpto {
	/*private static BufferedReader ;
	PrimeUpto(){
		br = new BufferedReader(new InputStreamReader(System.));
	}*/
//SHOWS 4 AS PRIME NUMBER. CHECK FOR PROBLEM.
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number upto which prime numbers are required: ");
		String rangeStr = br.readLine();
		int rangeNum = Integer.parseInt(rangeStr);
		for(int x=2; x<=rangeNum; x++) {
			boolean flag = false;
			for(int j=2; j<x/2; j++) {
				if(x%j == 0) {
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println(x);
			}else {
				continue;
			}
		}
	}
}