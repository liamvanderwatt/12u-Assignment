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
        //base case
        if (n == 0) {
            return "";
        }
        //converting to letters 
        String rem = toLetter(n % b);
        int numnew = n / b;
        return convert(numnew, b) + rem;
    }
    //converts num to letter
    public String toLetter(int rem) {
        String ans = "";
        switch (rem) {
            case 10:
                ans = "A";
                break;
            case 11:
                ans = "B";
                break;
            case 12:
                ans = "C";
                break;
            case 13:
                ans = "D";
                break;
            case 14:
                ans = "E";
                break;
            case 15:
                ans = "F";
                break;
            default:
                ans = "" + rem;
        }
        return ans;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        A2Q6 test = new A2Q6();
       String con = test.convert(1000, 8);
        System.out.println(con);
        System.out.println(test.convert(1000, 16));
        System.out.println(test.convert(1000, 2));
    }
}