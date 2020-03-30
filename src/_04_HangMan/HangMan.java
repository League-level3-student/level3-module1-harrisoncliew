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
	String livesword = lives + " lives				";
	String blanks = "";
	String shown;
	String[] options = {"yes", "no"};	

	void start() {
		String yeet = JOptionPane.showInputDialog("How many rounds of hangman would you like to play?");
		numOfWords = Integer.parseInt(yeet);
		for (int i = 0; i < numOfWords; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			stack.push(word);
		}
		currentWord = stack.pop();

		for (int i = 0; i < currentWord.length(); i++) {
			blanks = blanks + "_";
		}
	}

	void setup() {
		label.setText(livesword + blanks);
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
		int index = 0;
		int counter = 0;
		char letter = e.getKeyChar();
		StringBuilder sb = new StringBuilder(blanks);
		if (currentWord.contains(letter + "")) {
			while (currentWord.indexOf(letter, index) > -1) {
				index = currentWord.indexOf(letter, index);
				sb.setCharAt(index, letter);
				index++;
				blanks = sb.toString();
				counter++;
			}
			label.setText(livesword + blanks);
			frame.pack();
			
			
		} else {
			lives--;
			label.setText(livesword + blanks);
			int x= 1;
			frame.pack();
			if(lives==0){
				livesword = lives + " lives				";
				label.setText("GAME OVER");
				frame.pack();
				x = JOptionPane.showOptionDialog(null, "Would you like to play again?",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				System.out.println(x);
			}
			if(x==0) {
				start();
				lives = 6;
				setup();
				
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
