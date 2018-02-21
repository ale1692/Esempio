package com.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Demo {

	public static void main(String[] args) {
		TestDate();

	}

	private void Test1() {

		DVD object1 = new DVD("La guerra", "Azione", 7.5);
		DVD object5 = new DVD("Le crociate", "Azione", 3);
		DVD object2 = new DVD("Parto col folle", "Commedia", 10);
		DVD object3 = new DVD("Dunkirk", "Drammatico", 6);
		DVD object4 = new DVD("Il sicario", "Giallo", 3);

		List<DVD> list = new ArrayList<DVD>();
		list.add(object1);
		list.add(object2);
		list.add(object3);
		list.add(object4);
		list.add(object5);

		Collections.sort(list);

		System.out.println("Ordinamento: ");

		for (DVD dvd : list) {
			System.out.println(dvd.toString());
		}

		int index = Collections.binarySearch(list, new DVD(null, "Azione", 3));
		System.out.println(index);

	}

	private static void Test2() {

		List<Child> list1 = new ArrayList<Child>();

		List<Animal> list2 = new ArrayList<>();

		list2.add(new Dog());
		list2.add(new Cat());

	}

	private static void TestDate() {

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
		Date today = calendar.getTime();
		int[] formats = { DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL };

		for (int format : formats) {
			DateFormat dateFormat = DateFormat.getDateInstance(format, Locale.ITALY);
			System.out.println(dateFormat.format(today));
		}

		String myDateStr = "01/01/16";
		try {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			Date myDate = dateFormat.parse(myDateStr);
			System.out.println("String to Date: " + dateFormat.format(myDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-HH.mm.ss SSS");
		System.out.println("SimpleDateFormat: " + simpleDateFormat.format(calendar.getTime()));

		// java 8 (mesi partono da 1)
		LocalDate localDate = LocalDate.of(2018, 1, 1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALY);
		System.out.println("Java 8 Version1: " + localDate.format(formatter));

		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);
		System.out.println("Java 8 Version2: " + localDate.format(formatter1));

		LocalTime localTime = LocalTime.of(12, 30, 0);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		ZoneId europe = ZoneId.of("Europe/Rome");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").withZone(europe)
				.withLocale(Locale.ITALY);
		System.out.println("Java 8 Version3: " + localDateTime.format(formatter2));

	}

}
