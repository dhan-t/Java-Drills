import java.util.Scanner;

public class looping_to_ten {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number to be multiplied: ");
        int x = in.nextInt();

        for(int i = 1; i <=10 ; i++){
            System.out.println(x + "x" + i + "=" + x * i ) ;
        }
    }      
}
