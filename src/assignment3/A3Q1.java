/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author vandl4973
 */
public class A3Q1 {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        //keep track of which array we are sorting
        for (int postion = 0; postion < array.length; postion++) {
            //look through the rest looking for a smaller number
            for (int i = postion + 1; i < array.length; i++) {
                //have we found the smallest number
                int smallest = i;
                if (array[i] < smallest) {
                    //swap with smallest number numbers
                    smallest = i;
                }else{
                    swap(array, i, smallest);
            }
        }
    }
    }

    public static void main(String[] args) {
        // TODO code application logic here
         A3Q1 test = new A3Q1();
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            //make random number
            numbers[i] = (int) (Math.random() * 101);
        }


        System.out.println("BEFORE");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        //sort here
        test.selectionSort(numbers);

        System.out.println("AFTER");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
