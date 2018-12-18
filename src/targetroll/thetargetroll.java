/**
 * Hady Diab, Target Roll.
 */
package targetroll;

import java.util.Random;
import java.util.Scanner;

public class thetargetroll 
{

	public static void main(String[] args) 
	{
		Random rand=new Random();
		int random= rand.nextInt(5)+1;
		Scanner dice=new Scanner(System.in);
		System.out.println("Enter an integer number between 1 and 6: ");
		int target= dice.nextInt();
		while(target<1||target>6)
		{
			System.out.println("Please enter in an integer number between **1** and **6**!: ");
			target=dice.nextInt();
		
		}
		int roll=1;
		System.out.println("Press enter to roll the dice for the first time!");
		dice.nextLine();
		
		while(target!=(rand.nextInt(5)+1))
		{

			roll=roll+1;
			System.out.println("You rolled a "+(rand.nextInt(5)+1)+". Press enter to roll again." );
			dice.nextLine();
		}
		System.out.println("\nIt took you "+roll+ " times to roll the target number!");
	}

}
