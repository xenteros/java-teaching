package pascal.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agurgul on 29.06.2017.
 */
public class PascalTriangle {
    private List<Row> rows;
    private int n;

    public PascalTriangle(int n) {
        this.n = n;
        rows = new ArrayList<>();
        Row temp = new Row(0, null);
        rows.add(temp);
        for (int i = 1; i <= n; i++) {
            temp = new Row(i, temp);
            rows.add(temp);
        }

    }

    public long binomial(int n, int k) {
        Row temp = rows.get(n);
        return temp.getRow()[k];
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void print() {
        for (Row row : rows) {
            System.out.println(row.toString());
        }
    }
}
