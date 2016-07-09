import java.util.Scanner;

public class GoScanner{
	public static void main(String[] args){
		String name, name_oneword;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = input.nextLine();
		//name_oneword = input.next(); // if you know there will be just one word in the input
		//name_oneword = input.next();
		System.out.println("Your name is :" + name);
		//System.out.println("Your first name is:" + name_oneword);
	}
}