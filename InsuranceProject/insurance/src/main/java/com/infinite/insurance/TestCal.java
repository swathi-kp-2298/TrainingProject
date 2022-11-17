package com.infinite.insurance;

import java.sql.Date;
import java.util.Calendar;

public class TestCal {
	public static void main(String[] args) {
		java.util.Date date= new java.util.Date();
		
		java.util.Date nextpay=new Date(date.getTime());
		Calendar calendar = Calendar.getInstance();
	       System.out.println("Current Date = " + calendar.getTime());
	      // Add 3 months to the Calendar
		nextpay=(Date) calendar.getTime();
		calendar.add(Calendar.MONTH, 3);
		System.out.println("Updated Date = " + calendar.getTime());
	}

}
