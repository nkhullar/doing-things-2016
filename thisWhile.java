import java.util.Scanner;

public class thisWhile{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int grade, count = 0, total = 0;
		double av;
		System.out.println("This program is supposed to print the average of a grade");
		System.out.print("Enter a grade. (-1 to quit)");
		grade = input.nextInt();

		while(grade != -1){
			total +=grade;
			++count;
			System.out.print("Enter a grade (-1 to quit): ");
			grade = input.nextInt();
		}
		av = total/count;
		System.out.println("Average grade is "+ av);
	}
}