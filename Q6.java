import java.util.Random;
public class Q6 
{	
	public static void main(String[] args) 
	{
		int[][] x=new int[3][3];
		Random rand=new Random();		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int u=rand.nextInt(100);
				while(true) 
				{
					if(prime(u)) break;
					else u=rand.nextInt(100);	
				}
				x[i][j]=u;
			}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static boolean prime(int x) {
		boolean b=true;
		for(int i=2;i<x;i++)
		{
			if(x%i==0) 
			{
				b=false;
			}	
		}
		if(b)
			return b;
		else
			return false;
	}
}
