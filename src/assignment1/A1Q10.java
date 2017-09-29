/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author vandl4973
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //telling user what to do;
        System.out.println("Type as many words as you like type exit to stop");
        //vairable to store number of words entered
        int input = 0;
        String words;
        //vairable to end while loop
        boolean end = true;
        while (end = true) {
            //keeping the words entered
            words = in.nextLine();
            //checking if the word is exit
            if (words.equals("exit")) {
                System.out.println("you typed " + input + " words ");
                end = false;
            }
            //increasing the counter
            input++;
        }
    }
}
