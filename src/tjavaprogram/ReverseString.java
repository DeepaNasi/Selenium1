package tjavaprogram;

public class ReverseString {

	public static void main(String[] args) {
		//String=Deepa
		
		String str = "Deepa";
		String rev = " ";
		int len=str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+str.charAt(i);
						
		}
	System.out.println("The reverse string is:" +rev);	

	}

}
