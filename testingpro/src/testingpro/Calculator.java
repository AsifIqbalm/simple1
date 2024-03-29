package testingpro;
import java.util.Scanner;

public class Calculator {
	 public static void main(String []args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Enter the First number");
	        int first_number = scan.nextInt();

	        System.out.println("Enter the Second number");
	        int second_number = scan.nextInt();

	        Calculator.sum(first_number, second_number);
	        Calculator.subtract(first_number, second_number);
	        Calculator.multiply(first_number, second_number);
	        Calculator.divide(first_number, second_number);
	    }
	 
	 public static int sum(int first_number,int second_number) {
	        //addition
	        int sum= first_number+second_number;
	        System.out.println("The sum is " +sum);
	        return sum;
	    }

	    public static int subtract(int first_number,int second_number) {
	        //substraction
	        int subtract= first_number-second_number;
	        System.out.println("The difference is  " +subtract);
	        return subtract;
	    }

	    public static int multiply(int first_number, int second_number) {
	        //Multiplication
	        int multiply= first_number*second_number;
	        System.out.println("The product is " +multiply);
	        return multiply;

	    }
	    public static int divide(int first_number,int second_number) {

	        //Division
	        int divide= first_number/second_number;
	        System.out.println("The division gives " +divide);
	        return divide;
	    }

}
