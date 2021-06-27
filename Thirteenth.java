class Thirteenth
{
	static int a = 3;
	static int b;
	static void meth(int x)
	{
		System.out.println("X = " + x);
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
	static
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	static void vatest(int...v)
	{
		System.out.print("Number of args: " + v.length + " Contents: ");
		for(int x:v)
		System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		meth(42);
		System.out.println("************************************************************");
		vatest(10);
		vatest(1,2,3);
		vatest();
	}
}
