import java.util.Scanner;

public class average_calculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Input 3 numbers to find out the average!");
        System.out.println("Input first number: ");
        int x = in.nextInt();

        System.out.println("Input second number: ");
        int y = in.nextInt();

        System.out.println("Input third number: ");
        int z = in.nextInt();

        System.out.println("The average the three inputed number is: ");
        System.out.println((x+y+z)/3);
    }
}      
