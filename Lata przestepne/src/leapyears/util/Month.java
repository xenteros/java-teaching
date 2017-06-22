package util;

/**
 * Created by agurgul on 21.06.2017.
 */
public enum Month {

    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}

