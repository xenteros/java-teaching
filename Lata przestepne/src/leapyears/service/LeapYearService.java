package leapyears.service;

/**
 * Created by agurgul on 21.06.2017.
 */
public class LeapYearService {

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
