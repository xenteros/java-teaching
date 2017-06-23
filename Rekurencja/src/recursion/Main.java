/**
 * Created by agurgul on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static long factorial(int n) {
        System.out.println("Factorial called with n = " + n);
        if (n == 1) {
            return 1l;
        }
        long partialResult = factorial(n-1);
        System.out.println("Partial " + partialResult);
        return partialResult*n;
    }
}
