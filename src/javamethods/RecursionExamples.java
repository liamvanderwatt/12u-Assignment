/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

/**
 *
 * @author vandl4973
 */
public class RecursionExamples {
    //returns fibbinaci numbers using a loop
    //n - the nth number we want in the sequence

    public int fibLoop(int n) {
        int[] numbers = new int[n + 1];
        numbers[0] = 1;

        //boundry fixer
        if (n > 0) {
            numbers[1] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        //returning the numbers
        return numbers[n];
    }
    //returns fibbinaci numbers using recursion
    //n - the nth number in the sequence

    public int fibR(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }

    }

    public int gcd(int a, int b) {
        //swap if has a lower number
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        //check if were done
        if (b == 0) {
            return a;
        } else {
            int r = a % b;
            //calculate new gcd
            return gcd(b, r);
        }
        //find new values for a and b
    }

    public static void main(String[] args) {
        // TODO code application logic here
        RecursionExamples test = new RecursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println("0th" + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1th" + bound2);
        int norm = test.fibLoop(526);
        System.out.println("526th " + norm);
        System.out.println("---------------------------");
        int boundR1 = test.fibR(1);
        System.out.println("0th " + boundR1);
        int boundR2 = test.fibR(2);
        System.out.println("1th " + boundR2);
        int normR = test.fibR(6);
        System.out.println("6th " + normR);
        System.out.println("------ Gcd test");
        System.out.println("GCD(1378,24): " + test.gcd(1378, 24));
    }
}
