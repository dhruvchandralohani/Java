import java.util.Scanner;
public class Distance {
    private int feet;
	private int inches;
	
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

			Distance D1=new Distance();
			
			//read first distance
			System.out.println("Enter distance: ");
                        D1.getDistance();
			System.out.println("Distance entered is :"+D1.feet+"feet "+D1.inches+"inches");
                        D1.showDistance();
          	
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred :"+ e.toString());
		}
	}
  }
