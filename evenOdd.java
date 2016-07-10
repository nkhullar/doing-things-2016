import java.util.Scanner;

public class evenOdd{
	
	public static void main(String[] args){
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = input.nextInt();
		if(isEven(num)){
			System.out.println(num+" is an even number");
		} else {
			System.out.println(num+" is an odd number");
		}
	}

	static boolean isEven(int n){
		if(n%2==0)
			return true;
		else
			return false;
	}

}