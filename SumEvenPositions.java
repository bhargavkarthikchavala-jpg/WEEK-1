class SumEvenPositions 
{
    public static void main(String[] args) 
	{
        int number = 1234567; 
        int sum = 0;
        int position = 1;

        while (number > 0) 
	{
        	int digit = number % 10; 

                if (position % 2 == 0) 
		{
                	sum += digit;
		}
		number = number / 10;             
		position++;           
        }

        System.out.println("Sum of digits at even places: " + sum);
    }
}