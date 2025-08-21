package day05;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class DateTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);
		LocalTime todayTime = LocalTime.now();
		System.out.println(todayTime);
		LocalDateTime todayDateTime = LocalDateTime.now();
		System.out.println(todayDateTime);
		
		
	}

}
