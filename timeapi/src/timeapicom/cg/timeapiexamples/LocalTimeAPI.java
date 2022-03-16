package timeapicom.cg.timeapiexamples;

import java.time.LocalTime;

public class LocalTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		LocalTime meetingTime = LocalTime.of(10, 45,15);
		System.out.println("Meeting Time = " + meetingTime);
		System.out.println("Status Update meeting with Staff = " + meetingTime.minusHours(1));
		System.out.println("Reminder for meeting before 30 mins = " + meetingTime.minusMinutes(30));
		System.out.println("Updated Meeting Time = " + meetingTime.plusMinutes(30));
		System.out.println("Updated Meeting Time due to technical error = " + meetingTime.plusHours(3));

	}

}
