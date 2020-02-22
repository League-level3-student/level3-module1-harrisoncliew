package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList();

		//2. Add five Strings to your list
		names.add("hello");
		names.add("who");
		names.add("knee");
		names.add("wow");
		names.add("lol");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String temp = names.get(i);
			System.out.println(temp);
		}
		System.out.println();
		
		//4. Print all the Strings using a for-each loop
		for(String j : names) {
			System.out.println(j);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i+=2) {
			String temp = names.get(i);
			System.out.println(temp);
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i >=0; i--) {
			String temp = names.get(i);
			System.out.println(temp);
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			String temp = names.get(i);
			if(temp.contains("e")) {
				System.out.println(temp);
			}
		}
		System.out.println();
	}
}
