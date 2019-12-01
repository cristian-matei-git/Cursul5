package Exercitiul1;

import java.util.ArrayList;
import java.util.Collections;

public class MaxFrequency {
	
	public static void maximumFrequency(String str) {
		
		str = str.toLowerCase();
		char[] charString = str.toCharArray();
		
		ArrayList<Character> array = new ArrayList<Character>();
		
		for(int i = 0; i < charString.length; i++) {
			if(charString[i] != ' ') {
				array.add(charString[i]);
			}
		}
		
		Collections.sort(array);
		
		ArrayList<Character> newArray = new ArrayList<Character>();
		int counter = 1 ;
		
		for(int i = 0; i < array.size(); i++) {
			
			if(array.lastIndexOf(array.get(i)) - array.indexOf(array.get(i)) == counter && !newArray.contains(array.get(i))) {
				newArray.add(array.get(i));
				
			}
			
			if(array.lastIndexOf(array.get(i)) - array.indexOf(array.get(i)) > counter) {
				newArray.clear();
				newArray.add(array.get(i));
				counter = array.lastIndexOf(array.get(i)) - array.indexOf(array.get(i));
				
			}
			
		}
		
		for(int i = 0; i < newArray.size(); i++) {
		System.out.println("Character '" + newArray.get(i) + "' appears " + (counter+1) + " times.");
		}
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Argument: \"Simple sentence.\"");
		maximumFrequency("Simple sentence.");
		System.out.println();
		System.out.println("Argument : \"Becoming a programmer is like gaining super powers!\"");
		maximumFrequency("Becoming a programmer is like gaining super powers!");
		
	}

}
