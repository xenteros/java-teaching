package leapyears.service;

import util.Month;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by agurgul on 21.06.2017.
 */
public class TimeCountService {

    private final LeapYearService leapYearService;

    public int daysUntil(Date date) {

        int days = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        for (int i = 1; i < year; i++) {
            days += (leapYearService.isLeapYear(i) ? 366 : 365);
        }
        Month[] months = Month.values();
        for (int i = 0; i < month; i++) {
            days += months[i].getDays();
            if (months[i].equals(Month.FEBRUARY)) {
                if (leapYearService.isLeapYear(year)) {
                    days += 1;
                }
            }
        }
        days += calendar.get(Calendar.DAY_OF_MONTH);
        return days - 1;
    }

    public TimeCountService(LeapYearService leapYearService) {
        this.leapYearService = leapYearService;
    }
}
