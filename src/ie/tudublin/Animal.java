package ie.tudublin

public class Animal
{
	private String name;
	
	//Constructor
	//same name as the class
	//No return type
	public Animal(String name)
	{
		setName(name);
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
}