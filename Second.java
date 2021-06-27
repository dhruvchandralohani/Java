import java.util.Scanner;
public class Second
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter the number to calculate its Factorial:");
		n=in.nextInt();
		for(int i=n ; i>0 ; i--)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial is: "+ fact);
	}
}
