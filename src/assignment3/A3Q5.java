/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author vandl4973
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public void swap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    public void insertionSort(String[] array) {
        // start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store postion 
            String str1 = array[i];
            String str2 = array[i]+1;
            //check values beside each other
            while (true) {
                str1.compareTo(str2);
                //if out of place swap down
                //until correct postion is reached
               if (str1.compareTo(str2) > str2.compareTo(str1)){
                   
               }
            }
        }
    }
    public void insertionSort(int[] array) {
        // start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store postion 
            int postion = i;
            //check values beside each other
            while (postion >= 0 && array[postion] > array[postion + 1]) {
                //if out of place swap down
                //until correct postion is reached
                
            }
        }


    }
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q5 test = new A3Q5();
        String[] array = {
            "zoo",
            "kite",
            "apple",
            "queen",
            "bug",
            "computer",
            "math",
            "light",
        };
        test.insertionSort(array);
    }
}
