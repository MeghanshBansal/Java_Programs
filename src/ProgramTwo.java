//Write a program to insert an element on a specific position into an array without overriding;

import java.util.*;

public class ProgramTwo {
    static int[] arr = new int[100];
    static int pos = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'y';
        while (choice == 'y') {
            List<Integer> values_ = new ArrayList<Integer>();
            System.out.println("Enter the values: ");
            String []sc = input.nextLine().split(" ");
            for (int i = 0; i < sc.length; i++) {
                values_.add(Integer.parseInt(sc[i]));
            }
            int []values = new int[values_.size()];
            Iterator<Integer> iterator = values_.iterator();
            for (int i = 0; i < values.length; i++)
            {
                values[i] = iterator.next().intValue();
            }
            if (values.length == 2) {
                insert(values[0], values[1]);
            } else {
                insert(values[0]);
            }
            System.out.println("Do you want to insert again?:");
            choice = input.nextLine().charAt(0);
        }
        for (int i = 0; i <=pos; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(pos);
        input.close();
    }

    public static void insert(int value) {
        if (pos == 99) {
            System.out.println("Overflow");
        } else {
            arr[pos] = value;
            pos++;
        }
    }

    public static void insert(int value, int index) {
        if (pos == 99) {
            System.out.println("Overflow");
        } else {
            int i = pos;
            while (i >= index) {
                arr[i + 1] = arr[i];
                --i;
            }
            System.out.println(i);
            arr[index] = value;
            if (index>pos){
                pos = index;
            }else{
                pos = pos + 1;
            }
        }
    }
}