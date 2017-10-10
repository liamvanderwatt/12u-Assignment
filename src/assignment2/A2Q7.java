/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author vandl4973
 */
public class A2Q7 {    
     public boolean isPalindrome(String s, int length) {
         //seeing how long the word is
        int size = s.length();
        //base case
        if (size == 0) {
            return true;
        }
        //checking oif it is equal
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
           if (s.length()>=3) 
               //move the postions by one
               return isPalindrome(s.substring(1, s.length()-1), 99);
           return true;
        }
        return false;      
    }
    public static void main(String[] args){
        A2Q7 test = new A2Q7();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        
        
        System.out.println(test.isPalindrome(s, 10));
    }
    
   
}
