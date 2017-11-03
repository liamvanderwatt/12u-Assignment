/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizs;

import java.util.Scanner;

/**
 *
 * @author vandl4973
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public String reverseString(String word) {
        //stating vaiables
        int l = word.length();

        //our base cases
        if (l == 0) {
            return word;
        } 
            return l--,reverseString(word.c);
       
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Quiz1 test = new Quiz1();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        test.reverseString(s);
            }
        
    }

