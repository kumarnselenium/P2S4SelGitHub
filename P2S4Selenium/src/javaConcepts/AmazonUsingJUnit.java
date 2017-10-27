package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJUnit {

	@Before
	public void login()
	{
		System.out.println("SWD logic for login");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD logic for logout");
		System.out.println();
	}
	
	@Test
	public void purchaseItem()
	{
		System.out.println("SWD logic for PurchaseItem");
	}

	@Test
	public void updateOrder()
	{
		System.out.println("SWD logic for UpdateOrder");
	}
	
	@Test
	public void trashOrder()
	{
		System.out.println("SWD logic for TrashOrder");
	}
}
