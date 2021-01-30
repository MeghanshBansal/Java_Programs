//Check Strings are anagram or not

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second String: ");
        String s2 = input.nextLine();
        Set<Character> se1 = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            se1.add(s1.charAt(i));
        }
        Set<Character> se2 = new HashSet<Character>();
        for (int i = 0; i < s2.length(); i++) {
            se2.add(s1.charAt(i));
        }
        se1.stream().sorted();
        se2.stream().sorted();
        if (se1.equals(se2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        input.close();
    }
}