package assignment3;

public class Cat extends Animal{
	
	public Cat(String name, String breed, int size) {
		name = "unassigned";
		breed = "unassigned";
		size = 0;
	}
	
	public String sound() {
		return "Meow";
	}
}
