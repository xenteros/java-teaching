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
        //This could have been simplified into return year%4 == 0 - decided to leave it as it is, to keep the code clean
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
