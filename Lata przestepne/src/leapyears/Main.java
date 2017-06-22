package leapyears;

import leapyears.service.LeapYearService;
import leapyears.service.TimeCountService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LeapYearService leapYearService = new LeapYearService();
        TimeCountService timeCountService = new TimeCountService(leapYearService);
        System.out.println(timeCountService.daysUntil(new Date()));


    }

    public static void checkYears(String[] args) {
        LeapYearService leapYearService = new LeapYearService();
        for (String str : args) {
            try {
                int year = Integer.parseInt(str);
                System.out.println(year + " " + leapYearService.isLeapYear(year));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " could not define.");
            }
        }
    }
}
