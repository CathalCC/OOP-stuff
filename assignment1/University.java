package assignment1;

import java.util.ArrayList;

public class University {
	
	public University() {
		
	}
	
	private ArrayList<Venue> venues;
	private ArrayList<Modules> modules;
	private ArrayList<Programmes> programmes;
	
	//Venue functions
	Venue venue = new Venue();
	
	public void addVenues() {
		venues.add(venue);
	}
	
	public void removeVenues() {
		venues.remove(venue);
	}
	
	public ArrayList<Venue> getVenues() {
		return venues;
	}
	
	//Module functions
	Modules module = new Modules();
	
	public void addModules() {
		modules.add(module);
	}
	
	public void removeModules() {
		modules.remove(module);
	}
	
	public ArrayList<Modules> getModules() {
		return modules;
	}
	
	//Programmes functions
	Programmes programme = new Programmes();
	
	public void addProgrammes() {
		programmes.add(programme);
	}
	
	public void removeProgrammes() {
		programmes.remove(programme);
	}
	
	public ArrayList<Programmes> getProgrammes() {
		return programmes;
	}
	
	//Inner Class
	public class Venue{
		
		String name;
		int capacity;
		
		public Venue() {
			name = "unassigned";
			capacity = 0;
		}
		
		public String getName() {
			return name;
		}
		
		public int getCapacity() {
			return capacity;
		}
		
		public String toString() {
			return getName()+" "+getCapacity();
		}
	}
	
	public String toString() {
		return getVenues()+" "+getModules()+" "+getProgrammes();
	}

}
