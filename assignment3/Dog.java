package assignment3;

public class Dog extends Animal{
	
	public Dog(String name, String breed, int size) {
		name = "unassigned";
		breed = "unassigned";
		size = 0;
	}
	
	public String sound() {
		return "Woof";
	}

}