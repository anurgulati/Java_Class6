abstract class Animals 
{
	String color, breed, name;
	public abstract void eat();
	void speak()
	{
		System.out.println("Sounds");
	}
}
class Lions extends Animals
{
	public void eat()
	{
		System.out.println("Lions eat Meat");
	}
}
public class Class6_abstractclass {

	public static void main(String args[])
	{
		Animals obj=new Lions();
		obj.eat();
		obj.speak();
	}
}
