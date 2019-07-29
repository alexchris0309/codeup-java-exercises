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

        public static int getInteger(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int inputNumber= scanner.nextInt();
            if(inputNumber > max|| inputNumber<min){
                inputNumber = getInteger(min,max);
            }
            return inputNumber;
        }

        public static void getFactorial() {
        int num = getInteger(1, 10);
        String output = "";
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
            output += i + "! = " + (total) + "\n";
        }
        System.out.println(output);
        }

        public static void roll() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("r ")
        int sides=10;
        int die=(int)(Math.random()*sides)+1;
        System.out.println(die);

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

    }

}




