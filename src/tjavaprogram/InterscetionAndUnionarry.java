package tjavaprogram;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class InterscetionAndUnionarry {
	//1.string joiner
	//out put should be A,C,B
	//P:Q
	//A,B,C,P:Q
	//[A,B,C,P:Q] - adding prefix
	
	//2.
	//int arr1[]=  {80, 10, 15, 2, 35,60};
	//int arr2[]=  {35, 80, 60, 20, 75};
	//output intersection that means only duplicate integer should print
	// Union removing duplicate from both and print only unique integer as one array

	public static void main(String[] args) {
		
		//1.
		StringJoiner sj1 = new StringJoiner(",", "[", "]");
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);
		sj1.merge(sj2);
		System.out.println(sj1);
		
		
		
		//2.
		
		int arr1[]=  {80, 10, 15, 2, 35,60};
		int arr2[]=  {35, 80, 60, 20, 75};
		printIntersction(arr1, arr2);
		printUnion(arr1, arr2);
	}
	
	static void printIntersction (int arr1[], int arr2[]) {
		
		Set<Integer> s= new HashSet<>();
		
		// I have to iterator the arr1 list and add to set sj1 as below
		for(int i=0; i< arr1.length; i++)
		{			
			s.add(arr1[i]);
					
		}
		for(int i=0; i< arr2.length; i++)
		{
			if(s.contains(arr2[i]))
			{
			 System.out.println(arr2[i] + " ");
			}
					
		}
		
		
	}
	static void printUnion(int arr1[], int arr2[]) {
          
		Set<Integer> s= new HashSet<>();
		
		// I have to iterator the arr1 list and add to set sj1 as below
		for(int i=0; i< arr1.length; i++)
		{			
			s.add(arr1[i]);
					
		}
		for(int i=0; i< arr2.length; i++)
		{
			s.add(arr2[i]);
		}
		System.out.println("Union");
		
		//set will remove all duplicate values so just print s
		System.out.println(s);
		
		
	}

}
