package assignment3;

import java.util.Collections;
import java.io.Serializable;

public abstract class Animal implements Serializable, Comparable<Animal> {
	
	//Data Members
	private static final long serialVersionUID = 1L;
	private String name;
	private String breed;
	private int size;
	
	//Constructor
	public Animal() {
		name = "unassigned";
		breed = "unassigned";
		size = 0;
	}
	
	//Overloaded Constructor
	public Animal(String name, String breed, int size) {
		this.name = name;
		this.breed = breed;
		this.size = size;
	}
	
	//CompareTo()
	public int compareTo(Animal a) {
		return name.compareTo(a.getName());
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getSize() {
		return size;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	abstract String sound();
	
	public String toString() {
		return name+" "+breed+" "+size;
	}

}
