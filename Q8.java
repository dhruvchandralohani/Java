import java.util.StringTokenizer;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=in.nextLine();
		StringTokenizer s2=new StringTokenizer(s," ");
		while(s2.hasMoreElements())
			System.out.println("Token: "+s2.nextToken());
	}

}
