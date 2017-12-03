import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Counts the number of individual words in a string. 
 * For added complexity read these strings in from a text file and generate a summary.
 * */
public class word_count {
	
	public static void checkInput(String inputString){
		System.out.println("Original String: " + inputString);
		inputString = inputString.toLowerCase();
		
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
		
		System.out.println("Unique word count: " + uniqueWords.size());
		String finalWordList = "";
		for(int i = 0; i < uniqueWords.size(); i++){
			String uniqueWord = uniqueWords.get(i) + " ";
			finalWordList += uniqueWord;
		}
		System.out.println("Unique words: " + finalWordList+ "\n");
	}
	
	public static void checkInputFromFile(String fileName){
		String inputString = "";
		System.out.println("Reading from text file");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			
			while(line != null){
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			System.out.println("Original String: " + sb.toString());
			inputString = sb.toString().toLowerCase();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		System.out.println("Unique word count: " + uniqueWords.size());
		String finalWordList = "";
		for(int i = 0; i < uniqueWords.size(); i++){
			String uniqueWord = uniqueWords.get(i) + " ";
			finalWordList += uniqueWord;
		}
		System.out.println("Unique words: " + finalWordList + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenString = "This is a 5 is test\t Next Line";
		checkInput(givenString);
		
		System.out.print("Enter string: ");
		Scanner input = new Scanner (System.in);
		String userInputString = input.nextLine();
		input.close();
		checkInput(userInputString);
		
		String fileName = "files/words.txt";
		checkInputFromFile(fileName);
		

	}

}
