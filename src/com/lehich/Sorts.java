package com.lehich;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;
import static com.lehich.Array.printArray;
public class Sorts extends HeapSort {
public Sorts()
{}
public static void coutingS(int[] array){
    long starttime =  System.currentTimeMillis();
    int[] aux = new int[array.length];
    int min = array[0];
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        } else if (array[i] > max) {
            max = array[i];
        }
    }
    int[] counts = new int[max - min + 1];

    for (int i = 0;  i < array.length; i++) {
        counts[array[i] - min]++;
    }
    counts[0]--;
    for (int i = 1; i < counts.length; i++) {
        counts[i] = counts[i] + counts[i-1];
    }
    for (int i = array.length - 1; i >= 0; i--) {
        aux[counts[array[i] - min]--] = array[i];
    }
    System.out.println();
    out.println("After CSorting: ");
    printArray(aux);
    long timeout = System.currentTimeMillis() - starttime;
    System.out.println();
    System.out.println("Time of CountSort = " + timeout);

}
public static void bubbleS(int[] array){
    long starttime = currentTimeMillis();
    int[] workarr = new int[array.length];
    for(int i=0;i<workarr.length;i++)
    {
        workarr[i] = array[i];
    }
    int remaining = workarr.length - 1;
    for(int x = 0; x < (workarr.length-1); x++) {
        for(int y = 0; y < (remaining); y++) {
            int tmp;
            if ( workarr[y] > workarr[y+1] ) {
                tmp =  workarr[y+1];
                workarr[y+1] = workarr[y];
                workarr[y] = tmp;
            }
        }
        remaining--;
    }
    System.out.println("Sorting by Bubble: ");
    printArray(workarr);
    long timeout = currentTimeMillis() - starttime;
    System.out.println();
    System.out.println("Time of BubbleSort = " + timeout);
}
}
