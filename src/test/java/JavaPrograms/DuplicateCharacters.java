package JavaPrograms;

import org.testng.annotations.Test;

public class DuplicateCharacters {

	/*
	 * Find duplicate char from string -Write a program to find duplicate characters in a given String.
	 * 	Input: hackerearth
	 * 	Output: h a e r
	*/
	
	public static void main(String args[]) {
		DuplicateCharacters d= new DuplicateCharacters();
		d.duplicateChars();
	}
	
	public void duplicateChars() {
		
		String input="hackerearth";
		String output="";
		boolean haveduplicate=false;
		
		for (int i=0;i<input.length();i++) {
			for (int j=i+1;j<input.length();j++) {
			if(input.charAt(i)==input.charAt(j)) {
				output=output+input.charAt(i)+" ";
				haveduplicate=true;
			}
			}
		}
		if(haveduplicate) {
		System.out.println(output +" are duplicates in "+input);
		}else {
			System.out.println(input+" has no dupllicate charcters");
		}
	}
	@Test
	public void print() {
		System.out.println("This is test method");
	}
}
