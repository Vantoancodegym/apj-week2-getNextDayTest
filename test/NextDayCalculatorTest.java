import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing Jan.1st")
    void testGetNextDayJan1st(){
        int day=1;
        int month=1;
        int year=2018;
        String expected="2-1-2018";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Jan.31st")
    void testGetNextDayJan31st(){
        int day=31;
        int month=1;
        int year=2018;
        String expected="1-2-2018";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test April.30st")
    void testGetNextDayApril30st(){
        int day=30;
        int month=4;
        int year=2018;
        String expected="1-5-2018";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Feb.28st2019")
    void testGetNextDayFeb28st(){
        int day=28;
        int month=2;
        int year=2019;
        String expected="1-3-2019";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Feb.29st2020")
    void testGetNextDayFeb29st(){
        int day=29;
        int month=2;
        int year=2020;
        String expected="1-3-2020";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing Dec.31st")
    void testGetNextDayDec31st(){
        int day=31;
        int month=12;
        int year=2020;
        String expected="1-1-2021";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing Dec.32st")
    void testGetNextDayDec32st(){
        int day=32;
        int month=12;
        int year=2020;
        String expected="invalid day";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }



}