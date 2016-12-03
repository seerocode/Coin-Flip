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

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("file:///Users/alexisflores/Documents/workspace/CoinFlipJFrame/img/coin_flip_cont.gif");
		Icon icon = new ImageIcon(url);
		JLabel label = new JLabel(icon);

		JFrame window = new JFrame("Coin-Flip");
		window.getContentPane().add(label);
		window.pack();
		window.setSize(600, 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		window.add(panel);

		JLabel flipsLabel = new JLabel("[ FLIPS = ]");
		flipsLabel.setBounds(50, 20, 500, 50);

		JLabel tailsLabel = new JLabel("[ TAILS = ]");
		tailsLabel.setBounds(50, 70, 250, 50);

		JLabel headsLabel = new JLabel("[ HEADS = ]");
		headsLabel.setBounds(300, 70, 250, 50);

		JButton button = new JButton("Flip");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Flips flip = new Flips();

				flipsLabel.setText(Arrays.toString(flip.hAndT));
				
				flip.tailsCount();
				tailsLabel.setText("Total Tails " + Integer.toString(flip.tcount));

				flip.headsCount();
				headsLabel.setText("Total Tails " + Integer.toString(flip.hcount));

			}

		});
		
		button.setBounds(235, 450, 130, 45);
		panel.add(button);
		panel.add(flipsLabel);
		panel.add(tailsLabel);
		panel.add(headsLabel);

		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}