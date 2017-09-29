/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

import java.util.Arrays;

/**
 *
 * @author vandl4973
 */
public class SortingSearching {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {


        //keep track of wich array we are sorting
        for (int postion = 0; postion < array.length; postion++) {
            //look through the restloo6king forn a smaller number
            for (int i = postion + 1; i < array.length; i++) {
                //have we found the smallest number
                if (array[i] < array[postion]) {
                    //swap numbers
                    swap(array, i, postion);
                }
            }
        }
    }

    public void bubbleSort(int[] array) {
        //keep to the end
        int last = array.length;
        //boolean 
        boolean swap = true;
        while (swap) {
            swap = false;
            //looking for swaps
            for (int i = 0; i < last - 1; i++) {
                //did we found a value out off place
                if (array[i] > array[i + 1]) {
                    //swap
                    swap(array, i, i + 1);
                    //set flag true
                    swap = true;
                }
            }
            //move the last oostion tracker
            last--;
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
                swap(array, postion, postion + 1);
                postion--;
            }
        }


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

    public int seqentialSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            //did i find it
            if (array[i] == number) {
                //tell them where
                return i;
            }
        }
        //didnt find it
        return -1;
    }

    //binary search
    public int binarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;
        while (max > min) {
            int guess = (max + min) / 2;
            //did we find it
            if (array[guess] == target) {
                return guess;
            } else if (target > array[guess]) {
                min = guess + 1;
            }else if(target < array[guess]){
                max = guess - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        SortingSearching test = new SortingSearching();
        int numbers[] = new int[400];
        for (int i = 0; i < numbers.length; i++) {
            //make random number
            numbers[i] = (int) (Math.random() * 101);
        }


        System.out.println("BEFORE");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");

        }
        //sort here
        test.mergeSort(numbers);

        System.out.println("\nAFTER");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("");
        System.out.println(test.binarySearch(numbers, 44));
    }
}
