package pascal.model;

import java.util.Arrays;

/**
 * Created by agurgul on 29.06.2017.
 */
public class Row {

    private long[] row;
    private int k;

    public Row(int k, Row row) {
        if (k < 0) {
            throw new IllegalArgumentException("k can't be negative");
        }
        if (k == 0) {
            this.k = k;
            this.row = new long[]{1};
            return;
        }
        if (row.getK() != k - 1) {
            throw new IllegalArgumentException("Row isn't k-1");
        }
        this.row = new long[k + 1];
        this.row[0] = 1;
        this.row[k] = 1;
        for (int i = 1; i < k; i++) {
            this.row[i] = row.getRow()[i] + row.getRow()[i - 1];
        }
        this.k = k;
    }

    @Override
    public String toString() {
        return Arrays.toString(row);
    }

    public long[] getRow() {
        return row;
    }

    public void setRow(long[] row) {
        this.row = row;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
