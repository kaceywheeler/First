package ifs2;

public class First {
	
	public String Repeat(String text) {
		
		String answer;
		char first = text.charAt(0);
		int index = text.lastIndexOf(first);
		
		if (index == -1) {
			answer = "no";
		}
		
		else if (index == 0) {
			answer = "no";
		}
		else {
			answer = "yes";
		}
		
		return answer;
	}

}
