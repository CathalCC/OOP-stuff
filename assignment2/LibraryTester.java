package assignment2;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class LibraryTester {

	public static void main(String[] args) {
		
		Library1 library = new Library1();
		
		//Populating the library array list with instances of books
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
		    Book1 book = new Book1();

		    System.out.print("Enter the book's title: ");
		    book.setTitle(input.nextLine());
		    System.out.print("Enter the book's author: ");
		    book.setAuthor(input.nextLine());
		   
		    library.addBook(book); 
		    
		}
		input.close();
		
		writeToFile(library.getBooks());
		
		readFromFile(library.getBooks());
			
		serialise(library.getBooks());
			
		deserialise(library.getBooks());
	}
	
	//Writing to BookList.txt
	public static void writeToFile(List<Book1> list) {
		System.out.println("Writing to File");
		
		try {
			   
		    FileWriter fileWriter = new FileWriter("BookList.txt");
			    
	            BufferedWriter writer = new BufferedWriter(fileWriter);
			    
	            writer.write("Book List \n");
			    
			for(Book1 element:list){
			    writer.write("Title: " + element.getTitle() + "\n");
			    writer.write("Author: " + element.getAuthor()  + "\n");
			}
			
		     writer.close();
			  
		} catch(IOException e){
		    e.printStackTrace();
		}
			
	    }  
	
	//Reading from BookList.txt
	public static void readFromFile(List<Book1> list) {
		
		System.out.println("Reading from File");
		
		try{
		    File bookFile = new File("BookList.txt");
				
		    FileReader fileReader = new FileReader(bookFile);
				
		    BufferedReader reader = new BufferedReader(fileReader);
				
		    String line = null;
				
		    while ((line = reader.readLine()) != null){
			System.out.println(line);
		    }
				
		    reader.close();
				
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	//Serializing
	public static void serialise(List<Book1> list) {
		try {
		    FileOutputStream fileStream = new FileOutputStream("BookInfo.dat");
		    ObjectOutputStream os = new ObjectOutputStream(fileStream);
		    os.writeObject(list);
		    os.close();
			}
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Deserializing
	public static void deserialise(List<Book1> list) {
		try{	
		    FileInputStream fileStream = new FileInputStream("BookInfo.dat");
				
		    ObjectInputStream os = new ObjectInputStream(fileStream);
				
		    List<Book1> b = (List<Book1>)os.readObject();
				    
			for (Book1 element:b){
			    System.out.println(element.toString());	
			}
				
			os.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
