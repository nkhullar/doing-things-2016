import java.util.Scanner;

public class nestedifelse{

	public static void main(String[] args){
		String grade, doyou;


		Scanner input = new Scanner(System.in);

		do{
		System.out.print("Enter your grade: ");
		grade = input.nextLine();

		
			if(grade.equals("A")){
				System.out.println("You are an excellent student");
			}
			else if (grade.equals("B")){
				System.out.println("You are an average student");
			}
			else{
				System.out.println("You are a bad student");
			}
			System.out.print("Do you want to continue? (y/n):");
			doyou = input.nextLine();

		}
		while(doyou.equals("y"));
	}

}