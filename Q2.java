import java.io.*;
import java.util.Scanner;
public class Q2 {
	public static boolean check(String s,String s2) {
		boolean b=true;
		StringBuffer al=new StringBuffer();
		StringBuffer al2=new StringBuffer();
		char c[]=new char[52];
		int i,j,k=0;
		
		for( i=0;i<26;i++) 
			c[i]=((char)('a'+i));
		
		for(k=0,j=i;j<26+i;j++,k++) 
			c[j]=((char)('A'+k));
		
		int l=0;
		
		if(s.length()>s2.length())
			return false;
		else if(s.length()<s2.length())
			return false;
		else
			l=s.length();
		for(char c2:c)
		{
			for(int v=0;v<l;v++)
			{
				
				if(s.charAt(v)==c2)   
				{
					al.append(c2);
				}
			}
			for(int v=0;v<l;v++) 
			{
				if(s2.charAt(v)==c2) 
				{
					al2.append(c2);
				}
			}
		}
			
		String al3=al.toString();
		
		String al4=al2.toString();
		
		for(int v=0;v<l;v++)
		{
			if((al.charAt(v))==(al2.charAt(v)))
				{
					b=true;
					continue; 
				}
			else
				return false;
		}
		return b;
}
	public static void main(String[] args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first string:");
		String s=x.readLine();
		System.out.print("\nEnter second string:");
		String s2=x.readLine();
		System.out.print("\nAnagram:"+check(s,s2));
}

}

