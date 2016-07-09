import java.io.*;
import java.util.Scanner;

class Name{
	private String first;
	private String middle;
	private String last;

	public Name (String f,String m, String l){
		first = f;
		middle = m;
		last = l;
	}

	public Name(String f, String l){
		first = f;
		middle = "";
		last = l;
	}

	public Name (String l){
		first = "";
		middle = "";
		last = l;
	}
	public void Display (Name person){
		System.out.println(person.first, person.last);
	}
	public static void main(String [] argv){
		Name namit = new Name(namit,khullar);

	}

}

