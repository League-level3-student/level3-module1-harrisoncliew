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
		int rightCount = 0;
		int leftCount = 0;
		Stack<String> stack = new Stack();
		stack.push(b);
		String current = stack.pop();
		if (current.charAt(0) == '}') {
			return false;
		} else {
			for (int i = 0; i < current.length(); i++) {
				if (current.charAt(i) == '{') {
					leftCount++;
				} else {
					rightCount++;
				}
			}
			if (rightCount == leftCount) {
				return true;
			} else {
				return false;
			}
		}

	}

}