package javaConcepts;

import transport.Car;
import transport.Train;

public class CalculatorWithInputAndReturn {
		 
	public CalculatorWithInputAndReturn()
	{
			//<statements>
			
	}

	
	 int c;
	 
	 int addition(int a, int b)
	 {	  
		c = a+b;
		return c;
	 }

	 int addition(int a, int b, int d)
	 {	  
		c = a+b+d;
		return c;
	 }

	 int addition(String a, int b)
	 {
		 //System.out.println
		 
		 return 1;
	 }

	 int substraction(int a, int b)
	 {
		c = a-b;
		return c;  
	 }
	 
	 int multiplication(int a, int b)
	 {
		c = a*b;
		return c; 
	 }
	 
	 int division(int a, int b)
	 {
		c = a/b;
		return c;
	 }
	 	 
	 String getCarModel(String sBrand, int rating)
	 {
		 return "Honda";
	 }

	 boolean isTimeUp()
	 {
		 return true;
	 }
	 
	 String getCarInfo(Car oXYZ)
	 {
		 oXYZ.moveForward();
		 return "";
	 }
	 
	 Train bestTransportService()
	 {
		Train oBullet = new Train();
		return oBullet;
	 }
 	 
	 public static void main(String args[]) {
		  CalculatorWithInputAndReturn oCalc;
		  oCalc = new CalculatorWithInputAndReturn();
		  
		  	  
		  int iAddition = oCalc.addition(144, 252);
		  System.out.println(iAddition);
		  
		  System.out.println(oCalc.substraction(6337, 2521));
		  System.out.println(oCalc.multiplication(526, 63));
		  System.out.println(oCalc.division(63773, 23));
		  
		  Car oBMW = new Car();
		  Train oViaRail = new Train();
		  oCalc.getCarInfo(oBMW);
		  
		  Train oA = oCalc.bestTransportService();
	 }
		
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
			
}
