package assignment2;

import java.io.Serializable;
import java.util.ArrayList;

public class Library1 implements Serializable {
	
	//Data Members
	String name;
	
	//Array List
	private ArrayList<Book1> book1 = new ArrayList<Book1>();
	
	//Getters
	public String getName() {
		return name;
	}
	
	public ArrayList<Book1> getBooks(){
		return book1;
	}
	
	//Array List method
	public void addBook(Book1 booktoAdd) {
		book1.add(booktoAdd);
	}
	
	public void removeBook(int i) {
		book1.remove(i);
	}
	
	//toString method
	public String toString() {
		return name;
	}

}