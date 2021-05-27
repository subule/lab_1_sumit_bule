package practice_1;
import java.io.*;

public class Traffic_Lights {

	public static void main(String[] args) throws Exception{
		String c = "y";
		while (c.equals("y")) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("******SELECT THE TRAFFIC LIGHT COLOUR******");
		System.out.println("            PRESS 1 FOR RED                ");
		System.out.println("            PRESS 2 FOR YELLOW             ");
		System.out.println("            PRESS 3 FOR GREEN              ");
		String choiceStr = b.readLine();
		int choice = Integer.parseInt(choiceStr);
		
			switch(choice){
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Wait");
				break;
			case 3:
				System.out.println("Go");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
			System.out.println("Do you wish to continue(y/n)?");
			c= b.readLine();
		}
	}
}