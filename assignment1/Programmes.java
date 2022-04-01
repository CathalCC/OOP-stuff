package assignment1;

public class Programmes {
	
	//Data Members
	private String title;
	private String code;
	
	//Constructor
	public Programmes() {
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
