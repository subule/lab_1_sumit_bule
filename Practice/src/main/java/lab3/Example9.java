package lab3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class Example9 {
//Create a method to accept date and print the duration in days, months and years with regards to current system date.
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the date(dd/mm/yyyy): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String todayDate = br.readLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateToday = LocalDate.now();
		LocalDate dateEntered = LocalDate.parse(todayDate, format);
		
		System.out.println("Entered date : "+dateEntered);		
		System.out.println("System's date : "+dateToday.format(format));
		
		Period period = dateEntered.until(dateToday);
		System.out.println("Duration" + "\nDays : " + period.getDays()+ "\nMonthes : "+ period.getMonths()+ "\nYears : " + period.getYears());

	}

}
