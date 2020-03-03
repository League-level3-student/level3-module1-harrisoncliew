package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random r = new Random();
	boolean boo = false;
	Song currentSong;
	Song s = new Song("Blinding Lights.mp3");
	Song s1 = new Song("CLASSICAL.mp3");
	Song s2 = new Song("Coconut Mall.mp3");
	Song s3 = new Song("Memories.mp3");
	Song s4 = new Song("Rolling....mp3");
	Song s5 = new Song("Unravel.mp3");
	ArrayList<Song> songs = new ArrayList();
	public _06_IPodShuffle() {
		
		panel.add(button);
		frame.add(panel);
		button.addActionListener(this);
		button.setText("Surprise Me!");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		// 1. Use the Song class the play the demo.mp3 file.
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		songs.add(s);
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		songs.add(s5);
		
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			if(boo) {
				currentSong.stop();
			}
			int temp = r.nextInt(6);
			currentSong = songs.get(temp);
			currentSong.play();
			boo = true;
			
		}
	}
}