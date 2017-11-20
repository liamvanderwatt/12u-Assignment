/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author vandl4973
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public int countOnes(int[] array){
        //counter to keep track of ones
       int count =0;
       //going through the array checking for ones
       for (int i = 0; i < array.length; i++) {
           //did we find a one
           if (array[i]==1){
               count++;
           }
       }  
        System.out.println("There are "+count +" ones");
       return count;
    }
    public static void main(String[] args) {
        
        A3Q3 test = new A3Q3();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 2);
        }
        test.countOnes(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
       }
        
    }
}
