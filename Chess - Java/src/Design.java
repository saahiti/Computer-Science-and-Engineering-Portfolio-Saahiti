/**
 * Default starting page for Chess Game
 * Alisa and Saahiti
 * Final Summative
 * ICS3U - Mr. Marco
 * Jan 23rd 2013
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Design extends JFrame {

	private JButton butn[] = new JButton[4];
	private JLabel lbl[] = new JLabel[4];
	public static JButton btnPlay, btnInstructions, btnOptions, btnExit;
	public static JPanel panel, btnPanel, title;
	private static JCheckBox cb;
	private static GridBagConstraints gc, gc2;
	private static int count = 0;
	public static boolean hints = false;

	public Design() {
		super("Chess"); //declaring parent-class constructor

		panel = new ImagePanel(new FlowLayout(FlowLayout.RIGHT, 0, 150)); //background panel with image
		btnPanel = new JPanel(new GridBagLayout()); //button panel
		title = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 150));
		gc = new GridBagConstraints();

		Font f = new Font("Imprint MT Shadow", Font.BOLD, 36);
		Font f2 = new Font("Imprint MT Shadow", Font.BOLD, 50);

		for (int i = 0; i < 4; i++) {
			
			butn[i] = new JButton();
			butn[i].setForeground(Color.white);
			butn[i].setFont(f);
			butn[i].setText(String.valueOf(i));
			butn[i].setSize(60, 60);
			butn[i].setBorderPainted(true);
			butn[i].setContentAreaFilled(false);
			butn[i].setFocusable(false);
			gc.gridx = 0;
			gc.gridy = i * 2;
			btnPanel.add(butn[i], gc);

			lbl[i] = new JLabel();
			lbl[i].setText("            ");
			lbl[i].setFont(f);
			lbl[i].setOpaque(false);
			gc.gridx = 0;
			gc.gridy = i + 1;

			btnPanel.add(lbl[i], gc);
		}

		btnPanel.setOpaque(false); //transparent panel and objects

		gc.gridx = 0;
		gc.gridy = 0;
		panel.add(btnPanel, gc2);

		btnPlay = butn[0];
		btnPlay.setFont(f2);
		btnPlay.setText("    Play    ");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPLayActionPerformed(e);
			}
		});

		btnInstructions = butn[1];
		btnInstructions.setText("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInstructionsActionPerformed(e);
			}
		});

		btnOptions = butn[2];
		btnOptions.setText("  Options >>");
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOptionsActionPerformed(e);
			}
		});

		btnExit = butn[3];
		btnExit.setText("   .....   ");
		btnExit.setEnabled(false);
		btnExit.setVisible(false);

		JLabel l = new JLabel("          ");
		gc.gridx = 0;
		gc.gridy = 6;
		btnPanel.add(l, gc);

		panel.validate(); //updating contents on panel
		add(panel);
		validate();
		setSize(800, 600); 
		setLocation(275, 100);
		this.setIconImage(ImagePanel.image);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String... args) {
		new Design().setVisible(true);

	}

	public void btnPLayActionPerformed(ActionEvent e) {

		String a[] = { "b", "c" };
		Design2.main(a); //calling main page 
		this.setVisible(false);

	}

	public void btnInstructionsActionPerformed(ActionEvent e) {

		System.out.println("you dit it");
		String a[] = { "b", "c" };
		Instructions.main(a); //calls instructions page
		this.setVisible(false);
	}

	public void btnOptionsActionPerformed(ActionEvent e) {

		count++;

		if (count % 2 == 0) {
			btnOptions.setText("  Options >>");
		} else {
			btnOptions.setText("  Options <<");
		}


		if (count % 2 == 1) {
			cb = new JCheckBox(); //check box for hints
			cb.setText("Turn on hints:");
			cb.setFont(new Font("Cambria", Font.PLAIN, 24));
			cb.setForeground(Color.white);
			cb.setContentAreaFilled(false);
			cb.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					if (cb.isSelected()) {
						System.out.println("IS SELCETED");
						hints = true;
					}

				}
			});

			gc.gridx = 0;
			gc.gridy = 6;
			btnPanel.add(cb, gc);
			btnPanel.validate();
		} else if (count > 0 && count % 2 == 0) { 
			cb.setVisible(false);
		}


	}
}