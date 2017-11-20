/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Arrays;

/**
 *
 * @author vandl4973
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
   public int smallestMissingNumber(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i]+1  != array[i+1]){
                return array[i] +1;   
            } 
        }
        return -1;
    }
     public void mergeSort(int[] array) {
        //if we are at 1 done
        if (array.length <= 1) {
            return;
        }
        // divide into 2 arrays
        int split = array.length / 2;
        //create 2 arrays
        int[] front = Arrays.copyOfRange(array, 0, split);
        int[] back = Arrays.copyOfRange(array, split, array.length);

        //recusaily sort
        mergeSort(front);
        mergeSort(back);

        //put numbers in correct spot 
        int fSpot = 0;
        int bSpot = 0;
        for (int i = 0; i < array.length; i++) {
            //no more items in front
            if (fSpot == front.length) {
                array[i] = back[bSpot];
                bSpot++;
            } else if (bSpot == back.length) {
                array[i] = front[fSpot];
                fSpot++;
            } else if (front[fSpot] < back[bSpot]) {
                //put front item in
                array[i] = front[fSpot];
                fSpot++;
            } else {
                //put back item in
                array[i] = back[bSpot];
                bSpot++;
            }

        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q2 test = new A3Q2();
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            //make random number
            numbers[i] = (int) (Math.random() * 11);
            
    }
        test.mergeSort(numbers);
       System.out.println("numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        
       int store = test.smallestMissingNumber(numbers);
        
        System.out.println("the smallest missing number is "+ store);
}
}
