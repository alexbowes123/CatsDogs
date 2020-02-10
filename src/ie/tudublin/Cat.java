package ie.tudublin;

public class Cat extends Animal 
{
	private int numLives;
	public Cat(String name)
	{
		//constructor chaining
		super(name);
		
	}
	
	public int getNumLives(){
		return numLives();
	}
	
	public getName()
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumLives(int numLives) {
		this.numLives = numLives;
	}
	
	public void speak()
	{
		System.out.println("Meow!");
	}
}
