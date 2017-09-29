/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author vandl4973
 */
public class A2Q6 {

    public String convert(int n, int b) {
        if (n == 0 || n == 1) {
            return "" + n;
        }
        
        //finding remainder
        int re = n % b;

        if (re == 0) {
            //rounding number up
            Math.ceil(n);
            return convert(n / b) + "0";

        } else {
            int s = (n / b);
            Math.ceil(n);
            //if the number has a remainder
            if (re == 10) {
                System.out.println("A");
                return convert(n / b);
            }else if (re == 11) {
                System.out.println("A");
                return convert(n / b);
            }else if (re == 12) {
                System.out.println("A");
                return convert(n / b);
            }else if (re == 13) {
                System.out.println("A");
                return convert(n / b);
            }else if (re == 14) {
                System.out.println("A");
                return convert(n / b);
            }else if (re == 15) {
                System.out.println("A");            
                return convert(n / b);
            }else if (re == 16) {
                System.out.println("A");
                return convert(n / b);
            }
        }


    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
