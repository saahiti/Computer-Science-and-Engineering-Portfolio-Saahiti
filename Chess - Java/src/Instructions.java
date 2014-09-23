/**
 * Instructions page for Chess Game
 * Alisa and Saahiti
 * Final Summative
 * ICS3U - Mr. Marco
 * Jan 23rd 2013
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions extends JFrame {

	public static JFrame f;
	public static JPanel iPanel, lblPanel, btnPanel;
	private static GridBagConstraints gc;
	private final static int n = 6;
	private static JLabel[] lblWPiece = new JLabel[n], lblBPiece = new JLabel[n], lblInstr = new JLabel[n]; 
	private static JButton btnMain, btnPlay;
	private static int lwidth = 60, inswidth = 580;
	private static Dimension lbl = new Dimension(100, 65), ins = new Dimension(580, 75), btn = new Dimension(75, 75);   
	

	public static Font fo = new Font("Merida Unicode", Font.BOLD, 38), f2 = new Font("Cambria", Font.PLAIN, 17);
    public static String[] king = {"\u2654", "\u265A"}, queen = {"\u2655","\u265B"}, rook = {"\u2656","\u265C"}, bishop = {"\u2657","\u265D"}, knight = {"\u2658","\u265E"}, pawn = {"\u2659","\u265F"};
   
	public static String[] allW = {pawn[0], king[0], queen[0], rook[0], bishop[0], knight[0],};
	public static String[] allB = {pawn[1], king[1], queen[1], rook[1], bishop[1], knight[1]};
	
	public Instructions() {
		
		super("Instructions"); //declaring parent-class constructor
		
		iPanel = new ImagePanel(new FlowLayout(FlowLayout.LEFT, 1,1)); //background panel with image
		lblPanel = new JPanel(new GridBagLayout()); //labels for pawn pieces and instructions
		btnPanel = new JPanel(new GridBagLayout()); //navigators back to main page and game page
		gc = new GridBagConstraints();
		Color c = new Color (255,255,255,150);

		lblPanel.setBackground(c);

		for(int i=0; i<n; i++){
			lblWPiece[i] = new JLabel();
			lblWPiece[i].setFont(fo);
			lblWPiece[i].setPreferredSize(lbl);
			lblWPiece[i].setText("     "+allW[i]);
			lblWPiece[i].setForeground(Color.black);
			gc.gridx = 0;
			gc.gridy = i;
			lblPanel.add(lblWPiece[i], gc);

			lblBPiece[i] = new JLabel();
			lblBPiece[i].setFont(fo);
			lblBPiece[i].setPreferredSize(lbl);
			lblBPiece[i].setText("   "+allB[i]);
			lblBPiece[i].setForeground(Color.black);
			gc.gridx = 1;
			gc.gridy = i;
			lblPanel.add(lblBPiece[i], gc);

			//<li><i><italic></i>
			
			lblInstr[i] = new JLabel();
			lblInstr[i].setFont(new Font("Cambria", Font.PLAIN, 17));
			lblInstr[i].setPreferredSize(ins);
			lblInstr[i].setForeground(Color.black);
			gc.gridx = 2;
			gc.gridy = i;
			lblPanel.add(lblInstr[i], gc);
		}
		
		lblPanel.validate();
		JLabel lPawn, lKing, lQueen, lRook, lBishop, lKnight; 
		
		lblWPiece[0].setSize(lwidth, 140);
		lblBPiece[0].setSize(lwidth, 140);
		
		lPawn = lblInstr[0];
		lPawn.setPreferredSize(new Dimension(inswidth, 140));
		lPawn.setText("<html>Pawn <br> - can move forward one square into an unoccupied square <br> - can move two squares on its first move forward  <br> - captures an enemy piece on either of the front diagonal squares <br> - canNOT move backwards <br> - is promoted to queen upon reaching the last row");
	
		lKing = lblInstr[1];
		lKing.setPreferredSize(new Dimension(inswidth, 120));
		lKing.setText("<html>King <br> - moves exactly one square horizontally, vertically, or diagonally<br> ** only once per player, per game, the king can make a special move called castling: the king and rook can exchange positions when the squares between them are empty, only when each of the pieces haven't made any prior moves");
		
		
		lQueen = lblInstr[2];
		lQueen.setText("<html>Queen <br> - moves any number of vacant squares diagonally, horizontally, <br>   or vertically");
		
		lRook = lblInstr[3];
		lRook.setText("<html>Rook <br> - moves any number of vacant squares vertically or horizontally<br> ** also moves while castling");
		
		lBishop = lblInstr[4];
		lBishop.setText("<html>Bishop <br> - moves any number of vacant squares in any diagonal direction");
		
		lKnight = lblInstr[5];
		lKnight.setText("<html>Knight <br> - moves two squares horizontally then one square vertically");
		
		lblPanel.validate();
		
		btnMain = new JButton("<html>Return to<br> main page");
		gc.gridx = 0;
		gc.gridy = 6;
		btnMain.setForeground(Color.black);
		btnMain.setBackground(Color.white);
		
		btnMain.setFocusable(false);
		btnMain.setFont(f2);
		btnMain.setSize(100, 75);
		lblPanel.add(btnMain, gc);
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a[] = new String[] {" "};
				Design.main(a);
				setVisible(false);
			}
		});
		
		btnPlay = new JButton();
		btnPlay.setText("<html>Start <br>playing!  >>");
		gc.gridx = 1;
		gc.gridy = 6;
		btnPlay.setFont(f2);
		btnPlay.setSize(100, 75);
		btnPlay.setForeground(Color.black);
		btnPlay.setBackground(Color.white);
		//btnPlay.setContentAreaFilled(false);
		btnPlay.setFocusable(false);
		//btnPlay.setBorderPainted(true);
		lblPanel.add(btnPlay, gc);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a[] = new String[] {" "};
				Design2.main(a);
				setVisible(false);
				
			
			}
		});
		
		lblPanel.validate();
		//lblPanel.setForeground(Color.black);
		iPanel.add(lblPanel);
	
		iPanel.validate();
		
		add(iPanel);
		setSize(820, 675);
		setLocation(275, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String... args) {
		new Instructions().setVisible(true);

	}
}





