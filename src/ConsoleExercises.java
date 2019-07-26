
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f ", pi);
//        ?printf    %3.2f?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);


        System.out.print("Enter Three words: ");
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        String userInput4 = scanner.next();

        System.out.println(userInput2 );
        System.out.println(userInput3);
        System.out.println(userInput4 );

        scanner.nextLine();
        System.out.print("Enter sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

//        System.out.print("Enter length and width: ");
//        int userInput5 = scanner.nextInt();
//        int userInput6 = scanner.nextInt();
//
////       ? scanner.printf ?
//        System.out.println( userInput5);
//        System.out.println( userInput6);



        System.out.printf("what is the width of the classroom?:");
        String answer=scanner.nextLine();
        double width=Double.valueOf(answer);
//        System.out.println(width);

        System.out.printf("what is the length of the classroom?:");
        String response=scanner.nextLine();
        double length=Double.valueOf(response);
//        System.out.println(length);
        System.out.printf("area of classroom: %.2f%n",length*width);
        System.out.printf("area of classroom: %.2f%n",length*2+width*2);

//       ? scanner.useDelimiter(",")("n/"); ?  modifies how next is going to function.

    }
    }

//
//    public class Sandbox{
//    static void fizzBuzz(int num) {
//        for (int i = 1; i < num; i++) {
//            if (i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            }
//            else if(i%5==0){
//                System.out.println("buzz");
//            }
//            else if(i%3==0){
//                System.out.println("fizz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }
//    }
//    public static void main(String[] args){
//    fizzBuzz(31);
//? why use public static void and not just fizzbuzz(31);? instead of function it is public static void main?
//?how to see it in the console?

//    }
//}