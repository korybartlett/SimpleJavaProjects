/**
 * Projet Euler: Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/**
 * @author Kory
 *
 */
public class SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean allDivisible = false;
		int smallestPostiveNumber = 2520;
		do{
			/*
			 * 10
			 * 2
			 * 5
			 * 4
			 * 19
			 * 9
			 * 3		
			 * 6
			 * 17
			 * 8
			 * 13
			 * 11
			 * 7
			 * */
			smallestPostiveNumber++;
			if(smallestPostiveNumber % 20 != 0){
				continue;
			}
			if(smallestPostiveNumber % 19 != 0){
				continue;
			}
			if(smallestPostiveNumber % 18 != 0){
				continue;
			}
			if(smallestPostiveNumber % 17 != 0){
				continue;
			}
			if(smallestPostiveNumber % 16 != 0){
				continue;
			}
			if(smallestPostiveNumber % 13 != 0){
				continue;
			}
			if(smallestPostiveNumber % 11 != 0){
				continue;
			}
			if(smallestPostiveNumber % 7 != 0){
				continue;
			}
			if(smallestPostiveNumber % 5 != 0){
				continue;
			}
			if(smallestPostiveNumber % 3 != 0){
				continue;
			}
			else
				allDivisible = true;
		}while(!allDivisible);
		
		System.out.println("Answer: " + smallestPostiveNumber);
	}

}
