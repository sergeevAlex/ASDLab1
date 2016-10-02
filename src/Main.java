import com.lehich.Array;

import static com.lehich.Sorts.bubbleS;
import static com.lehich.Sorts.coutingS;
import static java.lang.System.out;

import java.util.Scanner;

public class Main extends Array {
    public static void main(String[] args) {
        int size;
        System.out.println("Введите размер массива:");
        Scanner b = new Scanner(System.in);
        size = b.nextInt();
        createArray(size);
        printArray(intArray);
        coutingS(intArray);
        bubbleS(intArray);










    }



}