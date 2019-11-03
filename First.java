package ifs2;

public class First {
	
	//Method to see if first letter repeats in string
	public String Repeat(String text) {
		
		//Declare answer variable
		String answer;
		//Save first character in variable
		char first = text.charAt(0);
		//Checks to see if character is at another place in the string
		int index = text.lastIndexOf(first);
		
		//If character is not in there at all
		if (index == -1) {
			answer = "no";
		}
		
		//If character is only at the first letter
		else if (index == 0) {
			answer = "no";
		}
		
		//If character repeats
		else {
			answer = "yes";
		}
		
		return answer;
	}

}
