package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;
public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		_02_TextUndoRedo t = new _02_TextUndoRedo();
		t.setup();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String doc = "";
	Stack<Character> deleted = new Stack();
	
	void setup(){
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(label.getText().length()>0) {
			String text = label.getText();
			char removed = text.charAt(text.length()-1);
			label.setText(text.substring(0, text.length()-1));
			deleted.push(removed);
			}
			
		} else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			if(deleted.size()>0) {
			char undo = deleted.pop();
			doc = label.getText()+undo;
			label.setText(doc);
			frame.pack();
			}
		} else {
		char letter = e.getKeyChar();
		doc = label.getText()+letter;
		label.setText(doc);
		frame.pack();
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
