/*
 * Enter a string and the program will reverse it and print it out.
 * */

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pc commit
			Scanner user_input = new Scanner(System.in);
			
			System.out.print("Input desired string for reversal: ");
			String input = user_input.nextLine(); 
			System.out.println("Initial string: "+input);
			//String reverse = new StringBuilder(input).reverse().toString();
			String reverse = "";
			
			for(int i = input.length() - 1; i >=0; i--){
				reverse+=input.charAt(i);
			}
			
			System.out.println("Reversed string: "+reverse);
			
			user_input.close();
				
		
	}

}
