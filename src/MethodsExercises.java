import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {


//
        public static double add(double num, double num2) {
            return num+num2;
        }

        public static double sub(double num1, double num2) {
            return num1-num2;
        }

        public static double mult(double num1, double num2) {
            return num1*num2;
        }

        public static double div(double num1, double num2) {
            return num1/num2;
        }

        public static double mod(double num1, double num2) {
        return num1%num2;
        }

//        get integer as recursion

        public static int getInteger(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between "+min+ " and "+ max+": ");
            int inputNumber= scanner.nextInt();
            if(inputNumber > max|| inputNumber<min){
                inputNumber = getInteger(min,max);
            }
            return inputNumber;
        }
//
////        get integer as loop
//          public static int getInteger(int min, int max){
//            int answer=0;
//            Scanner scanner=new Scanner(System.in);
//
//            do{
//                System.out.print("Enter a number between 1 and 10: ");

//                answer= scanner.nextInt();
//                if(answer >= min && answer <=max)
//                return answer;
//
//            } while (true);
//            return answer;
//        }


        public static void getFactorial() {
        int fact = getInteger(1, 10);
        String output = "";
        long total = 1;
        for (int i = 1; i <= fact; i++) {
            total *= i;
            output += i + "! = " + (total) + "\n";
        }
            System.out.println(output);
        }


//
//        pulbic static void factorialGame(){
//            scanner scanner = new Scanner(System.in);
//            do{
//                int fact = getInteger(1,10);
//                factorial
//            }
//    }





//        dice roll

        public static void roll() {
        int sides=10;
        int die1=(int)(Math.random()*sides)+1;
        int die2=(int)(Math.random()*sides)+1;

            System.out.println(die1);
            System.out.println(die2);


        }

//        roll dice game with prompt
        public static int rollDie(int sides){
            return (int) Math.ceil(Math.random()*sides);
        }

        public static void rollDice(){
            System.out.println("we will roll two dice, How many sides on each?");
            int sides=getInteger(4,20);
            int die1=rollDie(sides);
            int die2=rollDie(sides);
            System.out.printf("you rolled a %d and a %d.\n",die1,die2);
    }





//    multiply with out using *

    public static double multiply(double num,double num2){
    double result=0;
    for(int i=0; i<num2; i++){
        result+=num;
    }
    return result;
}



    public static void main(String[] args) {
        System.out.println(add(4, 5));
        System.out.println(sub(4, 5));
        System.out.println(mult(4, 5));
        System.out.println(div(4, 5));
        System.out.println(div(4, 3));
        System.out.println(getInteger(1, 10));
        getFactorial();
        roll();
        System.out.println(multiply(4,4));
        rollDice();

    }

}




