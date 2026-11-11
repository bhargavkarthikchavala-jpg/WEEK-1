class Factorial
{
	public static void main(String args[])
	{
		int i=1;
		int fact=1;
		int no=7;
		while(i<=no)
		{
			fact=fact*i;
			i=i+1;
		}
		System.out.println("THe factorial is "+fact);
	}
}