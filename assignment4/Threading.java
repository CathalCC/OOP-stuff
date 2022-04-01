package assignment4;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Threading implements Runnable{
	
	//Constructor
	public Threading() {
	}
	
	Random r = new Random();
	
	//Run method
	public void run() {
		//Synchronization to make code safe
		synchronized(this) {
		//Adding random characters to charList and printing the list in a loop
		for (int i=0; i<=10;i++) {
			Character c = (char)(r.nextInt(26)+'A');
			charList.add(c);
			System.out.println(charList);
			}
		}	
	}
	
	//Start method
	public void start() {
	}
	
	//charList creation
	public static List<Character> charList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//Creating 8 threads and running them in parallel
		Threading t = new Threading();
		
		for(int i=0; i<8; i++) {
			Thread thread = new Thread(t);
			thread.start();
		}
		
	}

}
