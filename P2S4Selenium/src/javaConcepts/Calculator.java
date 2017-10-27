package javaConcepts;

public class Calculator {
		 
	 int a, b, c;
	 
	 void addition()
	 {	  
		c = a+b;
		System.out.println("Addition: " + c);
	 }
	
	 void substraction()
	 {
		c = a-b;
		System.out.println("Substraction" +c);  
	 }
	 
	 void multiplication()
	 {
		c = a*b;
		System.out.println("Mul: " +c);  
	 }
	 
	 void division()
	 {
		c = a/b;
		System.out.println("div: " +c);  
	 }
	 
	 public static void main(String args[]) {
	  
	  Calculator oCalc;
	  oCalc = new Calculator();
	  
	  oCalc.a = 50;
	  oCalc.b = 10;
	  
	  oCalc.addition();		//144, 252
	  oCalc.substraction();	//6337, 2521
	  oCalc.multiplication(); //526, 63
	  oCalc.division();	//63773, 23
	  
	 }
		 
			
}
