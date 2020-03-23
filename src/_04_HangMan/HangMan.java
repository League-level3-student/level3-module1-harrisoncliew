package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.*;
import javax.swing.JOptionPane;

public class HangMan implements KeyListener {
	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.start();
		h.setup();
	}

	Stack<String> stack = new Stack<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	int numOfWords;
	int lives = 6;
	String currentWord;
	String blanks = lives+" lives				";
	void start() {
		String yeet = JOptionPane.showInputDialog("How many rounds of hangman would you like to play?");
		numOfWords = Integer.parseInt(yeet);
		for (int i = 0; i < numOfWords; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			stack.push(word);
		}
		currentWord = stack.pop();
		blanks = blanks+"\n";
		for (int i = 0; i < currentWord.length(); i++) {
			blanks = blanks+"_ ";
		}
	}

	void setup() {
		label.setText(blanks);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = e.getKeyChar();
		if(currentWord.contains(letter+"")) {
			
		} else {
			lives--;
		}
	}
}
