/**
 * Checks if the string entered by the user is a palindrome. 
 * That is that it reads the same forwards as backwards like “racecar” 
 */

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.print("Check if a word is a palindrome: ");
		Scanner input = new Scanner (System.in);
		String inputString = input.nextLine().toLowerCase();
		
		//char[] sArray = inputString.toCharArray();
		
		for(Integer i = 0; i < (inputString.length())/2 ; i++){
			char frontChar = inputString.charAt(i);
			if(frontChar != inputString.charAt(inputString.length() - 1 - i)){
				System.out.println("Not a palindrome!");
				input.close();
				return;
			}
		}
		System.out.println(inputString + " is a palindrome!");
		
		input.close();
	}

}
