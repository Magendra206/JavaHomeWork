package timeapicom.cg.timeapiexamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ZoneIdExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 03, 01);
		LocalDate repulicDay = LocalDate.of(1953,1,26);
		
		ZoneId zid1 = ZoneId.of("Asia/Tokyo");
		LocalTime timeInTokyo = LocalTime.now(zid1);
		System.out.println(timeInTokyo);
		
		ZoneId americaZone = ZoneId.of("America/Los_Angeles");
		LocalTime timeInAmerica = LocalTime.now(americaZone);
		System.out.println(timeInAmerica);
		
		ZoneId currentTimeZone = ZoneId.systemDefault();
		System.out.println(currentTimeZone.getDisplayName(TextStyle.FULL, Locale.ROOT));
		
		long hours = ChronoUnit.HOURS.between(timeInTokyo, timeInAmerica);
		System.out.println("difference between two zones = " + hours);
		
		long mins = ChronoUnit.MINUTES.between(timeInTokyo, timeInAmerica);
		System.out.println("difference between two zones in minutes = "+mins);
		
		long days = ChronoUnit.DAYS.between(repulicDay,date);
		System.out.println("difference between two zones in days = "+days);
		
		long years = ChronoUnit.YEARS.between(repulicDay,date);
		System.out.println("difference between two zones in days = "+years);

	}

}
