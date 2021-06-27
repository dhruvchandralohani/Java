import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=in.nextLine();
		Pallindrome(s);
	}
	
	public static void Pallindrome(String s) 
	{
		int k=0,space=0;
		String words[]=new String[5];
		for(int i=0;i<s.length();i++) 
		{
		
			if(s.charAt(i)==' ') 
			{
				words[k]=s.substring(space,i);
				k++;
				space=i+1;
			}
			if(s.charAt(i)=='\0')
			{
				words[k]=s.substring(space,i);
				k++;
				space=i+1;
			}
			if(i==(s.length()-1))
			{
				words[k]=s.substring(space,i+1);
				k++;
				space=i+1;
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println();
			System.out.println("Word: "+words[i]+"\tPallindrome: "+check(words[i]));
			
		}
		
	}
	
	public static boolean check(String s)
	{
		boolean b=true;
		try {
			
		for(int i=0;i<s.length();i++) 
		{
			if((s.charAt(i))!=(s.charAt(s.length()-1-i)))
			{
				b=false;
			}
		}
		}
		catch(Exception e) {};
		return b;
	}

}
