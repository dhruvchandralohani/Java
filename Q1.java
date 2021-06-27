import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String:");
		String s=in.nextLine();
		
		count(s);
		}
	
	public static void count(String s) {
		int c_count=0;
		char v[]= {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<s.length();i++){
			for(char v2:v) {
				if(s.charAt(i)==v2) {
					c_count++;
					
				}
			}
		}	
		System.out.println("Count:"+c_count);
		
}
}




