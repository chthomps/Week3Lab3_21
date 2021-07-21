
import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		
		int value, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer value: ");
		
		value = scan.nextInt();
		
		if (value<2) {
			System.out.println("Please read directions and eenter a valid integer!");
			value = scan.nextInt();
		} else
				System.out.println("The sum of all even integers from 2 to " +value+ "(inclusive) is: ");
		
		for (int count=2; count<=value; count++) {
			if (count%2 ==0)
				sum+=count; //adds even counts to update sum
		}
		System.out.println(sum);
		scan.close();
			
	
	}

}
