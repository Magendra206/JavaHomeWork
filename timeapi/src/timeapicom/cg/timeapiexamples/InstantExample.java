package timeapicom.cg.timeapiexamples;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantExample {

	public static void main(String[] args) {
		String str = LocalDateTime.now().toString().concat("Z");
		System.out.println(str);
		Instant inst = Instant.parse(str);
		System.out.println(inst);
		
		System.out.println(Instant.now());
		System.out.println(inst.plus(Duration.ofDays(10)));

	}

}
