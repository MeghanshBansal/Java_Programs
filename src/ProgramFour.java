//fizzbuz problem:- print all the elements from one to hundred with given condition-
//If the num is divisible by 3 print frizz;
//If the num is divisible by 5 print buz;
//If the number is divisible by 3 and 5 print frizzbuz

public class ProgramFour {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FrizBuzz");
            }else if(i%3==0){
                System.out.println("Frizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}