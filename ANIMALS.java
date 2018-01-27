package Class6;

public interface ANIMALS {

	void speak();
	void eat();	
}

class dog implements ANIMALS
{
	public void speak()
	{
		System.out.println("Bark");
	}
	public void eat()
	{
		System.out.println("meat");
	}
}
class cat implements ANIMALS
{
	public void speak()
	{
		System.out.println("Meeeeeooooooowwwww");
	}
	public void eat()
	{
		System.out.println("Bread");
	}
}
