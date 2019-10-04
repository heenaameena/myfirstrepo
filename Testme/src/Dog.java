
public class Dog {
	// properties
	public String name;
	public Integer weight;
	public Integer age;
	
	//behaviour
	
	public String makeSounds() // return me Bow Bow
	{
	return "Bow Bow";
	}
	public Dog(String name, Integer weight, Integer age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	//attack
	public String attack()
	{
	return "Bites";
	}
	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
				
	}
