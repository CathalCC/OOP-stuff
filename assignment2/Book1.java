package assignment2;

import java.io.Serializable;

public class Book1 implements Serializable {
	
	//Data Members
	private String title;
	private String author;
	
	//Constructor
	public Book1() {
		title = "unassigned";
		author = "unassigned";
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	//Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//toString
	public String toString() {
		return title+" "+author;
	}

}