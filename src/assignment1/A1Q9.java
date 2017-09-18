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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //asking user for ten words
        System.out.println("please enter 10 words");
        //an array that stores the vairables
        String words[] = new String[10];
        double worda = 0;
        for (int i = 0; i < words.length; i++) {
            words[i] = in.nextLine();
        }
        for (int a = 0; a <= 8;) {
            for (int b = 1; b <= 9;) {
                worda = words[a].length() + words[b].length();
                a = a + 2;
                b = b + 2;
                if (a == 8) {
                    worda = worda / 10;
                    System.out.println("This is the word average " + worda);
                }
            }
        }
    }
}