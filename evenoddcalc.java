import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       System.out.println("This program checks if the number is even or odd. \n insert the number you want to check:");
       int x = in.nextInt();

       if (x%2== 0){
        System.out.println("Your number is " + x + "and it is even" );
       }
       else {
        System.out.println("Your number is " + x + "and it is odd");
       }
    }
 }
