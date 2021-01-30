//Write a program for largest and smallest value in an array of integers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int []arr = new int[size];
        int largest = 0;
        int smallest = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Enter the %dth value: ", i+1);
                arr[i] = input.nextInt();
                if (i == 0) {
                    largest = arr[i];
                    smallest = arr[i];
                    continue;
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
        } catch(InputMismatchException e){
            System.out.println(e);
        }
        System.out.println("\n\nSmallest in the array = " + smallest);
        System.out.println("Largest in the array = " + largest);
        input.close();
    }
}
