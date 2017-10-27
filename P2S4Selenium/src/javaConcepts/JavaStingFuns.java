package javaConcepts;

import org.junit.Test;

public class JavaStingFuns {

	@Test
	public void exStringFuns()
	{
		String str1 = "This is Java class";
		String str2 = "     Thanks for your transaction.. Your ref# 987893425    ";
		String sRefNo = "1234567890";
		String str3  = "Welcome Daniel to facebook";
				
		System.out.println(str2.trim().substring(40, 49));
		System.out.println(str3.replace("facebook", "Google"));
		System.out.println(str2);
		System.out.println(str2.trim());
		
		if(sRefNo.length() == 10)	//Length,
		{
			System.out.println("Pass, Expected nof chars are presented in the ref no");
		}
		else
		{
			System.out.println("Fail, Expected nof chars are NOT presented in the ref no");
		}
		
		System.out.println(str1.concat(str2)); //Concatenate, 
		
		if(str3.contains("Daniel"))		//Contains, 
		{
			System.out.println("Pass, contains");
		}
		else
		{
			System.out.println("Fail, contains");
		}
		
		if(str3.equals("Daniel"))		//equals, 
		{
			System.out.println("Pass, equals");
		}
		else
		{
			System.out.println("Fail, equals");
		}
		
		if(str3.equalsIgnoreCase("Welcome DANIEL to facebook"))		//equalsIgnoreCase, 
		{
			System.out.println("Pass, equals");
		}
		else
		{
			System.out.println("Fail, equals");
		}
		
		//substring, 
		//replace
	}
	
	
}
