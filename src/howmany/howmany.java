/**
 * Hady Diab, How Many.
 */
package howmany;

import java.util.Random;
import java.util.Scanner;

public class howmany 
{
	public static void main(String[] args) 
	{
		Random rand=new Random();
		Scanner number=new Scanner(System.in);
		System.out.println("How many times would you like to roll a dice?: ");
		int rollnumber= number.nextInt();
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		
		for(int i=0;i!=rollnumber;i++)
		{
			System.out.println(rand.nextInt(5)+1);
			switch((rand.nextInt(6)+1))
			{
			case 1:
				num1=num1+1;
				break;
			case 2:
				num2=num2+1;
				break;
			case 3:
				num3=num3+1;
				break;
			case 4:
				num4=num4+1;
				break;
			case 5:
				num5=num5+1;
				break;
			default:
				num6=num6+1;
				break;
			}
		}
		System.out.println("\nNumber 1 was rolled "+num1+" times!");
		System.out.println("\nNumber 2 was rolled "+num2+" times!");
		System.out.println("\nNumber 3 was rolled "+num3+" times!");
		System.out.println("\nNumber 4 was rolled "+num4+" times!");
		System.out.println("\nNumber 5 was rolled "+num5+" times!");
		System.out.println("\nNumber 6 was rolled "+num6+" times!");
	}

}
