
package testngbasic;

import org.testng.annotations.Test;

public class group1 {

	
	@Test (groups= {"smoke", "sanity"})
	public void test1()
	{
			System.out.println("test4");
	}
	
	@Test (groups= {"regression","sanity"})
	public void test2()
	{
			System.out.println("test5");
	}
	
	@Test 
	public void test3()
	{
			System.out.println("test6");
	}
	
	
	
}
