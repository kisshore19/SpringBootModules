package com.java.kishore.date.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CustomDateUtil {

	public static Date convertGivenDateStringToDate(String inputDate) {
		Date result = new Date();
		try {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
			LocalDate parse = LocalDate.parse(inputDate, dateTimeFormatter);
			result = Date.from(parse.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
			System.out.println(result);
		} catch (Exception e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

}
