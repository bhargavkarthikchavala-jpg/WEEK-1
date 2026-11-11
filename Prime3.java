class Prime3
{
	public static void main(String args[])
	{
		int no=7,i,count=0;
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			count=count+1;
		}
		if(count==2)
		System.out.println("THe enterd number is a prime number");
		else
		System.out.println("The enterd number is not a prime number");
	}
}
