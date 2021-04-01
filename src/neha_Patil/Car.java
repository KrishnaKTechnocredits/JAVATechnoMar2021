package neha_Patil;

public class Car {
	String CompanyName;
	boolean IsAutomatic;
	double carspeed;

	void Setcompanyname(String name){		
		CompanyName = name;
	}

	void setIsCarAutomatic(boolean isauto){		
		IsAutomatic = isauto;
	}

	void setCarSpeed(double speed){
		carspeed = speed;
	}

	void displaySpecification(){		

		System.out.println("Company Name is        : "+ CompanyName);
		System.out.println("Is Car Automatic       : "+ IsAutomatic);
		System.out.println("Car Speed is           : "+ carspeed);
	}

	public static void main(String[] args){
		Car c = new Car();
		c.Setcompanyname("Tiago");
		c.setIsCarAutomatic(true);
		c.setCarSpeed(40);
		c.displaySpecification();
	}

}
