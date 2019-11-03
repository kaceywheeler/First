package ifs2;
//Import scanner
import java.util.Scanner;
//Import first class
import ifs2.First;

public class FirstRunner {

	public static void main(String[] args) {
		
		//Create new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Gets user input for text
		System.out.println("Enter a string: ");
		String text = keyboard.next();
		
		//Creates new object
		First ref = new First();
		
		//Calls method and prints output
		System.out.println(ref.Repeat(text));
		

	}

}
