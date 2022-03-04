public class Car {

	int noofcars;
	String Model;
	
	void display()
	{
		System.out.println("Welcome To SK Moters");
	}
	
	void display1()
	{
		System.out.println("Welcome To Benz Moters");
	}
	
	void display2()
	{
		System.out.println("Welcome To KIA Moters");
	}
	
	
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.display();
		c.display1();
		c.display2();
	}

}
