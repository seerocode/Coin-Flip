package com.lockerfish;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CoinFlip extends JFrame{

	JTextField text;
	public CoinFlip() {
		
		setSize(100, 100);
		setTitle("Coin-Flip");
		
		Container container = getContentPane();
		
		JButton Flip = new JButton("Flip");
		Flip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("Results");
			}
		});
// Can be used to add results?		
		text = new JTextField("             ");
		
		FlowLayout layout = new FlowLayout();

		container.setLayout(layout);
		container.add(Flip);
		container.add(text);
		
//		setMenuBar();
		
		//Keep GUI not visible while painting all other components
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}