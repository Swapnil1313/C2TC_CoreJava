
public class Student 
{
	int No_of_Student;
	String Stud_name;
	int roll_no;
	
	public int getroll_no()
	{
		return roll_no;
	}
	public void setroll_no(int r)

	{
		this.roll_no=r;
	}
	
	void display()
	{
		System.out.println("Count= 20");
		System.out.println("Name=Swapnil Kalyankar ");
		System.out.println("Roll No=");
	}
	
	
	
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.display();
		obj.setroll_no(5);
		System.out.println(obj.getroll_no());
	}

}
