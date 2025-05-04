package com.infy.seleniumpractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimePractice {
	public static void main(String[] args) {
		//introduced in java1.1 	
//		Date todyadate=new Date();
//		System.out.println(todyadate.getTime()); //will get epoch time --epoch time converter
//		System.out.println(todyadate); //returns Wed Apr 23 12:32:28 IST 2025
//	    SimpleDateFormat datepatternwewant=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
//		String desiredDate=	datepatternwewant.format(todyadate);
		
		// After java 8
		LocalDate todayDate= LocalDate.now();  //will get time only
		System.out.println(todayDate); //2025-04-23
		LocalDateTime todayDateAndCurrentTime=LocalDateTime.now(); //will get date and current time
		System.out.println(todayDateAndCurrentTime); //2025-04-23T13:09:08.396834900
		//Use Case	Use Class
		//Only date (e.g., birthday, due date)	LocalDate
		//Date + time (e.g., timestamp)	LocalDateTime
		//Date + time + time zone (e.g., UTC+5)	ZonedDateTime
		
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String formattedDate=todayDate.format(formatter);
		System.out.println(formattedDate);
        //for year always use small y
		   //yy->25, yyy or yyyy ->2025
		  
		//for month always use capital M
		    //M ->4, MM->04, MMM->Apr, MMMM->April
		//for date always use small d
		    //d ->5(single digit date), dd ->05(double digit date)
		//for hour, minutes, seconds use small h, m,s 
		    //h ->3(single digit), hh->03
		    //m, mm
		    //s, ss
		
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		String newDate =todayDate.format(formatter2);
		System.out.println("NewDate "+newDate);
		DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yyyy-MMMM-dd_hh:mm:ss");
		String newDateTime=todayDateAndCurrentTime.format(formatter3);
		System.out.println("New date and time"+newDateTime);
		
		//future date and past date 
		LocalDate yesterday = todayDate.minusDays(1);
		System.out.println("yesterdays date "+ yesterday);
		LocalDate lastWeek = todayDate.minusWeeks(1);
		LocalDate lastMonth = todayDate.minusMonths(1);
		LocalDate lastYear = todayDate.minusYears(1);
		
		LocalDate tomorrow = todayDate.plusDays(1);
		System.out.println("Tomorrow date "+ tomorrow);
		LocalDate nextWeek = todayDate.plusWeeks(1);
		LocalDate nextMonth = todayDate.plusMonths(1);
		LocalDate nextYear = todayDate.plusYears(1);
		
		
		
	}

}
