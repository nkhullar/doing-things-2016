import java.util.Scanner;

public class ifelse{
	public static void main(String[] args){
		int hoursWorked, rate, empSalary;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hours worked: ");
		hoursWorked = input.nextInt();

		System.out.print("Enter rate: ");
		rate = input.nextInt();

		if(hoursWorked > 40){
			empSalary = (hoursWorked*rate)+((hoursWorked-40)*(rate*2));
			System.out.println("This is your salary with overtime"+empSalary);
		}
		else{
			empSalary = hoursWorked*rate;
			System.out.println("This is your salary without overtime"+empSalary);
		}



	}
}