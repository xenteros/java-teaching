package util;

/**
 * Created by agurgul on 20.06.2017.
 */
public enum Operator {

    ADD("+"), DIFF("-"), MULTIPLY("*"), DIVIDE("/"), MODULO("mod"), POW("^");

    private String op;

    Operator(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Operator fromString(String s) {
        for (Operator operator : values()) {
            if (operator.op.equalsIgnoreCase(s)) {
                return operator;
            }
        }
        return null;
    }
}
