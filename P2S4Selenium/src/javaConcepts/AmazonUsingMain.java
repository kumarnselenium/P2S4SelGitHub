package javaConcepts;

public class AmazonUsingMain {

	public void login()
	{
		System.out.println("SWD logic for login");
	}
	
	public void logout()
	{
		System.out.println("SWD logic for logout");
		System.out.println();
	}
	
	public void purchaseItem()
	{
		System.out.println("SWD logic for PurchaseItem");
	}
	
	public void updateOrder()
	{
		System.out.println("SWD logic for UpdateOrder");
	}
	
	public void trashOrder()
	{
		System.out.println("SWD logic for TrashOrder");
	}
	
	public static void main(String args[])
	{
		AmazonUsingMain oAmazon = new AmazonUsingMain();
		
		//1. Create Order
		oAmazon.login();
		oAmazon.purchaseItem();
		oAmazon.logout();
		
		//2. Modify Order
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		
		//3. DeleteOrder
		oAmazon.login();
		oAmazon.trashOrder();
		oAmazon.logout();
		
	}
}
