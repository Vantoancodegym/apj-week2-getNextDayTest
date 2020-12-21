public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year){
        String result="";
        if (isValidValue(day,month,year)){
        int lastOfMonth;
        final int LAST_MONTH_OF_YEAR=12;
        boolean isLastDayOfMonth=day>=getLastOfMonth(month,year);
        boolean isLastMonthOfYear=month>=LAST_MONTH_OF_YEAR;
        if (isLastDayOfMonth){
            if (isLastMonthOfYear){
                day=1;
                month=1;
                year++;
            }else {
            day=1;
            month++;}
        }else {
            day++;
        }
        result=day +"-"+month+"-"+year;}
        else {
            result="invalid day";
        }
        return result;
    }
    public static int getLastOfMonth(int month,int year){
        int lastOfmonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfmonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfmonth =30;
                break;
            case 2:
                if (isLeapYear(year)) lastOfmonth=29;
                else lastOfmonth=28;
        }
        return lastOfmonth;
    }
    public static boolean isLeapYear(int year){
        boolean isDivisible400=year%400==0;
        boolean isDivisible4=year%4==0;
        boolean isDivisible100=year%100==0;
        if (isDivisible400||(isDivisible4&&!isDivisible100)){
            return true;
        }
        return false;
    }
    public static boolean isValidValue(int day, int month, int year){
        boolean isValidMonth=0<day&&day<13;
        boolean isValidYear=0<year;
        if (isValidMonth&&isValidYear){
            int lastOfMonth=getLastOfMonth(month,year);
            boolean isValidDay=0<day&&day<lastOfMonth;
            if (isValidDay)return true;
            else return false;

        }else return false;
    }
}
