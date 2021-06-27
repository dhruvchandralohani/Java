import java.util.Scanner;
public class ConvDecToBin {
  public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = a + " " + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
    }
}
    

