/**
 * Created by agurgul on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(intpower(6, 13));

    }

    public static long factorial(int n) {
        System.out.println("Factorial called with n = " + n);
        if (n == 1) {
            return 1l;
        }
        long partialResult = factorial(n - 1);
        System.out.println("Partial " + partialResult);
        return partialResult * n;
    }

    public static long intpower(int n, int m) {
        if (n == 0 && m == 0) {
            throw new IllegalArgumentException("0^0 is undefined symbol");
        }
        if (m == 0) {
            return 1;
        }
        if (m % 2 == 0) {
            long temp = intpower(n, m/2);
            return temp*temp;
        } else {
            long temp = intpower(n, (m-1)/2);
            return temp*temp*n;
        }
    }
}
