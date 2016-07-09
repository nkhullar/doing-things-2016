import java.util.Scanner;

public class Letter{
	public static void main(String[] args){
		String name, yourName, present;
		int age;
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		System.out.print("Enter gifter Name:");
		name = inputString.nextLine();
		System.out.print("Enter the present:");
		present = inputString.nextLine();
		System.out.print("Enter your age:");
		age = inputInt.nextInt();
		System.out.print("What is your name?:");
		yourName = inputString.nextLine();
		System.out.println();
		System.out.println();

		System.out.println("Dear " + name + ",");
		System.out.println();
		System.out.println("This is the present " + present + "that you were supposed to get.");
		System.out.println("I hope your last year was fun when you were " + (age-1) + ".");
		System.out.println("Well now you are " + age + ". And I hope you are doing well.");
		System.out.println();
		System.out.println("Yours Truly,");
		System.out.println(yourName);

		//System.out.println("Enter your Name");
		//System.out.println("Enter your age");
	}
}