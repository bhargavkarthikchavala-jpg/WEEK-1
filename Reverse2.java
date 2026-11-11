class Reverse2
{
	public static void main(String args[])
	{
		int no =196,rev=0,a;
		while(no>0)
		{
			a=no%10;
			rev=rev*10+a;
			no=no/10;
		}
		System.out.println("The reverse ="+rev);
	}
}