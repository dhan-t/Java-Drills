import java.util.Scanner;

public class basic_calculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

    System.out.println("What operation would you like to do? \n (*,/,+,-)");
        char operation = in.next().charAt(0);

//Chooses operation based on the input.
    switch (operation) {
        case '*':
            System.out.println("Input numbers :");
                int m1 = in.nextInt();
            System.out.println("x ");
                int m2 = in.nextInt();
            System.out.println("= " +  (m1*m2) );
            break;
        case '/':
            System.out.println("Input numbers :");
                int d1 = in.nextInt();
            System.out.println("/ ");
                int d2 = in.nextInt();
            System.out.println("= " +  (d1/d2) );
            break;
        case '+':
            System.out.println("Input numbers :");
                int a1 = in.nextInt();
            System.out.println("+ ");
                int a2 = in.nextInt();
            System.out.println("= " +  (a1+a2) );
            break;    
        case '-':
            System.out.println("Input numbers :");
                int s1 = in.nextInt();
            System.out.println("-");
                int s2 = in.nextInt();
            System.out.println("= " +  (s1-s2) );
            break;    
        default:
            System.out.println("Characters are only accepted.");
            break;
        }
    }
}
