package assignment3;

import java.util.List;
import java.util.LinkedList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;

public class AnimalTester {

	public static void main(String[] args) {
		
		//Instantiating cat and dog objects
		Dog dog = new Dog(null, null, 0);
		Cat cat = new Cat(null, null, 0);
		
		//Setting values for dog and cat
		dog.setName("Rex");
		dog.setBreed("German Shepherd");
		dog.setSize(50);
		
		cat.setName("Dave");
		cat.setBreed("Prussian Blue");
		cat.setSize(20);
		
		//Creation of linked list to contain animal objects
		List<Animal> animalList = new LinkedList<>();
		
		//Adding cat and dog instances to list
		animalList.add(dog);
		animalList.add(cat);
		
		//Printing list in its current state
		System.out.println("Unsorted list");
		for (int i=0; i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
		
		//Sorting list by name
		Collections.sort(animalList);
		
		//Reprinting the list, now sorted by name
		System.out.println("\nSorted by name");
		for (int i=0; i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
		
		//Sorting by breed
		class breedSort implements Comparator<Animal>{
			public int compare (Animal one, Animal two) {
				return one.getBreed().compareTo(two.getBreed());
			}
		}
		
		breedSort bsort = new breedSort();
		Collections.sort(animalList, bsort);
		
		//Printing the newly sorted list
		System.out.println("\nSorting by breed");
		for (int i=0; i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
		
		//Sorting by size
		class sizeSort implements Comparator<Animal>{
			public int compare(Animal one, Animal two) {
				return Integer.compare(one.getSize(), two.getSize());
			}
		}
		
		sizeSort ssort = new sizeSort();
		Collections.sort(animalList, ssort);
		
		//Printing the newly sorted list
		System.out.println("\nSorting by size");
		for (int i=0; i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
		
		System.out.println("\nList after serializing and deserializing");
		serialise(animalList);
		deserialise(animalList);
	}
	
	
		//Serializing
		public static void serialise(List<Animal> list) {
			try {
			    FileOutputStream fileStream = new FileOutputStream("AnimalInfo.dat");
			    ObjectOutputStream os = new ObjectOutputStream(fileStream);
			    os.writeObject(list);
			    os.close();
				}
			catch (Exception e) {
			    e.printStackTrace();
			}
		}
		
		//Deserializing
		public static void deserialise(List<Animal> list) {
			try{	
			    FileInputStream fileStream = new FileInputStream("AnimalInfo.dat");
					
			    ObjectInputStream os = new ObjectInputStream(fileStream);
					
			    List<Animal> a = (List<Animal>)os.readObject();
					    
				for (Animal element:a){
				    System.out.println(element.toString());	
				}
					
				os.close();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
}