/**
 * Chess board (main page) for Chess Game
 * Saahiti and Alisa
 * Final Summative
 * ICS3U - Mr. Marco
 * Jan 23rd 2013
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class Design2 extends JPanel {
		//the code below are all variables used in the code
		Object x1 = "";
		Object x2 = "";
		Object x3 = "";
		String txt = "";
		
		boolean cm = false;//if piece can move
		public static Color c;
		String piece = "";
		public static int count = 1;
		private static final int n = 8;
	    private static final int SIZE = 75;
	    private static final int m = 50;															
	    
	    //makes/sets the pieces 
	    public static Font fo = new Font("Merida Unicode", Font.BOLD, 38), fo2 = new Font("Cambria", Font.PLAIN, 24), fo3 = new Font("Cambria", Font.BOLD, 34);
	    public static String[] king = {"\u2654", "\u265A"}, queen = {"\u2655","\u265B"}, rook = {"\u2656","\u265C"}, bishop = {"\u2657","\u265D"}, knight = {"\u2658","\u265E"}, pawn = {"\u2659","\u265F"};
	    public static String[] sb = {rook[0], knight[0], bishop[0], queen[0], king[0], bishop[0], knight[0], rook[0],};
	    public static String[] sw = {rook[1], knight[1], bishop[1], queen[1], king[1], bishop[1], knight[1], rook[1],};
	    private static boolean hints = Design.hints;
	    private static Color c2;
	    
	    //controller for the buttons
	    public Controller controller = new Controller();
	    //constructs the main frame
	    public JFrame f;
	    public static JPanel p;
	    private static JPanel p2;
	    private static GridBagConstraints gc;
	    private JLabel lblTurn;
	    private static String turn;
	    public static JButton[][] btn = new JButton[n][n];
	   
	    
	    public Design2() {
			
	        super(new GridBagLayout()); //parent-class constructor
	        this.setPreferredSize(new Dimension(n * SIZE, n * SIZE + m));
	        gc = new GridBagConstraints();
	        setVisible(true);
	        
	        p = new JPanel(new GridLayout(n,n)); //button panel for squares on chess board 
	        p.setPreferredSize(new Dimension(n* SIZE, n * SIZE));
	       
	        c = this.getBackground();
	        c2 = new Color(102, 0, 255, 150);
	        
	        //creates and adds buttons onto chess board
	        int g = 0; 
	        for (int i = 0; i<n; i++) {
	        	for (int j = 0; j<n; j++){
	        		btn[i][j]= new ChessButton(g);
	        		btn[i][j].addActionListener(controller);
	        		p.add(btn[i][j]);
	        		g++;
	        	}	
	        }
	        
	        gc.gridx = 0;
			gc.gridy = 0;
	        this.add(p, gc);
	        
	        p2 = new JPanel(new GridBagLayout());
	        p2.setPreferredSize(new Dimension(n*SIZE, m));
	        p2.setBackground(c2);
	        
	        lblTurn = new JLabel();
	        lblTurn.setFont(fo3);
	        lblTurn.setText("White's turn");
	        lblTurn.setForeground(Color.white);
	        p2.add(lblTurn);
	        p2.validate();
	     
	        gc.gridx = 0;
			gc.gridy = 1;
	        this.add(p2, gc);
	        this.validate();
	        //*/
	    }
	    public class Controller implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				boolean WhiteKingDanger = false;
				boolean BlackKingDanger = false;
				String x2piece = "";
				String actionCommand = e.getActionCommand();
				actionCommand = actionCommand.trim();	
				//the count starts at 1, so if its divisible by two, a piece has already been clicked
				if (count%2==0){
					//checks if it is a black piece or a white one
					if (piece.equals(pawn[1])||piece.equals(rook[1])||piece.equals(knight[1])||piece.equals(bishop[1])||piece.equals(queen[1])||piece.equals(king[1])){
						x2 = e.getSource();
						x2piece = actionCommand;
						//moves the piece from x1 to x2
						Logic.moveBlack(x1, x2, piece);
						//Erases the change of colour in the tiles when teh hints are on
						backgroundChange();
						BlackKingDanger = checkBKing();
						//if the king is still in danger after the moving, the move is undone and the count back to a number
						//that, when 3 is subtracted, is divisible by 4 ((count-3)%4=0)
						if (BlackKingDanger){
							Logic.undoMove(x1, x2, piece, x2piece);
							count=19;
						}else{	
							//if the count is the same, the conditions for moving haven't been meet, so it subtracts from 
							//the count
							if (x1==x2){
								count--;
							}
							if (count%4==0){
								count--;
							}
						}
						//Sets the text at the bottom - black move or white move
						if ((count-3)%4==0){
							lblTurn.setText("Black's Turn");
							lblTurn.setForeground(Color.black);
						}
						else{
							lblTurn.setText("White's Turn");
							lblTurn.setForeground(Color.white);
						}
					}else{
						//Similar to the black code
						x2 = e.getSource();
						x2piece = actionCommand;
						Logic.moveWhite(x1, x2, piece);
						backgroundChange();
						WhiteKingDanger = checkWKing();
						if (WhiteKingDanger){
							Logic.undoMove(x1, x2, piece, x2piece);
							count=17;
						}
						else{
							if (x1==x2){
								count--;
							}
							if (count%2==0){
								count--;
							}
						}
						if ((count-3)%4==0){
							lblTurn.setText("Black's Turn");
							lblTurn.setForeground(Color.black);
						}
						else{
							lblTurn.setText("White's Turn");
							lblTurn.setForeground(Color.white);
						}
					}
				}else{
					//if count-3%4=0, then it should be a black piece
					if ((count-3)%4==0){
						backgroundChange();
						System.out.println("check");
						if (actionCommand.equals(pawn[1])||actionCommand.equals(rook[1])||actionCommand.equals(knight[1])||actionCommand.equals(bishop[1])||actionCommand.equals(queen[1])||actionCommand.equals(king[1])){
							System.out.println("check1");
							//checks if the king is in danger or if checkmate occurs
							BlackKingDanger = checkBKing();
							if (Logic.checkmateBlack()&&hints){
								System.out.println("the checkmate code was tripped off");
								for (int p = 0; p<8; p++){
									for (int q = 0; q<8; q++){
										btn[p][q].setBackground(Color.white);
									}
								}
							}else{
								//records the piece you pressed and where it is
								piece = actionCommand;
								x1 = e.getSource();	
								count++;
								canmoveblacktest(x1);
							}
						}
					}
					else{
						//similar to the black code
						lblTurn.setText("White's Turn");
						backgroundChange();
						if (actionCommand.equals(pawn[0])||actionCommand.equals(rook[0])||actionCommand.equals(knight[0])||actionCommand.equals(bishop[0])||actionCommand.equals(queen[0])||actionCommand.equals(king[0])){
							WhiteKingDanger = checkWKing();
							if (Logic.checkmateWhite()&&hints){
								for (int p = 0; p<8; p++){
									for (int q = 0; q<8; q++){
										btn[p][q].setBackground(c2);
									}
								}
							} 
							else{
								piece = actionCommand;
								x1 = e.getSource();	
								count++;
								canmovewhitetest(x1);
							}
						}
					}
				}
				
			}
	    }
	
	    public static class ChessButton extends JButton {
	    	public ChessButton(int i) {
	            //super(i / n + "," + i % n);
	            //makes up the ceckboard
		        this.setOpaque(true);
	            this.setBorderPainted(false);
	            this.setFont(fo);
	            
	            String s = "";
	            if(i >= n && i < 2*n){
	            	s = pawn[1];
	            
	            }else if(i >= 6*n && i < 7*n){
	            	s = pawn[0];
	            
	            }else if(i < n){
	            	s = sw[i];
	            
	            }else if(i >= 7*n){
	            	s = sb[i - 56];
	            }

	            this.setText(s);
	            Color clr = Color.white;
	            
	            if ((i / n + i % n) % 2 == 1) {
	                this.setBackground(Color.gray);
	                //this.setBackground(Color.gray);
	            }else{
	            	this.setBackground(new Color(230,230,230));
	            }
	            
	            int x,y;
	            x = i/n; y = i%n;
	            btn[x][y] = this;
	        }
	    }

	    public void display() {
	    	
	        f = new JFrame("Design");
	    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	f.setResizable(false);
	    	//f.setImageIcon(ImagePanel.imageicon);
	        f.add(this);
	        f.setIconImage(ImagePanel.image);
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	        
	    }
	    //the method below sets the background to the original background
	    public static void backgroundChange(){
	    	int g = 0;
	    	for (int a = 0; a<8; a++){
				for (int b = 0; b<8;b++){
					g++;
					if (btn[a][b].getBackground().equals(c2)){
						if ((a + b) % 2 == 1) {
	                    btn[a][b].setBackground(Color.gray);
						}else {
	                	btn[a][b].setBackground(c);
						}
					}
				}
			}
	    }
	    

	    public static void main(String[] args) {
	    	EventQueue.invokeLater(new Runnable() {

	            @Override
	            public void run() {
	                new Design2().display();
	            }
	        });
	    }
	    //activates the code to check if the king is in danger 
	    public static boolean checkWKing(){
	    	boolean inDanger = false;
	    	for (int a = 0; a<8; a++){
	    		for (int b = 0; b<8; b++){
	    			if (btn[a][b].getText().equals(king[0])){
	    				inDanger = Logic.checkWhiteKing(btn[a][b]);
	    				if (inDanger && hints){
	    					btn[a][b].setBackground(c2);
	    				}
	    			}
	    		}
	    	}
	    	return inDanger;
	    }
	    //uses the Logic class to check if the black king is in danger, and if he is, it sets his bavckground to the purple
	    public static boolean checkBKing(){
	    	boolean inDanger = false;
	    	for (int a = 0; a<8; a++){
	    		for (int b = 0; b<8; b++){
	    			if (btn[a][b].getText().equals(king[1])){
	    				inDanger = Logic.checkBlackKing(btn[a][b]);
	    				if (inDanger && hints){
	    					btn[a][b].setBackground(c2);
	    				}
	    			}
	    		}
	    	}
	    	return inDanger;
	    }
	    //tests the white peices and where they can move using Logic
	    public static void canmovewhitetest(Object x1){
			int g = 0;
			for (int i = 0; i<8; i++){
				for (int j = 0; j<8; j++){
					if (x1==btn[i][j]){
						if (btn[i][j].getText().equals(pawn[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									g++;
									if (Logic.canmoveWhitePawn(x1, btn[a][b]) && hints){
										if ((g/8+g%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
						else if (btn[i][j].getText().equals(rook[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									g++;
									if (Logic.canmoveWhiteRook(x1, btn[a][b])&& hints){
										if ((g/8+g%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
						else if (btn[i][j].getText().equals(knight[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									g++;
									if (Logic.canmoveWhiteKnight(x1, btn[a][b])&& hints){
										if ((g/8+g%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
						else if (btn[i][j].getText().equals(bishop[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									g++;
									if (Logic.canmoveWhiteBishop(x1, btn[a][b])&& hints){
										if ((g/8+g%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
						else if (btn[i][j].getText().equals(queen[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									g++;
									if (Logic.canmoveWhiteQueen(x1, btn[a][b])&& hints){
										if ((g/8+g%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
						else if (btn[i][j].getText().equals(king[0])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
									if (Logic.canmoveWhiteKing(x1, btn[a][b])&& hints){
										if (((a*b)/8+(a*b)%8)%2==1){
											btn[a][b].setBackground(c2);
										}
										else{
											btn[a][b].setBackground(c2);
										}
									}
								}
							}
						}
					}
				}
			}	
		}
	    // same for black
	    public static void canmoveblacktest(Object x1){
			int g = 0; 
			for (int i = 0; i<8; i++){
				for (int j = 0; j<8; j++){
					if (x1==btn[i][j]){
						if (btn[i][j].getText().equals(pawn[1])){
							for (int a = 0; a<8; a++){
								for (int b = 0; b<8;b++){
								g++;
								if (Logic.canmoveBlackPawn(x1, btn[a][b])&& hints){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);
									}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
					else if (btn[i][j].getText().equals(rook[1])&& hints){
						for (int a = 0; a<8; a++){
							for (int b = 0; b<8;b++){
								g++;
								if (Logic.canmoveBlackRook(x1, btn[a][b])){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);
									}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
					else if (btn[i][j].getText().equals(knight[1]) && hints){
						for (int a = 0; a<8; a++){
							for (int b = 0; b<8;b++){
								g++;
								if (Logic.canmoveBlackKnight(x1, btn[a][b])){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);
									}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
					else if (btn[i][j].getText().equals(bishop[1])&& hints){
						for (int a = 0; a<8; a++){
							for (int b = 0; b<8;b++){
								g++;
								if (Logic.canmoveBlackBishop(x1, btn[a][b])){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);
									}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
					else if (btn[i][j].getText().equals(queen[1])&& hints){
						for (int a = 0; a<8; a++){
							for (int b = 0; b<8;b++){
								g++;
								if (Logic.canmoveBlackQueen(x1, btn[a][b])){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);
									}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
					else if (btn[i][j].getText().equals(king[1])&& hints){
						for (int a = 0; a<8; a++){
							for (int b = 0; b<8;b++){
								if (Logic.canmoveBlackKing(x1, btn[a][b])){
									if ((g/8+g%8)%2==1){
										btn[a][b].setBackground(c2);}
									else{
										btn[a][b].setBackground(c2);
									}
								}
							}
						}
					}
				}
			}
		}	
	}

		

}