
public class Car {
	
	public String make;
	public String model;
	public Integer year;
	
	//functions
	
	//public String interior() //run
	public Car(String make, String model, Integer year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	//audioSystem
	//public String attack()
	{
	//return "Bites";
	}

	@Override
	public String toString() {
		return "car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	


	}
				

//Class
//Car firstCar = new Car();
//firstCar.make = "Toyota";
//firstCar.model = "Camry";
//firstCar.year = 2017;

Car firstCar = new Car("Toyota", "Camry" , 2017);
	

System.out.println(firstCar.toString());


	//secondCar.make = "Honda";
	//secondCar.model = "Accord";
	//secondCar.year = 2009;
	
Car secondCar = new Car("Honda" , "Accord" , 2009);
	System.out.println(secondCar.toString());

}





 




