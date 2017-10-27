package transport;

public class Car {
	
	String sColor;		
	int iNofDoors;		
	float fLength;		
	boolean bIsAutoTransmission;		
		
	public Car()
	{
		
	}
	
	public Car(String sCarColor, int iDoors)
	{
		sColor = sCarColor;
		iNofDoors = iDoors;
	}
	
	void start()		
	{		
		System.out.println("Logic related to start");	
	}		
			
	void stop()		
	{		
		System.out.println("Logic related to stop");
	}		
			
	public void moveForward()		
	{		
		System.out.println("Logic related to moveForward");	
	}		
			
	void moveBackward()		
	{		
		System.out.println("Logic related to moveBackward");	
	}		

	public static void main(String args[])
	{
		
		Car oBMW = new Car();	
		oBMW.sColor = "Blue";		
				
		Car oBMW_X1 = new Car("Red", 2);
		
		oBMW.start();		
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
		
		Car oAcura;
		oAcura = new Car();
		
		oAcura.moveBackward();

	}

	
}
