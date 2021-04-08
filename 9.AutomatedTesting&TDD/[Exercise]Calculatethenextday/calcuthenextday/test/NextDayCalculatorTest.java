import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class NextDayCalculatorTest {

    @Test
    void getNextDate() throws ParseException {
        String curDate = "2021/04/06";
        String expected = "2021/04/07";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getNextDay() throws ParseException {
        String curDate = "2021/03/06";
        String expected = "2021/03/07";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getNextTheDay() throws ParseException {
        String curDate = "1900/03/06";
        String expected = "1900/03/07";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getTheDay() throws ParseException {
        String curDate = "0001/03/09";
        String expected = "0001/03/10";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getDay() throws ParseException {
        String curDate = "1991/03/29";
        String expected = "1991/03/30";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void TheDay() throws ParseException {
        String curDate = "1996/12/30";
        String expected = "1996/12/31";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getTheNext() throws ParseException {
        String curDate = "1972/10/23";
        String expected = "1972/10/24";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void TheNextDayDay() throws ParseException {
        String curDate = "1972/11/23";
        String expected = "1972/11/24";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getTheDayBirth() throws ParseException {
        String curDate = "1969/03/25";
        String expected = "1969/03/26";
        String result = NextDayCalculator.getNextDate(curDate);
        Assertions.assertEquals(expected, result);
    }
}