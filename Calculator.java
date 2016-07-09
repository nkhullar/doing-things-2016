import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		String op;
		double num1, num2;
		Scanner inputOp = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		num1 = inputNum.nextInt();
		System.out.print("Enter the second number: ");
		num2 = inputNum.nextInt();
		System.out.print("Enter the operator");
		op = inputOp.next();

		if(op.equals("+")){
			System.out.println("Sum is: " + (num1 + num2));
		} else if(op.equals("-")){
			System.out.println("Difference is: " + (num2 - num1));
		} else if (op.equals("*")){
			System.out.println("Multiplication of two number is: " + (num1*num2));
		} else if (op.equals("/")){
			System.out.println("Division of two numbers is :" + (num1/num2));
		}
	}
}