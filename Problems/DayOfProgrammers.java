package Problems;

import java.util.Calendar;

public class DayOfProgrammers {

    static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0)
                return year % 400 == 0;
            else
                return true;
        }
        else
            return false;
    }

    static int daysInMonth(int month, int year) {

        // Get the current date
        Calendar cal = Calendar.getInstance();

        // Set the date to the first day of the desired month (e.g., June)
        cal.set(Calendar.MONTH, month - 1); // Months are 0-indexed, so June is 5

        // Set the day of the month to the last day (e.g., 30th)
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        // Get the number of days in the month
        int daysInMonth = cal.get(Calendar.DAY_OF_MONTH);

        if (month == 2 && isLeapYear(year))
            return 29;

        if (month == 2) {
            if (isLeapYear(year))
                return 29;

            return 28;
        }

        return daysInMonth;
    }

    public static String dayOfProgrammer(int year) {

        int takenDay = 0;
        int dayLeft = 256;
        int month = 1;

        while(dayLeft > 30){

            int daysInMonth = daysInMonth(month, year);

            takenDay += daysInMonth;
            month++;
            dayLeft -= daysInMonth;
        }

        return dayLeft + "." + "0" + month + "." + year;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1600));
    }
}
