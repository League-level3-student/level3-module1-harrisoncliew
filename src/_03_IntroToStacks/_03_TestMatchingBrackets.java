package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> stack = new Stack();
		String current = b;
		for (int i = 0; i < current.length(); i++) {
			char temp = current.charAt(i);
			if(temp==('{')) {
				stack.push('{');
			} else if(temp==('}')) {
				if(stack.size()>0) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if(stack.size()==0) {
			return true;
		} else {
			return false;
		}
		
		
	

	}

}