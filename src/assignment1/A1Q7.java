/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author vandl4973
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating intail vairable 
        int year = 1999;
        double pop = 6000;
        //loop that increase the year and population count
        while (pop !=10000) {
            pop =pop*1.4;
            System.out.println(pop);
            year = year+1;
            if (pop > 10000) {
                System.out.println("This year the population will exceed 10 billion " + year);
                break;
            }
           
        }
    }
}
