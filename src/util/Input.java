package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public  String getString(){
        System.out.println("type something:");
        String userInput = scanner.nextLine();
        return userInput;
    }
//
    public boolean yesNo() {
        System.out.println("Enter Yes or No:");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("Yes")|| userInput.equalsIgnoreCase("y");
    }



    public int getInt(int min, int max){
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int inputNumber = scanner.nextInt();
        if (inputNumber > max || inputNumber < min) {
            inputNumber = getInt(min, max);
        }

        return inputNumber;
    }


    public int getInt(){
        System.out.println("Please enter an integer");
        int inputNumber = scanner.nextInt();
        return inputNumber;

    }

    public double getDouble(double min, double max){
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        double inputNumber = scanner.nextDouble();
        if (inputNumber > max || inputNumber < min) {
            inputNumber = getDouble(min, max);
        }

        return inputNumber;
    }



    public double getDouble(){
        System.out.println("Please enter an double number:");
        double inputNumber = scanner.nextDouble();
        return inputNumber;
    }

//constructor
    public Input(){
        scanner= new Scanner(System.in);

    }





}
