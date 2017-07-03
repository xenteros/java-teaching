package tictactoe.model;

/**
 * Created by agurgul on 03.07.2017.
 */
public enum FieldState {

    EMPTY(" "), O("O"), X("X");

    private String v;

    FieldState(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return v;
    }
}
