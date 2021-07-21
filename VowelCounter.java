
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		//defining variables
		int left, right, aCount=0, eCount=0, iCount=0, oCount=0, uCount=0, notVowel=0;
		String str;
		char letter;
		
		//scanner prompt
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string of text into the VowelCounter!");
		
		str = scan.nextLine(); //instantiate user string to str object
		
		left = 0; //assessing input string length and establishing left counter
		right = str.length()-1;
		
		
		while (left <= right) { //while loop advancing left counter character by character through string
			
			letter = str.charAt(left); //sets letter as the character to be evaluated at each numeric position in string
			
			switch (letter) {  //tallying lowercase vowels using switch statement
			 
			case ('a'):
				aCount = aCount +1;
				break;
			
			case 'e':
				eCount = eCount +1;
				break;
				
			case 'i':
				iCount = iCount +1;
				break;
				
			case 'o':
				oCount = oCount +1;
				break;
				
			case 'u':
				uCount = uCount +1;
				break;
				
			default:
			    notVowel = notVowel +1;
				
			}
			
			left++; //increments reading position
		
		}
		
		scan.close();
		
		//outputs
		System.out.println("a :"+ aCount);
		System.out.println("e :"+ eCount);
		System.out.println("i :"+ iCount);
		System.out.println("o :"+ oCount);
		System.out.println("u :"+ uCount);
		System.out.println("notVowel :"+notVowel);
		

	}

}
