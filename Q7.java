import java.util.Scanner;
public class Q7 {
	public static void main(String[] args)
	{
		boolean b;
		final String t="TRUE";
		final String f="FALSE";
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String (true/false): ");
		String s=in.next();
	
		if(s.toUpperCase().compareTo(t)==0)
		{
			b=Boolean.parseBoolean(s.toLowerCase());
			System.out.println("The String is converted to boolean");
		}
		else if(s.toUpperCase().compareTo(f)==0)
		{
			b=Boolean.parseBoolean(s.toLowerCase());
			System.out.println("The String is converted to boolean");
		}
		else System.out.println("Please input true or false");
		
		
	}

}
