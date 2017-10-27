package javaConcepts;

import transport.Car;
import transport.Train;

public class CalculatorWithInputParam {
		 
	 int c;
	 
	 void addition(int a, int b)
	 {	  
		c = a+b;
		System.out.println(c);
	 }
	
	 void substraction(int a, int b)
	 {
		c = a-b;
		System.out.println(c);  
	 }
	 
	 void multiplication(int a, int b)
	 {
		c = a*b;
		System.out.println(c);  
	 }
	 
	 void division(int a, int b)
	 {
		c = a/b;
		System.out.println(c);  
	 }
	 	 
	 void getCarModel(String sBrand, int rating)
	 {
		 
	 }
	 
	 void getCarInfo(Car oXYZ)
	 {
		 oXYZ.moveForward();
	 }
	 
	 public static void main(String args[]) {
	  
	  CalculatorWithInputParam oCalc;
	  oCalc = new CalculatorWithInputParam();
	  
	  	  
	  oCalc.addition(144, 252);
	  oCalc.substraction(6337, 2521);
	  oCalc.multiplication(526, 63);
	  oCalc.division(63773, 23);
	  
	  Car oBMW = new Car();
	  //Train oViaRail = new Train();
	  oCalc.getCarInfo(oBMW);
	  
	  
	 }
		 
			
}
