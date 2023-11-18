package tjavaprogram;

/*public class PrimeNumberorNot {

	public static void main(String[] args) {
		//2 Conditions should satisfy
		// Number should be natural number divisible by  1 or itself
		// number should be greater than 1 num>1
		
		//Method 1 (pavan sir)
		
		int num=19;
		int count=0;
		
		if(num>1)
		{
			//2 factors should satisfy
			
		    	for(int i=1; i<=num; i++) 
			      {
			    	if(num%i==0)
			    	count++;
					
		          }
			    	if(count==2)
			     	 {
				    	System.out.println("Prime number");
			    	 }
			    	else
			    	{
					System.out.println("Not Prime number");
			        }
		 } 
				
		//if num itself is not greater than 1 then straight way num is not a prime number
		else
		{
		System.out.println("Not a Prime Number");
	    }

  }
}*/


//Method 2


public class PrimeNumberorNot {

	public static void main(String[] args) {
		
		int number =19;
		boolean isPrimeNumber=true;
		 
		if(number==1 || number==0)
		   {
			System.out.println(number+ " is not a prime number");
			
		   }
		else
		{
			for(int i=2; i<number/2;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+ " is not a prime number");
					isPrimeNumber=false;
					break;
					
				}
			}
		}
	if(isPrimeNumber)	
	{
		System.out.println(number+ " is a prime number");
	}

  }
}

