import java.util.Scanner;
public class aritmetic_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator for basic arithmetics");

        System.out.println("Enter the first number:");
        float first_number=input.nextFloat();

        System.out.println("Enter the second number:");
        float second_number=input.nextFloat();

        System.out.println("Enter the operator:");
        String operator=input.next();

        if (operator.equals("+")){
            float sum = first_number+second_number;
            System.out.println(sum);
        } else if (operator.equals("-")) {
            float subtraction = first_number-second_number;
            System.out.println(subtraction);
        } else if (operator.equals("*")) {
            float multiplication = first_number*second_number;
            System.out.println(multiplication);
        } else if (operator.equals("/")) {
            float division = first_number/second_number;
            System.out.println(division);
        }else{
            System.out.println("Follow the instruction above");
        }


    }
}