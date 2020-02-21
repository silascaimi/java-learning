package datas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class IntegracaoLegado {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Date >> LocalDateTime
		Date d = new Date();
		Instant i = d.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		 
		// LocalDateTime >> Date
		LocalDateTime ldt2 = LocalDateTime.now();
		Instant i2 = ldt2.atZone(ZoneId.systemDefault()).toInstant();
		Date d2 = Date.from(i2);
		
		// Calendar >> LocalDateTime
		Calendar calendar = Calendar.getInstance();
		Instant instant = calendar.toInstant();
		LocalDateTime ldt3 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		
		// LocalDateTime >> Calendar
		LocalDateTime ldt4 = LocalDateTime.now();
		Instant instant2 = ldt4.atZone(ZoneId.systemDefault()).toInstant();
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(Date.from(instant2));
		
	}

}
