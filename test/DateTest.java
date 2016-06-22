import static org.junit.Assert.*;

import org.junit.Test;

import dateUtility.DateUtility;

public class DateTest {

	@Test
	public void getDaysInMonthTest() {
		assertTrue(DateUtility.getDaysInMonth(10, 2015) == 31);
	}
	
	@Test
	public void isLeapYearTest() {
		assertTrue(DateUtility.isLeapYear(2016));
	}
	@Test
	public void toStringTest() {
		assertTrue(DateUtility.toString(8, 10, 2020, '/').equals("8/10/2020"));
	}
	@Test
	public void dayOfTheWeekTest() {
		assertTrue(DateUtility.dayOfTheWeek("1/30/2016") == 3);
		assertTrue(DateUtility.dayOfTheWeek(1,30,2016) == 3);
	}
	@Test
	public void daysBwDatesTest() {
		assertTrue(DateUtility.daysBwDates(1,30,2015) == 508);
		assertTrue(DateUtility.daysBwDates("1/30/2015", "8/31/2016") == 579);
		assertTrue(DateUtility.daysBwDates(1, 30, 2015, 8, 31, 2016) == 579);
	}
	

}
