import java.util.*;

public class ControlledWhile{
	
	public static void main(String[] args){
		// double balance = 5000;
		// double rate = 1.2;
		// int years = 0;
		// while (balance <= 10000){
		// 	balance *= rate;
		// 	++years;
		// }
		// System.out.println("It will take you " + years + "years to reach 100,000");
		// /
		int sum = 0;
		for(int i = 1; i < 100; i += 2){
			

			System.out.println(i);
			sum +=i;
		}
			System.out.print("Sum of all odd numbers between 1 to 99 including" + sum);
			//System.out.println("This is the Sum : "+sum);
	}

}