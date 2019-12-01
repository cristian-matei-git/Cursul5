package Exercitiul0;
import java.util.ArrayList;
import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(numbers);
		numbers.add(0, 2);
		System.out.println(numbers);
		System.out.println(numbers.add(3));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers);
		System.out.println(numbers.contains(1));
		System.out.println(numbers.get(0));
		System.out.println(numbers.indexOf(2));
		System.out.println(numbers.lastIndexOf(2));
		numbers.remove(0);
		System.out.println(numbers);
		numbers.remove(0);
		System.out.println(numbers);
		numbers.set(0, 5);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);
		
		
		
	}

}
