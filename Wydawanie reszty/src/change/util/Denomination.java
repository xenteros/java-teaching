package change.util;

/**
 * Created by agurgul on 21.06.2017.
 */
public enum Denomination {

    ONE(1),TWO(2), FIVE(5),
    TEN(10), TWENTY(20), FIFTY(50),
    HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500);

    private int value;

    Denomination(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value) + " PLN";
    }
}
