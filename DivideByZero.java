import java.util.Scanner;
class DivideByZero
{
	public static void main(String[] args)
	{
		try
		{
			int a,b,c;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Dividend: ");
			a=in.nextInt();
			System.out.println("Enter the Divisor: ");
			b=in.nextInt();
			c=(a/b);
			System.out.println("The Result is: " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide By Zero.");
			System.out.println("EXCEPTION: " + e);
		}
	}
}
