package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Threading2 implements Runnable{
	
	public Threading2() {
	}
	
	//Run Method
	public void run() {
		//Synchronizing the critical code to make it code safe
		synchronized(this) {
		//Infinite loop adding A, B or C depending on what the last element of the list is
		while (true) {
			if (charList.size()==0){
				charList.add('A');
			}
			else if (charList.get(charList.size()-1)=='A') {
				charList.add('B');
			}
			else if (charList.get(charList.size()-1)=='B') {
				charList.add('C');
			}
			else {
				charList.add('A');
			}
		System.out.println(charList);
		}
		
		}
		
	}
	
	//Start Method
	public void start() {
		
	}
	
	//Creation of charList
	public static List<Character> charList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//Multithreading
		Threading2 t = new Threading2();
		
		for(int i=0; i<8; i++) {
			Thread thread = new Thread(t);
			thread.start();
		}
		
	}

}
