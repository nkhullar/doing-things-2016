import java.util.Scanner;

public class questionanswer{

	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		String answer = "Watson";
		String response = "";
		System.out.println("Lets play a guessing game. You get three tries...");
		
		for(int i = 0; i < 3; i++){
			System.out.print("What was the computer that was used by IBM?");
			response = input.nextLine();

			if(response.equals(answer)){
			System.out.println("Thats right!!");
			break;
			} else {
			System.out.println("Sorry. Thats wrong.");
			
			}
		}
		
	}
}