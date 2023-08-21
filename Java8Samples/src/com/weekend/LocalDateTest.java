package com.weekend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class LocalDateTest {
public static void main(String[] args) {
	
LocalDateTime ldt=LocalDateTime.now();
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS");
System.out.println(ldt.format(dtf));	
}
}
