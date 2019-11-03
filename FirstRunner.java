package ifs2;

import java.util.Scanner;
import ifs2.First;

public class FirstRunner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String text = keyboard.next();
		
		First ref = new First();
		
		System.out.println(ref.Repeat(text));
		

	}

}
