package timeapicom.cg.timeapiexamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeAPI {

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(format);
		System.out.println("After Formatting = "+ formattedDateTime);
		
		LocalDateTime independenceDay =  LocalDateTime.of(1949,8,15,12,45);
		System.out.println("Independence Day = " + independenceDay);
		System.out.println("day of week = " + independenceDay.get(ChronoField.DAY_OF_WEEK));
		System.out.println("day of year = " + independenceDay.get(ChronoField.DAY_OF_YEAR));
		System.out.println("day of Month = " + independenceDay.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Hour of the Day = " + independenceDay.get(ChronoField.HOUR_OF_DAY));
		System.out.println("Minutes of the Day = " + independenceDay.get(ChronoField.MINUTE_OF_DAY));

	}

}
