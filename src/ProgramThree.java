//Write a program to find common elements in two elements of type string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second String: ");
        String s2 = input.nextLine();
        Set<Character> se1 = new HashSet<Character>();
        Set<Character> se2 = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            se1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            se2.add(s2.charAt(i));
        }
        se1.retainAll(se2);
        se1.stream().forEach(x -> System.out.print(x + " "));
        input.close();
    }
}