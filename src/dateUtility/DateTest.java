package dateUtility;

import dateUtility.DateUtility;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(DateUtility.displayCalendar(8, 1947));
		System.out.println(DateUtility.getDaysInMonth(10, 2015));
		System.out.println(DateUtility.isLeapYear(2016));
		System.out.println(DateUtility.toString(8, 10, 2020, '/'));
		System.out.println(DateUtility.dayOfTheWeek("1/30/2016"));
		System.out.println(DateUtility.dayOfTheWeek(1,30,2016));
		System.out.println(DateUtility.daysBwDates(1,30,2015));
		System.out.println(DateUtility.daysBwDates("1/30/2015", "8/31/2016"));
		System.out.println(DateUtility.daysBwDates(1, 30, 2015, 8, 31, 2016));
	}

}
