import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] x=new int[3][3];
		System.out.println("Enter Matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=in.nextInt();
			}
			
		}
		System.out.println("Symmetric Matrix: "+check(x));
	}
	public static boolean check(int[][] a) {
		boolean b=true;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				if(a[i][j]!=a[j][i])
					b=false;
			}
		}
		return b;
	}
}
