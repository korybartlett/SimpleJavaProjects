/*
 * Enter a string and the program counts the number of vowels in the text. 
 * For added complexity have it report a sum of each vowel found.
 * */

import java.util.*;

public class CountVowels {

	public static boolean isInteger(String s){
		char[] sArray = s.toCharArray();
		Map<Character, Integer> vowels = new HashMap<Character, Integer>();
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		
		for(Integer i = 0; i < sArray.length; i++){
			if(vowels.containsKey(sArray[i]) ){
				Integer counter = vowels.get(sArray[i]);
				counter += 1;
				vowels.put(sArray[i], counter);
				//System.out.println("Found vowel: " + sArray[i]);
			}
		}
		
		Integer vowelTotal = 0;
		for(Map.Entry<Character, Integer> entry : vowels.entrySet() ){
			vowelTotal += entry.getValue();
			if(entry.getValue() < 1){
				continue;
			}
			System.out.println(entry.getKey() + ": " +entry.getValue());
		}
		System.out.println("Total count of vowels: " + vowelTotal);
		return true;
	}
	
	public static void main(String[] args) {
		while(true){
			System.out.print("Enter string: ");
			Scanner input = new Scanner (System.in);
			String inputString = input.nextLine().toLowerCase();
			
			if(isInteger(inputString)){
				break;
			}
			
			input.close();
			
		}
		
	}

}
