package javaConcepts;

import org.junit.Test;

public class JavaLoops {

	
	public void exForIfLoop()
	{
		int iCustAge = 75;
		String sCustGender="Male";
		String sCustState = "NY";
		
		if(iCustAge>70 && sCustGender=="Female")
		{
			System.out.println("Extra 0.5% intrest rate");
		}
		
		if(iCustAge>70 || sCustGender=="Female")
		{
			System.out.println("Extra 0.5% intrest rate");
		}
		
		if(sCustState != "CA")
		{
			System.out.println("Extra 0.5% intrest rate");
		}
		
	}
	
	public void exForIfElseLoop()
	{
		int iCustAge = 75;
		
		if(iCustAge>70)
		{
			System.out.println("Extra 0.5% intrest rate");
		}
		else
		{
			System.out.println("reduce 0.5% intrest rate");
		}
	}
		
	public void exForNestedIfElseLoop()
	{
		int iCustAge = 75;
		
		if(iCustAge>=80)
		{
			System.out.println("Extra 1.5% intrest rate");
		}
		else if(iCustAge>70)
		{
			System.out.println("extra 0.5% intrest rate");
		}
		else
		{
			System.out.println("reduce 0.5% intrest rate");
		}
	}
	
	public void exForNestedIfElseLoop2()
	{
		int iCustAge = 75;
		String sCustGender = "Male";
		
		if(iCustAge>=80)
		{
			if(sCustGender=="Famale")
			{
				System.out.println("Extra 1.5% intrest rate");
			}
			else
			{
				System.out.println("Extra 1% intrest rate");
			}
		}
		else if(iCustAge>70)
		{
			System.out.println("extra 0.5% intrest rate");
		}
		else
		{
			System.out.println("reduce 0.5% intrest rate");
		}
	}
	
	public void exForSwitch()
	{
		String sOption = "CarRental124";
		
		switch (sOption) {
			case "Flights":
					System.out.println("SWD logic to click on Flights");
					break;
			case "Hotels":
					System.out.println("SWD logic to click on Hotels");
					break;
			case "Packages":
					System.out.println("SWD logic to click on Packages");
					break;
			case "CarRental":
					System.out.println("SWD logic to click on CarRental");
					break;
			case "Cruises":
					System.out.println("SWD logic to click on Cruises");
					break;
			default:
					System.out.println("pass appropriate option");
					break;
		}
	}
	
	public void exForForLoop()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}

	public void exForWhile()
	{
		int i=11;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	@Test
	public void exForDoWhile()
	{
		int i=11;
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
}








