import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int a = 5;
        while (a <= 15) {
            System.out.print(" "+a);
            a++;
        }

        for(int k =5;k<=15;k++){
            System.out.println(" "+k);
        }
//
        int number=0;
//
        do{
            System.out.println(number);
            number+=2;
        }
        while (number<=100) ;


//        int a = 100;
//        while (a >= -10) {
//            System.out.println(a);
//            a-=5;
//        }
//
        for (int a2 = 100; a2 >= -10; a2 -= 5) {
            System.out.println(a2);
        }

//
//        long b=2;
//
//        do{
//            System.out.println(b);
//            b*=b;
//        }
//        while (b<=1000000);
////        why does long work not int ?

        for (long b = 2; b <= 1000000; b *= b) {
            System.out.println(b);
        }
//
//
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }


        String answer;


        do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an Integer you would like to go up to? ");
                long userResponse = scanner.nextInt();


                String heading1 = "number";
                String heading2 = "squared";
                String heading3 = "cubed";

                String border = "------";
                System.out.printf("%-6s | %-6s | %-6s%n", heading1, heading2, heading3);
                System.out.printf("%-6s | %-7s | %-6s%n", border, border, border);

                for (long i = 1; i <= userResponse; i++) {

                    System.out.printf("%-6d | %-7d | %-6d%n", i, i * i, i * i * i);
                }
                System.out.println("do you wnat to continue (y/n)?");
                answer = scanner.next();

            }while (answer.equalsIgnoreCase("y"));







//
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number grade? ");
        int userInput = scanner.nextInt();

        if ( userInput>=88){
            System.out.println('A');
        }
            else if ( (userInput <88) && (userInput>= 80)){
            System.out.println('B');
        }
            else if ( (userInput <80) && (userInput>= 67)){
            System.out.println('C');
        }
             else if ( (userInput<67) && (userInput>= 60)){
            System.out.println('D');
        }
             else{
                 System.out.println('F');
             }
//
//
//

    }
}