package Multithreading;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Threads {

	public static void main(String[] args)throws InterruptedException {
		
		new Thread(() -> {
			
			try {
				System.out.println(Thread.currentThread().getName());
				do {
					ZoneId zoneId = ZoneId.of ("America/Anchorage");
					ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId);
					System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
					Thread.sleep(1000);				
					}while (true);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Time zone 1").start(); 
		
		
		
		new Thread(() -> {
			try {

				System.out.println(Thread.currentThread().getName());

				do {
					ZoneId zoneId = ZoneId.of("Asia/Kolkata");
					ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId);
					System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
					Thread.sleep(1000);

				} while (true);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}, "Time zone 2").start();

		new Thread(() -> {
			try {

				System.out.println(Thread.currentThread().getName());

				do {
					ZoneId zoneId = ZoneId.of("Europe/Madrid");
					ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId);
					System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
					Thread.sleep(1000);

				} while (true);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}, "Time zone 3").start();

	}

}
