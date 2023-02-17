package Java8.DateAPI;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Date_Time {
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		localDate = localDate.now().plusDays(5);
		System.out.println(localDate);

//		String str = 
//		LocalDateTime currentdateTime3 = Date.toInstant().atZone(ZoneId.of("Asia/Kuala_Lumpur")).toLocalDateTime();
//		System.out.println(currentdateTime3);
//
//		Set<String> zones = ZoneId.getAvailableZoneIds();
//
//		for (String zone : zones) {
//			System.out.println(zone);
//		}
//
//		ZoneId zone1 = ZoneId.of("Asia/Kuala_Lumpur");
//		ZonedDateTime datetime = ZonedDateTime.now(zone1);
//		System.out.println(datetime);

	}

}
