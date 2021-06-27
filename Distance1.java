import java.util.Scanner;
public class Distance1 {
        private int feet;
	private int inches;
	
        Distance1()
        {
            this.feet=0;
            this.inches=0;
        }
	public void getDistance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter feet: ");
		feet=sc.nextInt();
		System.out.print("Enter inches: ");
		inches=sc.nextInt();
	}
	public void showDistance()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	public static void main(String []s)
	{
		try
		{

			Distance1 D1=new Distance1();
			
			System.out.println("Distance entered is :"+D1.feet+"feet "+D1.inches+"inches");
                        D1.showDistance();
          	
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred :"+ e.toString());
		}
	}
    
}

