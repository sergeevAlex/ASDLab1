package com.lehich;

import static java.lang.System.out;
public class Array {

static public int[] intArray;
    public Array(){
    }
    public static int[] createArray(int size){
        intArray = new int[size];
        //Заполнение
        for(int i = 0;i<size;i++)
        {
            intArray[i]=(int) (Math.random()*100000);
        }
        return intArray;
    }
    public static void printArray(int[] Array)
    {
        int size = Array.length;
        for(int i = 0;i<size;i++)
        {
            out.print(Array[i] + " ");
        }
    }
}