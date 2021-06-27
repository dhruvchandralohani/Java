import java.util.Scanner;
class Sixth
{
	public static void main(String[] args)
	{
		boolean flag=true;
		int i;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number to check if it is Prime ot Not: ");
		int n= in.nextInt();
		for(i=2 ; i<n/2 ; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println("It is Prime.");
		else
		System.out.println("It is not Prime.");
	}
}
