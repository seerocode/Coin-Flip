package coinflip;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CF extends JFrame implements ActionListener {
	
	JFrame window;
	JPanel panel;
	
	URL imageURL;
	Icon icon;
	JLabel iconLabel;
	
	JLabel flipsLabel;
	JLabel tailsLabel;
	JLabel headsLabel;
	JButton clickButton;
	
	public CF() throws MalformedURLException {
		
		imageURL = new URL("file:///Users/Student/Documents/coin_flip_cont.gif");
		icon = new ImageIcon(imageURL);
		iconLabel = new JLabel(icon);

		window = new JFrame("Coin-Flip");
		window.getContentPane().add(iconLabel);
		window.pack();
		window.setSize(600, 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setLayout(null);
		window.add(panel);

		flipsLabel = new JLabel("[ FLIPS = ]");
		flipsLabel.setBounds(50, 20, 500, 50);

		tailsLabel = new JLabel("[ TAILS = ]");
		tailsLabel.setBounds(50, 70, 250, 50);

		headsLabel = new JLabel("[ HEADS = ]");
		headsLabel.setBounds(300, 70, 250, 50);

		clickButton = new JButton("Flip");
		clickButton.setBounds(235, 450, 130, 45);
		clickButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Flips flip = new Flips();

				flipsLabel.setText(Arrays.toString(flip.hAndT));
				
				flip.tailsCount();
				tailsLabel.setText("Total Tails " + flip.tCount);

				flip.headsCount();
				headsLabel.setText("Total Tails " + flip.hCount);

			}

		});
		
		panel.add(clickButton);
		panel.add(flipsLabel);
		panel.add(tailsLabel);
		panel.add(headsLabel);

		window.setVisible(true);
	}
	

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {


	}
}