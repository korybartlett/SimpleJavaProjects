import java.util.ArrayList;
import java.util.Scanner;

/*
 * Counts the number of individual words in a string. 
 * For added complexity read these strings in from a text file and generate a summary.
 * */
public class word_count {
	
	public static ArrayList<String> checkInput(String inputString){
		ArrayList<String> uniqueWords = new ArrayList<String> ();
		boolean notWord = false;
		String newString = "";
		
		for(int i = 0; i < inputString.length(); i++){			
			if(Character.isLetter(inputString.charAt(i)) ){
				notWord = false;
				newString+=inputString.charAt(i);
			}
			else{
				if(notWord){
					continue;
				}
				
				if(!uniqueWords.contains(newString) ){
					uniqueWords.add(newString);
				}
				newString = "";
				notWord = true;
			}
			
		}
		
		if(!uniqueWords.contains(newString) ){
			uniqueWords.add(newString);
		}
		
		return uniqueWords;
	}
	
	public static ArrayList<String> checkInputFromFile(String inputString){
		ArrayList<String> uniqueWords = new ArrayList<String> ();
		boolean notWord = false;
		String newString = "";
		
		for(int i = 0; i < inputString.length(); i++){			
			if(Character.isLetter(inputString.charAt(i)) ){
				notWord = false;
				newString+=inputString.charAt(i);
			}
			else{
				if(notWord){
					continue;
				}
				
				if(!uniqueWords.contains(newString) ){
					uniqueWords.add(newString);
				}
				newString = "";
				notWord = true;
			}
			
		}
		
		if(!uniqueWords.contains(newString) ){
			uniqueWords.add(newString);
		}
		
		return uniqueWords;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "This is a 5 is test\t Next Line";
		inputString = inputString.toLowerCase();
		System.out.println("Original String: " + inputString);
		
		ArrayList<String> uniqueWords = checkInput(inputString);
		
		System.out.println("Unique word count: " + uniqueWords.size());
		String finalWordList = "";
		for(int i = 0; i < uniqueWords.size(); i++){
			String uniqueWord = uniqueWords.get(i) + " ";
			finalWordList += uniqueWord;
		}
		System.out.println("Unique words: " + finalWordList);
	}

}
