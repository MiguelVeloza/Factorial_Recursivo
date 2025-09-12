/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cypds.actividad2.factorial;

/**
 *
 * @author k0uz3r
 */
public class Factorial {

    public static long multiply(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean negative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        long result = multiplyAdd(a, b);
        return negative ? -result : result;
    }

    private static long multiplyAdd(long times, long addend) {
        if (times == 0) {
            return 0;
        }
        return addend + multiplyAdd(times - 1, addend);
    }

    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers do not have a factorial.");
        }
        if (n == 0) {
            return 1;
        } else {
            return multiply(n, factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 9: " + factorial(9));  
    }
}
