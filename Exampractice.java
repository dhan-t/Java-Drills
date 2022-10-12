import java.util.Scanner;

public class Exampractice {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

// Part 1: Conversions
// Print the converted values

//1. Create a method to convert celsius to fahrenheit. 
        System.out.print("Enter temperature in celsius: ");
            double c = scan.nextDouble();
                System.out.println("This is the temperature in fahrenheit: " + ((c*1.8)+32));

// 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
            double f = scan.nextDouble();
                System.out.println("This is the temperature in celsius: " + ((f-32)*.5556) );

// 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
            double seconds = scan.nextDouble();
                System.out.println(seconds + "This is the time in minutes: " + (seconds/60));

// 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
            double hours = scan.nextDouble();
                System.out.println("Your hour  in minutes: " + (hours*60));

// 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
            double megabytes = scan.nextDouble();
                System.out.println("In gigabytes: " + (megabytes*100));
        
/* Part 2: Conditions
Display "valid" if it is true.
Display "invalid" if it is false. */

// 6. Create a condition to check if the length given mobile number is valid (inspo)
        System.out.print("Enter your 11 digit mobile number: ");
            String mobileNumber = scan.next();
                if (mobileNumber.length()== 11){
                    System.out.println("Your number is valid");
                    } 
                else {
                        System.out.println("Please input a valid number.");
                    }
         
 // 7. Create a condition to check if your bestfriend's first name is in (copied)
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
            String bestfriend = scan.next();
                if (bestfriend == bestfriend.toUpperCase()) {
                    System.out.println("valid");
                }
                else {
                    System.out.println("invalid");
                }


// 8. Create a condition to check if the answer is correct. answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
            String capital = scan.next();
                switch (capital) {
                    case "MANILA", "manila", "Manila","Maynila":
                        System.out.println("true");
                            break;
                    default:
                        System.out.println("False");
                            break;
                        }

//  9. Create a condition to check if the answer belongs to one of the five human senses: sight, touch, hearing, smell, taste.
            System.out.print("Enter one of the five human senses: ");
                String sense = scan.next();
                    switch (sense) {
                        case "sight", "Sight", "Vision", "vision", "SIGHT", "VISION":
                        case "touch", "Touch", "TOUCH":
                        case "hearing", "hear", "HEARING", "Hearing":
                        case "smell", "Smell", "SMELL":
                        case "taste", "Taste", "TASTE":
                            System.out.println("True");
                                break;
                        default:
                            System.out.println("false");
                                break;
                            }
        
        
// 10. Create a condition to detect if a word is present in the input. (copied)
            System.out.println("Use the word \"love\" in any sentence");
                String love = scan.nextLine();
                    if (love.contains("love")) {
                        System.out.println("valid");
                    }
                    else {
                        System.out.println("invalid");
                    }

        scan.close();
    }
}
