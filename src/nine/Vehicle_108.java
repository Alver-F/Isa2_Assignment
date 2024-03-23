package nine;

public class Vehicle_108 {
	int horsepower=80;
	Vehicle_108(int horsepower)
	{
		this.horsepower=horsepower;
	}
	public void drive()
	{
		System.out.println("The vehicle is driving with horsepower of:"+horsepower);
	}
}

class Car extends Vehicle_108{
	int horsepower=50;
	String make;
	Car(int horsepower,String make){
		super(horsepower);
		this.make=make;
	}
	@Override
	public void drive()
	{
		super.drive();
		System.out.println("The car is driving with horsepower of:"+horsepower+"Make:"+make);
	}
}

class Vehicle_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(90,"Toyota");
		c1.drive();
	}
}