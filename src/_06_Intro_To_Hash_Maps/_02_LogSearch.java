package _06_Intro_To_Hash_Maps;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.setup();
	}
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	void setup() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String beforeKey = JOptionPane.showInputDialog("Enter an ID number.");
			String value = JOptionPane.showInputDialog("Enter a name.");
			int key = Integer.parseInt(beforeKey);
			log.put(key, value);
		}
		if(e.getSource()==button2) {
			boolean yeet = true;
			String beforeId = JOptionPane.showInputDialog("Enter an ID number to search.");
			int id = Integer.parseInt(beforeId);
			for (int i = 0; i < log.size(); i++) {
				if(log.containsKey(id)) {
					yeet = true;
				} else {
					yeet = false;
				}
			}
			if(yeet) {
				JOptionPane.showMessageDialog(null, "ID number "+id+"'s name is "+log.get(id));
			} else if(yeet==false) {
				JOptionPane.showMessageDialog(null, "That ID number does not exist.");
			}
		}
		if(e.getSource()==button3) {
			String message = "";
			for (Integer s : log.keySet()) {
				String temp = "ID: "+s+"  Name: "+log.get(s)+"\n";
				message = message+temp;
			}
			JOptionPane.showMessageDialog(null, message);
		}
		if(e.getSource()==button4) {
			boolean yeet = true;
			String beforeId = JOptionPane.showInputDialog("Enter an ID number to remove.");
			int id = Integer.parseInt(beforeId);
			for (int i = 0; i < log.size(); i++) {
				if(log.containsKey(id)) {
					
					yeet = true;
				} else {
					yeet = false;
				}
			}
			if(yeet) {
				log.remove(id);
				JOptionPane.showMessageDialog(null, "ID number "+id+" has been removed.");
			} else if(yeet==false) {
				JOptionPane.showMessageDialog(null, "That ID does not exist.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
