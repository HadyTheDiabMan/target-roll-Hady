import java.util.Scanner;

public class GeometryCalculator
{

	public static void main(String[] args) 
	{
		Scanner bread= new  Scanner (System.in);
		System.out.print("Please enter your name: ");
		String name;
		name= bread.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the Geometry Calculator!");
		System.out.println("Press enter to continue...");
		bread.nextLine();
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measure of the base: ");
		String baseStr = bread.nextLine();
		System.out.print("\nPlease enter the measure  of the height: ");
		String heightStr= bread.nextLine();
		double base;
		base= Double.parseDouble(baseStr);
		double height= Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measure:  ");
		String unit = bread.nextLine();
		double area= .5*(base*height);
		System.out.println("The area of the triangle is " + area +" "+unit + "^2");
		System.out.println("Press enter to continue...");
		bread.nextLine();
		System.out.println("AREA OF A RECTANGULAR PRISM");
		System.out.print("Please enter the measure of the length: ");
		String recLength = bread.nextLine();
		System.out.print("\nPlease enter the measure  of the width: ");
		String recWidth=bread.nextLine();
		System.out.print("Please enter the measure  of the height: ");
		String recHeight=bread.nextLine();
		System.out.print("Please enter the unit of measure: ");
		String recUnit=bread.nextLine();
		double length;
		length=Double.parseDouble(recLength);
		double width;
		width=Double.parseDouble(recWidth);
		double recheight;
		recheight=Double.parseDouble(recHeight);
		
		double recarea= (length*width*recheight);
		
		System.out.println("The area of the rectangular prism is " + recarea +" "+recUnit + "^2");
		
		System.out.println("Press enter to continue...");
		bread.nextLine();
		
		System.out.println("SOLVING A QUADRATIC FORMULA!");
		
		System.out.print("Please enter the a variable: ");
		String aVar = bread.nextLine();
		System.out.print("\nPlease enter the b variable: ");
		String bVar= bread.nextLine();
		System.out.print("Please enter the c variable: ");
		String cVar=bread.nextLine();
		
		double a;
		a=Double.parseDouble(aVar);
		double b;
		b=Double.parseDouble(bVar);
		double c;
		c=Double.parseDouble(cVar);
		
		double sqrtbeginner=(b*b+(-4*a*c));
		
		double sqrtsqrt = java.lang.Math.sqrt(sqrtbeginner);
		
		double nextstep=(-b-sqrtsqrt);
		
		double thirdstep=(nextstep/(2*a));
		
		double newnextstep=(-b+sqrtsqrt);
		
		double secondthird=(newnextstep/(2*a));
		
		System.out.println("The solutions for the quadratic equation is "+ thirdstep+ " and "+secondthird);
		
		
		
		

	
	}


}
