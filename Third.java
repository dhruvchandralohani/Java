import java.util.Scanner;
class Third
{
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the elemnts of the array: ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Elemnts of the array are: ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
