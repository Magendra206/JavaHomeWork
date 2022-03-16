package timeapicom.cg.timeapiexamples;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		LocalTime meetingTime = LocalTime.of(10, 45,15);
		Duration timeDuration = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(timeDuration.get(ChronoUnit.SECONDS));
		Duration timeDuration3 = Duration.between(currentTime,meetingTime);
		System.out.println(timeDuration3);
		Duration  timeDuration2 = timeDuration.plus(timeDuration3);
		System.out.println(timeDuration2);
		

	}

}
