
public class Car 
{
	int Cars;
	String Model;
	int speed;
	
	public int getspeed()
	{
		return speed;
	}
	public void setspeed(int s)

	{
		this.speed=s;
	}
	
	void display()
	{
		System.out.println("Welcom");
	}
	
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.display();
		obj.setspeed(80);
		System.out.println(obj.getspeed());
	}

}
