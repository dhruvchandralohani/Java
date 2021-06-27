import java.util.Scanner;
public class Q3 {
	static Scanner in=new Scanner(System.in);
	final static int FIV=5;	
	final static int TEN=10;
	final static int FIF=50;
	final static int HUN=100;
	public static void main(String[] args) 
	{
		System.out.print("Enter the amount:");
		int amt=in.nextInt();
		notes(amt);
	}
	
	public static void notes(int amt) 
	{
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		if(amt%FIV==0) 
		{
			count=(amt/FIV);
		}
		
		if(amt%TEN==0) 
		{
			count2=(amt/TEN);
		}
		if(amt%FIF==0) 
		{
			count3=(amt/FIF);
		}
		if(amt%HUN==0) 
		{
			count4=(amt/HUN);
		}
		
		System.out.println("no. of notes of Rs"+FIV+":"+count);
		System.out.println("OR");
		System.out.println("no. of notes of Rs"+TEN+":"+count2);
		System.out.println("OR");
		System.out.println("no. of notes of Rs"+FIF+":"+count3);
		System.out.println("OR");
		System.out.println("no. of notes of Rs"+HUN+":"+count4);
	}
}
