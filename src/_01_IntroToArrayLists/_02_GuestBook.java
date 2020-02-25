package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.*;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		_02_GuestBook gb = new _02_GuestBook();
		gb.setup();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList();
	
	void setup() {
		button1.setLabel("Add Name");
		button2.setLabel("View Names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String user = JOptionPane.showInputDialog("Enter a name for the Guest Book");
			names.add(user);
		}
		if(e.getSource()==button2) {
			String print = "";
			for (int i = 0; i < names.size(); i++) {
				int h = i+1;
				String temp2 = names.get(i);
				String temp = "Guest #"+h+": "+temp2+"\n";
				print+=temp;
				System.out.println(print);
			}
			
			JOptionPane.showMessageDialog(null, print);
		}
		
	}
	
	
}
