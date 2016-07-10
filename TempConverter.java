import java.util.Scanner;

public class TempConverter{
	public static void main(String[] args){
	 double temp;
	 String convert;

	 Scanner inputTemp = new Scanner(System.in);
	 Scanner inputConvert = new Scanner(System.in);

	 System.out.print("Please enter temperature:");
	 temp = inputTemp.nextInt();

	 System.out.print("Please enter Conversion to (F or C): ");
	 convert = inputConvert.next();

		 if(convert.equals("F")){
		 	System.out.println("The conversion to Farenheight is: " + CToF(temp) + "F");
		 } else {
		 	System.out.println("The conversion to Celcius is: " + FToC(temp) + "C");
		 }
	}

	static double FToC(double t){
		return (t - 32)*(5.0/9.0);
	}

	static double CToF(double t){
		return ((t*(9.0/5.0))+32);
	}
}