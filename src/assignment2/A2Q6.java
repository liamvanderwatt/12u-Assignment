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
        //fding out if it is divisable by 2
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
                return convert "A"+s;
            }else if (re == 11) {
                return convert(n / b)
              "b";
            }else if (re == 12) {
                return convert(n / b)
              "C";
            }else if (re == 13) {
                return convert(n / b)
              "D";
            }else if (re == 14) {
                return convert(n / b)
              "E";
            }else if (re == 15) {
                return convert(n / b)
              "F";
            }else if (re == 16) {
                return convert(n / b)"G";
            }
        }


    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
