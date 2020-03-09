package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			double num = r.nextInt(101);
			doubles.push(num);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String fakenum1 = JOptionPane.showInputDialog("Enter a number between 0 and 100 (inclusive)");
		String fakenum2 = JOptionPane.showInputDialog("Enter a number between 0 and 100 (inclusive)");
		int num1 = Integer.parseInt(fakenum1);
		int num2 = Integer.parseInt(fakenum2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		} else if(num1==num2) {
			System.out.println("AN ERROR HAS OCCURED");
		}
			
		
		for (int i = 0; i < doubles.size(); i++) {
			double temp = doubles.pop();
			if(temp>num2 && temp<num1) {
				System.out.println(temp);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
