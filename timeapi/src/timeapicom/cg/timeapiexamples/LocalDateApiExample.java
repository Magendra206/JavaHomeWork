package timeapicom.cg.timeapiexamples;

import java.time.LocalDate;

public class LocalDateApiExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Todaya Date = "+date);
		
		LocalDate weekLater = date.plusDays(7);
		System.out.println("week after the date = "+weekLater);
		
		LocalDate weekBefore = date.minusDays(7);
		System.out.println("after a week date ="+weekBefore);

	}

}
