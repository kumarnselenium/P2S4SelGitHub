package javaConcepts;

public class ExForExceptions {

	public void exForThrows() throws Exception
	{
		Thread.sleep(3000);		
	}
	
	
	public void exForTryCatch()
	{
		try {
			Thread.sleep(3000);
			//Read the data from the following file	
			//C:\Selenium\Students.txt	

		} catch (InterruptedException e) {
			//	e.printStackTrace();
			//Create a text file C:\Selenium\Students.txt	
			//then try to read
		}		
	}
	
}
