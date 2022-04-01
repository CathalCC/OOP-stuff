package assignment1;

public class Modules {
	
	//Data Members
	private String title;
	private String code;
	
	//Constructor
	public Modules() {
		title = "unassigned";
		code = "unassigned";
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	
	public String getCode() {
		return code;
	}
	
	//toString method
	public String toString() {
		return getTitle()+" "+getCode();
	}
	

}
