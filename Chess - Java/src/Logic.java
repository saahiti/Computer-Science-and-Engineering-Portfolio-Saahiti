/**
 * The Logic for all of the pieces on the board
 * Alisa and Saahiti
 * Final Summative
 * ICS3U - Mr. Marco
 * Jan 23rd 2013
 */
public class Logic{
	// the rook movement and king movement is used in the castling part of the code
	static boolean whiterookmove = false;
	static boolean whitekingmove = false;
	static boolean blackrookmove = false;
	static boolean blackkingmove = false;
	//pathBlock is used by many methods to check if the path of a piece is blocked or not 
	static boolean pathBlock = false;
	//The queen counter uses these to count the amount of queens on the board
	static int WqueenCount = 1;
	static int BqueenCount = 1;
	
	// All of the canmove methods below check if the piece (in the name) can move to a specific location, with an 
	// input of where it is and where you want to move it 
	public static boolean canmoveWhitePawn(Object x1, Object x2){
		boolean canmove = false;
		String piece = Design2.pawn[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isWhite(i, j)){
					if ((i+1<8&&x1==Design2.btn[i+1][j]&&(isEmpty(i, j)||isPiece(i, j, piece)))||((j-1>=0 && i+1<8&&x1==Design2.btn[i+1][j-1]&&isBlack(i,j))||(j+1<8&&i+1<8&&x1==Design2.btn[i+1][j+1]&&isBlack(i, j)))){
						canmove = true;
					}
					else if(i>3&&i+2<8&&x1==Design2.btn[i+2][j]&&isEmpty(i, j)&& isEmpty(i+1, j)){
						canmove = true;
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveWhiteRook(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.rook[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isWhite(i, j)){
					for (int w = 0; w<8;w++){
						if (j+w<8 && x1==Design2.btn[i][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){	
								canmove = true;
							}
						}
						else if(j-w>=0 && x1==Design2.btn[i][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j-p)){
									pathBlock=true;	
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i+w<8 && x1==Design2.btn[i+w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j)){
									pathBlock=true;		
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && x1==Design2.btn[i-w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){	
								canmove = true;
							}
						}
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveWhiteKnight(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.knight[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isWhite(i, j)){
					if (((i+2<8&&j+1<8&&x1==Design2.btn[i+2][j+1])||(i+2<8&&j-1>=0&&x1==Design2.btn[i+2][j-1])||(i+1<8&&j+2<8&&x1==Design2.btn[i+1][j+2])||(i-2>=0&&j+1<8&&x1==Design2.btn[i-2][j+1])||(i-1>=0&&j+2<8&&x1==Design2.btn[i-1][j+2])||(i-2>=0&&j-1>=0&&x1==Design2.btn[i-2][j-1])||(i-1>=0&&j-2>=0&&x1==Design2.btn[i-1][j-2])||(i+1<8&&j-2>=0&&x1==Design2.btn[i+1][j-2]))&&(!isWhite(i, j))){
						canmove = true;
					}
				}
			}
		}
		return canmove; 
	}
	public static boolean canmoveWhiteBishop(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.bishop[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&& !isWhite(i, j)){
					for (int w = 0;w<8;w++){
						if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
					}	
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveWhiteQueen(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.queen[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isWhite(i,j)){
					for (int w = 0; w<8;w++){
						if (j+w<8 && x1==Design2.btn[i][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && x1==Design2.btn[i][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i+w<8 && x1==Design2.btn[i+w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && x1==Design2.btn[i-w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){		
								canmove = true;
							}
						}
						else if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j+p)){
									pathBlock=true;	
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j-p)){
									pathBlock=true;
								}	
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveWhiteKing (Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.king[0];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isWhite(i, j)&&!checkWhiteKing(Design2.btn[i][j])){
					if ((j+1<8 && x1==Design2.btn[i][j+1])||(i+1<8 && x1==Design2.btn[i+1][j])||(j+1<8 && i+1<8 && x1==Design2.btn[i+1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])||(i-1>=0 && x1==Design2.btn[i-1][j])||(j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1])||(j-1>=0 && i+1<8 && x1==Design2.btn[i+1][j-1])||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])){
						canmove = true;
					}
					else if (i==7&&j-2>=0&&x1==Design2.btn[i][j-2]&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[0]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[0]))){
						canmove = true;
					}
					else if (i==7&&j+2<8&&j-1>=0&&x1==Design2.btn[i][j+2]&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[0]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[0]))&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[0]))){
						canmove = true;
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackPawn(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.pawn[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i,j)){
					if((i-1>=0&&x1==Design2.btn[i-1][j]&&(isEmpty(i, j)||isPiece(i, j, piece)))||((j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1]&&isWhite(i, j))||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1]&&isWhite(i, j)))){
						canmove = true;
					}
					else if(i<4&&i-2>=0&&x1==Design2.btn[i-2][j]&&isEmpty(i-1, j)&&isEmpty(i, j)){
						canmove = true;
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackRook(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.rook[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i, j)){
					for (int w = 0; w<8;w++){
						if (j+w<8 && x1==Design2.btn[i][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && x1==Design2.btn[i][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i+w<8 && x1==Design2.btn[i+w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && x1==Design2.btn[i-w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j)){
									pathBlock=true;
									
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackKnight(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.knight[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i, j)){
					if (((i+2<8&&j+1<8&&x1==Design2.btn[i+2][j+1])||(i+2<8&&j-1>=0&&x1==Design2.btn[i+2][j-1])||(i+1<8&&j+2<8&&x1==Design2.btn[i+1][j+2])||(i-2>=0&&j+1<8&&x1==Design2.btn[i-2][j+1])||(i-1>=0&&j+2<8&&x1==Design2.btn[i-1][j+2])||(i-2>=0&&j-1>=0&&x1==Design2.btn[i-2][j-1])||(i-1>=0&&j-2>=0&&x1==Design2.btn[i-1][j-2])||(i+1<8&&j-2>=0&&x1==Design2.btn[i+1][j-2]))&&(!isBlack(i, j))){
						canmove = true;
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackBishop(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false; 
		String piece = Design2.bishop[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i,j)){
					for (int w = 0;w<8;w++){
						if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true; 
							}
						}
						else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
					}	
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackQueen(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.queen[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i,j)){
					for (int w = 0; w<8;w++){
						if (j+w<8 && x1==Design2.btn[i][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j+p)){
									pathBlock=true;	
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && x1==Design2.btn[i][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i, j-p)){
									pathBlock=true;	
								}
							}
							if (!pathBlock){
								canmove= true;
							}
						}
						else if(i+w<8 && x1==Design2.btn[i+w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(i-w>=0 && x1==Design2.btn[i-w][j]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j-p)){
									pathBlock=true;	
								}	
							}
							if (!pathBlock){
								canmove = true;
							}
						}
						else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i+p, j-p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true; 
							}
						}
						else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
							for (int p = 1; p<w;p++){
								if (!isEmpty(i-p, j+p)){
									pathBlock=true;
								}
							}
							if (!pathBlock){
								canmove = true;
							}
						}
					}
				}
			}
		}
		return canmove;
	}
	public static boolean canmoveBlackKing(Object x1, Object x2){
		pathBlock = false;
		boolean canmove = false;
		String piece = Design2.king[1];
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if (x2==Design2.btn[i][j]&&!isBlack(i, j)&&!checkBlackKing(Design2.btn[i][j])){
					if ((j+1<8 && x1==Design2.btn[i][j+1])||(i+1<8 && x1==Design2.btn[i+1][j])||(j+1<8 && i+1<8 && x1==Design2.btn[i+1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])||(i-1>=0 && x1==Design2.btn[i-1][j])||(j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1])||(j-1>=0 && i+1<8 && x1==Design2.btn[i+1][j-1])||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1])){
						canmove = true;
					}
					else if (i==0&&j-2>=0&&x1==Design2.btn[i][j-2]&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[1]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[1]))){
						canmove =  true;
					}
					else if (i==0&&j+2<8&&j-1>=0&&x1==Design2.btn[i][j+2]&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[1]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[1]))&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[1]))){
						canmove = true;
					}
				}
			}
		}
		return canmove;
	}
	// The code below will move any white piece after checking that all of the conditions for movement are met
	public static void moveWhite(Object x1, Object x2, String piece){
		piece = piece.trim();
		boolean pathBlock = false;
			for (int i=0;i<8;i++){
				for (int j=0;j<8;j++){
					if (x1==Design2.btn[i][j]){ 
						pathBlock=false;
						//checks what piece it is
						if ((piece.equals(Design2.pawn[0]))){
							if (i-1==0&&((x2==Design2.btn[i-1][j]&&isEmpty(i-1, j)||isPiece(i-1, j, Design2.queen[0]))||(j-1>=0&&x2==Design2.btn[i-1][j-1]&&isBlack(i-1, j-1)||isPiece(i-1, j-1, Design2.queen[0]))||(j+1<8&&x2==Design2.btn[i-1][j+1]&&isBlack(i-1, j)||isPiece(i-1, j, Design2.queen[0])))){
								Design2.btn[i][j].setText("");	
								Design2.count++;
								//The counts are used to decipher whether it is a white turn or a black turn
							}
							else if ((i-1>=0&&x2==Design2.btn[i-1][j]&&(isEmpty(i-1, j)||isPiece(i-1, j, piece)))||(i-1>=0&&j-1>=0&&x2==Design2.btn[i-1][j-1]&&(isPiece(i-1, j-1, piece)||isBlack(i-1, j-1)))||(j+1<8&&i-1>=0&&x2==Design2.btn[i-1][j+1]&&(isPiece(i-1, j+1, piece)||isBlack(i-1, j+1)))){
								Design2.btn[i][j].setText("");	
								Design2.count++;
							}
							else if (i-2>3&&x2==Design2.btn[i-2][j]&&isEmpty(i-1, j)&&(isEmpty(i-2, j)||isPiece(i-2, j, piece))){
									Design2.btn[i][j].setText("");
									Design2.count++;
							}		
						}
						if (piece.equals(Design2.rook[0])){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x2==Design2.btn[i][j+w]&&(isEmpty(i, j+w)||isPiece(i, j+w, piece)||isBlack(i, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;	 
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										whiterookmove = true; 
									}
								}
								else if(j-w>=0 && x2==Design2.btn[i][j-w]&&(isEmpty(i, j-w)||isPiece(i, j-w, piece)||isBlack(i, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										whiterookmove = true;
									}
								}
								else if(i+w<8 && x2==Design2.btn[i+w][j]&&(isEmpty(i+w, j)||isPiece(i+w, j, piece)||isBlack(i+w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText("");
										Design2.count++;
										whiterookmove = true;
									}
								}
								else if(i-w>=0 && x2==Design2.btn[i-w][j]&&(isEmpty(i-w, j)||isPiece(i-w, j, piece)||isBlack(i-w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										whiterookmove=true;
									}
								}
							}
						}
						if ((piece.equals(Design2.knight[0]))&&((i+2<8&&j+1<8&&x2==Design2.btn[i+2][j+1]&&(isEmpty(i+2, j+1)||isPiece(i+2, j+1, piece)||isBlack(i+2, j+1)))||(i+2<8&&j-1>=0&&x2==Design2.btn[i+2][j-1]&&(isEmpty(i+2, j-1)||isPiece(i+2, j-1, piece)||isBlack(i+2, j-1)))||(i+1<8&&j+2<8&&x2==Design2.btn[i+1][j+2]&&(isEmpty(i+1, j+2)||isPiece(i+1, j+2, piece)||isBlack(i+1, j+2)))||(i-2>=0&&j+1<8&&x2==Design2.btn[i-2][j+1]&&(isEmpty(i-2, j+1)||isPiece(i-2, j+1, piece)||isBlack(i-2, j+1)))||(i-1>=0&&j+2<8&&x2==Design2.btn[i-1][j+2]&&(isEmpty(i-1, j+2)||isPiece(i-1, j+2, piece)||isBlack(i-1, j+2)))||(i-2>=0&&j-1>=0&&x2==Design2.btn[i-2][j-1]&&(isEmpty(i-2, j-1)||isPiece(i-2, j-1, piece)||isBlack(i-2, j-1)))||(i-1>=0&&j-2>=0&&x2==Design2.btn[i-1][j-2]&&(isEmpty(i-1, j-2)||isPiece(i-1, j-2, piece)||isBlack(i-1, j-2)))||(i+1<8&&j-2>=0&&x2==Design2.btn[i+1][j-2]&&(isEmpty(i+1, j-2)||isPiece(i+1, j-2, piece)||isBlack(i+1, j-2))))){
							Design2.btn[i][j].setText("");
							Design2.count++;
						}
						if(piece.equals(Design2.bishop[0])){
							for (int w = 0;w<8;w++){
								if (j+w<8 && i+w<8 && x2==Design2.btn[i+w][j+w]&&(isEmpty(i+w, j+w)||isPiece(i+w, j+w, piece)||isBlack(i+w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i-w>=0 && x2==Design2.btn[i-w][j-w]&&(isEmpty(i-w, j-w)||isPiece(i-w, j-w, piece)||isBlack(i-w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;										 
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i+w<8 && x2==Design2.btn[i+w][j-w]&&(isEmpty(i+w, j-w)||isPiece(i+w, j-w, piece)||isBlack(i+w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && j+w<8 && x2==Design2.btn[i-w][j+w]&&(isEmpty(i-w, j+w)||isPiece(i-w, j+w, piece)||isBlack(i-w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;											 
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
							}
						}
						if(piece.equals(Design2.queen[0])){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x2==Design2.btn[i][j+w]&&(isEmpty(i, j+w)||isPiece(i, j+w, piece)||isBlack(i, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && x2==Design2.btn[i][j-w]&&(isEmpty(i, j-w)||isPiece(i, j-w, piece)||isBlack(i, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i+w<8 && x2==Design2.btn[i+w][j]&&(isEmpty(i+w, j)||isPiece(i+w, j, piece)||isBlack(i+w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && x2==Design2.btn[i-w][j]&&(isEmpty(i-w, j)||isPiece(i-w, j, piece)||isBlack(i-w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if (j+w<8 && i+w<8 && x2==Design2.btn[i+w][j+w]&&(isEmpty(i+w, j+w)||isPiece(i+w, j+w, piece)||isBlack(i+w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i-w>=0 && x2==Design2.btn[i-w][j-w]&&(isEmpty(i-w, j-w)||isPiece(i-w, j-w, piece)||isBlack(i-w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}	
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i+w<8 && x2==Design2.btn[i+w][j-w]&&(isEmpty(i+w, j-w)||isPiece(i+w, j-w, piece)||isBlack(i+w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && j+w<8 && x2==Design2.btn[i-w][j+w]&&(isEmpty(i-w, j+w)||isPiece(i-w, j+w, piece)||isBlack(i-w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
							}
						}
						if(piece.equals(Design2.king[0])){
							if ((j+1<8 && x2==Design2.btn[i][j+1]&&!checkWhiteKing(Design2.btn[i][j+1])&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isBlack(i, j+1)))||(i+1<8 && x2==Design2.btn[i+1][j]&&!checkWhiteKing(Design2.btn[i+1][j])&&(isEmpty(i+1, j)||isPiece(i+1, j, piece)||isBlack(i+1, j)))||(j+1<8 && i+1<8 && x2==Design2.btn[i+1][j+1]&&!checkWhiteKing(Design2.btn[i+1][j+1])&&(isEmpty(i+1, j+1)||isPiece(i+1, j+1, piece)||isBlack(i+1, j+1)))||(j-1>=0 && x2==Design2.btn[i][j-1]&&!checkWhiteKing(Design2.btn[i][j-1])&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isBlack(i, j-1)))||(i-1>=0 && x2==Design2.btn[i-1][j]&&!checkWhiteKing(Design2.btn[i-1][j])&&(isEmpty(i-1, j)||isPiece(i-1, j, piece)||isBlack(i-1, j)))||(j-1>=0 && i-1>=0 && x2==Design2.btn[i-1][j-1]&&!checkWhiteKing(Design2.btn[i-1][j-1])&&(isEmpty(i-1, j-1)||isPiece(i-1, j-1, piece)||isBlack(i-1, j-1)))||(j-1>=0 && i+1<8 && x2==Design2.btn[i+1][j-1]&&!checkWhiteKing(Design2.btn[i+1][j-1])&&(isEmpty(i+1, j-1)||isPiece(i+1, j-1, piece)||isBlack(i+1, j-1)))||(j+1<8 && i-1>=0 && x2==Design2.btn[i-1][j+1]&&!checkWhiteKing(Design2.btn[i-1][j+1])&&(isEmpty(i-1, j+1)||isPiece(i-1, j+1, piece)||isBlack(i-1, j+1)))||(j-1>=0 && x2==Design2.btn[i][j-1]&&!checkWhiteKing(Design2.btn[i][j-1])&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isBlack(i, j-1)))){
								Design2.btn[i][j].setText("");
								Design2.count++;
								whitekingmove = true;
							}
							else if (j+2<8 && x2==Design2.btn[i][j+2]&&!checkWhiteKing(Design2.btn[i][j+2])&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[0]))&&(isEmpty(i, j+2)||isPiece(i, j+2, piece)||isPiece(i, j+2, Design2.rook[0]))){
								Design2.btn[i][j].setText("");
								Design2.btn[i][j+3].setText("");
								Design2.count++;
							}
							else if (j-4>=0 && x2==Design2.btn[i][j-2]&&!checkWhiteKing(Design2.btn[i][j-2])&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[0]))&&(isEmpty(i, j-2)||isPiece(i, j-2, piece)||isPiece(i, j-2, Design2.rook[0]))&&(isEmpty(i, j-3)||isPiece(i, j-3, piece)||isPiece(i, j-3, Design2.rook[0]))){
								Design2.btn[i][j].setText("");
								Design2.btn[i][j-4].setText("");
								Design2.count++;
							}
						}
					}
						
					if (x2==Design2.btn[i][j]){
						pathBlock=false;
						if (piece.equals(Design2.pawn[0])){
							if (i==0&&((i+1<8&&x1==Design2.btn[i+1][j]&&(isEmpty(i, j)||isPiece(i, j, piece)))||((j-1>=0 && i+1<8&&x1==Design2.btn[i+1][j-1]&&isBlack(i,j))||(j+1<8&&i+1<8&&x1==Design2.btn[i+1][j+1]&&isBlack(i, j))))){
								Design2.btn[i][j].setText(Design2.queen[0]);
							}
							if ((i+1<8&&x1==Design2.btn[i+1][j]&&(isEmpty(i, j)||isPiece(i, j, piece)))||((j-1>=0 && i+1<8&&x1==Design2.btn[i+1][j-1]&&isBlack(i,j))||(j+1<8&&i+1<8&&x1==Design2.btn[i+1][j+1]&&isBlack(i, j)))){
								Design2.btn[i][j].setText(piece);
							}
							else if(i>3&&i+2<8&&x1==Design2.btn[i+2][j]&&isEmpty(i+1, j)&&isEmpty(i, j)){
								Design2.btn[i][j].setText(piece);
							}
						}
						if (piece.equals(Design2.rook[0])&&!isWhite(i, j)){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x1==Design2.btn[i][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && x1==Design2.btn[i][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i+w<8 && x1==Design2.btn[i+w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && x1==Design2.btn[i-w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
							}
						}
						if ((piece.equals(Design2.knight[0]))&&((i+2<8&&j+1<8&&x1==Design2.btn[i+2][j+1])||(i+2<8&&j-1>=0&&x1==Design2.btn[i+2][j-1])||(i+1<8&&j+2<8&&x1==Design2.btn[i+1][j+2])||(i-2>=0&&j+1<8&&x1==Design2.btn[i-2][j+1])||(i-1>=0&&j+2<8&&x1==Design2.btn[i-1][j+2])||(i-2>=0&&j-1>=0&&x1==Design2.btn[i-2][j-1])||(i-1>=0&&j-2>=0&&x1==Design2.btn[i-1][j-2])||(i+1<8&&j-2>=0&&x1==Design2.btn[i+1][j-2]))&&(!isWhite(i, j))){
							Design2.btn[i][j].setText(piece);
						}
						if(piece.equals(Design2.bishop[0])&&!isWhite(i, j)){
							for (int w = 0;w<8;w++){
								if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){		
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
							}	
						}
						if(piece.equals(Design2.queen[0])&&(!isWhite(i, j))){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x1==Design2.btn[i][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && x1==Design2.btn[i][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i+w<8 && x1==Design2.btn[i+w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){					
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && x1==Design2.btn[i-w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}	
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){
										
										Design2.btn[i][j].setText(piece);
									}
								}
							}
						}
						if(piece.equals(Design2.king[0])&&(!isWhite(i, j)&&!checkWhiteKing(Design2.btn[i][j]))){
							if ((j+1<8 && x1==Design2.btn[i][j+1])||(i+1<8 && x1==Design2.btn[i+1][j])||(j+1<8 && i+1<8 && x1==Design2.btn[i+1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])||(i-1>=0 && x1==Design2.btn[i-1][j])||(j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1])||(j-1>=0 && i+1<8 && x1==Design2.btn[i+1][j-1])||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])){
								Design2.btn[i][j].setText(piece);
							}
							else if (j-2>=0&&x1==Design2.btn[i][j-2]&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[0]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[0]))){
								Design2.btn[i][j].setText(piece);
								Design2.btn[i][j-1].setText(Design2.rook[0]);
							}
							else if (j+2<8 && j-1>=0&&x1==Design2.btn[i][j+2]&&!whitekingmove&&!whiterookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[0]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[0]))&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[0]))){
								Design2.btn[i][j].setText(piece);
								Design2.btn[i][j+1].setText(Design2.rook[0]);
							}
						}
					}
				}
			}
			queenCounter();
		}
	// The code below is the code to move every black object
	public static void moveBlack(Object x1, Object x2, String piece){
		piece = piece.trim();
		boolean pathBlock = false;
			for (int i=0;i<8;i++){
				for (int j=0;j<8;j++){
					if (x1==Design2.btn[i][j]){ 
						pathBlock=false;
						if ((piece.equals(Design2.pawn[1]))){
							if (i+1==7&&((x2==Design2.btn[i+1][j]&&(isEmpty(i+1, j)||isPiece(i+1, j, Design2.queen[1])))||(j+1<8&&x2==Design2.btn[i+1][j+1]&&(isWhite(i+1, j+1)||isPiece(i+1, j+1, Design2.queen[1])))||(j-1>=0&&x2==Design2.btn[i+1][j-1]&&(isWhite(i+1, j-1)||isPiece(i+1, j-1, Design2.queen[1]))))){
								Design2.btn[i][j].setText("");
								Design2.count++;
							}
							else if ((i+1<8&&x2==Design2.btn[i+1][j]&&(isEmpty(i+1, j)||isPiece(i+1, j, piece)))||((j-1>=0&&i+1<8&&x2==Design2.btn[i+1][j-1]&&isWhite(i+1, j-1)))||((j+1<8&&i+1<8&&x2==Design2.btn[i+1][j+1]&&isWhite(i+1, j+1)))){
								Design2.btn[i][j].setText("");
								Design2.count++;
							}
							else if (i+2<4&&x2==Design2.btn[i+2][j]&&isEmpty(i+1, j)&&(isEmpty(i+2, j)||isPiece(i+2, j, piece))){
								Design2.btn[i][j].setText("");
								Design2.count++;
							}
						}	
						if (piece.equals(Design2.rook[1])){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x2==Design2.btn[i][j+w]&&(isEmpty(i, j+w)||isPiece(i, j+w, piece)||isWhite(i, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										blackrookmove = true;
									}
								}
								else if(j-w>=0 && x2==Design2.btn[i][j-w]&&(isEmpty(i, j-w)||isPiece(i, j-w, piece)||isWhite(i, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										blackrookmove = true;
									}
								}
								else if(i+w<8 && x2==Design2.btn[i+w][j]&&(isEmpty(i+w, j)||isPiece(i+w, j, piece)||isWhite(i+w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										
										Design2.btn[i][j].setText("");
										Design2.count++;
										blackrookmove = true;
									}
								}
								else if(i-w>=0 && x2==Design2.btn[i-w][j]&&(isEmpty(i-w, j)||isPiece(i-w, j, piece)||isWhite(i-w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
										blackrookmove = true;
									}
								}
							}
						}
						if ((piece.equals(Design2.knight[1])||piece.equals("BK1")||piece.equals("BK2"))&&((i+2<8&&j+1<8&&x2==Design2.btn[i+2][j+1]&&(isEmpty(i+2, j+1)||isPiece(i+2, j+1, piece)||isWhite(i+2, j+1)))||(i+2<8&&j-1>=0&&x2==Design2.btn[i+2][j-1]&&(isEmpty(i+2, j-1)||isPiece(i+2, j+1, piece)||isWhite(i+2, j-1)))||(i+1<8&&j+2<8&&x2==Design2.btn[i+1][j+2]&&(isEmpty(i+1, j+2)||isPiece(i+1, j+2, piece)||isWhite(i+1, j+2)))||(i-2>=0&&j+1<8&&x2==Design2.btn[i-2][j+1]&&(isEmpty(i-2, j+1)||isPiece(i-2, j+1, piece)||isWhite(i-2, j+1)))||(i-1>=0&&j+2<8&&x2==Design2.btn[i-1][j+2]&&(isEmpty(i-1, j+2)||isPiece(i-1, j+2, piece)||isWhite(i-1, j+2)))||(i-2>=0&&j-1>=0&&x2==Design2.btn[i-2][j-1]&&(isEmpty(i-2, j-1)||isPiece(i-2, j-1, piece)||isWhite(i-2, j-1)))||(i-1>=0&&j-2>=0&&x2==Design2.btn[i-1][j-2]&&(isEmpty(i-1, j-2)||isPiece(i-1, j-2, piece)||isWhite(i-1, j-2)))||(i+1<8&&j-2>=0&&x2==Design2.btn[i+1][j-2]&&(isEmpty(i+1, j-2)||isPiece(i+1, j-2, piece)||isWhite(i+1, j-2))))){
							
							Design2.btn[i][j].setText("");
							Design2.count++;
						}
						if(piece.equals(Design2.bishop[1])){
							for (int w = 0;w<8;w++){
								if (j+w<8 && i+w<8 && x2==Design2.btn[i+w][j+w]&&(isEmpty(i+w, j+w)||isPiece(i+w,j+w, piece)||isWhite(i+w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i-w>=0 && x2==Design2.btn[i-w][j-w]&&(isEmpty(i-w, j-w)||isPiece(i-w, j-w, piece)||isWhite(i-w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i+w<8 && x2==Design2.btn[i+w][j-w]&&(isEmpty(i+w, j-w)||isPiece(i+w, j-w, piece)||isWhite(i+w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && j+w<8 && x2==Design2.btn[i-w][j+w]&&(isEmpty(i-w, j+w)||isPiece(i-w, j+w, piece)||isWhite(i-w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
							}
						}
						if(piece.equals(Design2.queen[1])){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x2==Design2.btn[i][j+w]&&(isEmpty(i, j+w)||isPiece(i, j+w, piece)||isWhite(i, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true; 
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && x2==Design2.btn[i][j-w]&&(isEmpty(i, j-w)||isPiece(i, j-w, piece)||isWhite(i, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i+w<8 && x2==Design2.btn[i+w][j]&&(isEmpty(i+w, j)||isPiece(i+w, j, piece)||isWhite(i+w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && x2==Design2.btn[i-w][j]&&(isEmpty(i-w, j)||isPiece(i-w, j, piece)||isWhite(i-w, j))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;				 
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if (j+w<8 && i+w<8 && x2==Design2.btn[i+w][j+w]&&(isEmpty(i+w, j+w)||isPiece(i+w, j+w, piece)||isWhite(i+w, j+w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i-w>=0 && x2==Design2.btn[i-w][j-w]&&(isEmpty(i-w, j-w)||isPiece(i-w, j-w, piece)||isWhite(i-w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}	
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(j-w>=0 && i+w<8 && x2==Design2.btn[i+w][j-w]&&(isEmpty(i+w, j-w)||isPiece(i+w, j-w, piece)||isWhite(i+w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
								else if(i-w>=0 && j+w<8 && x2==Design2.btn[i-w][j+w]&&(isEmpty(i-w, j+w)||isPiece(i-w, j+w, piece)||isWhite(i+w, j-w))){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText("");
										Design2.count++;
									}
								}
							}
						}
						if(piece.equals(Design2.king[1])){
							if ((j+1<8 && x2==Design2.btn[i][j+1]&&!checkBlackKing(Design2.btn[i][j+1])&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isWhite(i, j+1)))|| (i+1<8 && x2==Design2.btn[i+1][j]&&!checkBlackKing(Design2.btn[i+1][j])&&(isEmpty(i+1, j)||isPiece(i+1, j, piece)||isWhite(i+1, j)))||(j+1<8 && i+1<8 && x2==Design2.btn[i+1][j+1]&&!checkBlackKing(Design2.btn[i+1][j+1])&&(isEmpty(i+1, j+1)||isPiece(i+1, j+1, piece)||isWhite(i+1, j+1)))||(j-1>=0 && x2==Design2.btn[i][j-1]&&!checkBlackKing(Design2.btn[i][j-1])&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isWhite(i, j-1)))||(i-1>=0 && x2==Design2.btn[i-1][j]&&!checkBlackKing(Design2.btn[i-1][j])&&(isEmpty(i-1, j)||isPiece(i-1, j, piece)||isWhite(i-1, j)))||(j-1>=0 && i-1>=0 && x2==Design2.btn[i-1][j-1]&&!checkBlackKing(Design2.btn[i-1][j-1])&&(isEmpty(i-1, j-1)||isPiece(i-1, j-1, piece)||isWhite(i-1, j-1)))||(j-1>=0 && i+1<8 && x2==Design2.btn[i+1][j-1]&&!checkBlackKing(Design2.btn[i+1][j-1])&&(isEmpty(i+1, j-1)||isPiece(i+1, j-1, piece)||isWhite(i+1, j-1)))||(j+1<8 && i-1>=0 && x2==Design2.btn[i-1][j+1]&&!checkBlackKing(Design2.btn[i-1][j+1])&&(isEmpty(i-1, j+1)||isPiece(i-1, j+1, piece)||isWhite(i-1, j+1)))||(j-1>=0 && x2==Design2.btn[i][j-1]&&!checkBlackKing(Design2.btn[i][j-1])&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isWhite(i, j-1)))){
								Design2.btn[i][j].setText("");
								Design2.count++;
								blackkingmove = true;
							}
							else if ((j+3<8 && x2==Design2.btn[i][j+2]&&!checkBlackKing(Design2.btn[i][j+2])&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[1]))&&(isEmpty(i, j+2)||isPiece(i, j+2, piece)||isPiece(i, j+2, Design2.rook[1])))){
								Design2.btn[i][j].setText("");
								Design2.btn[i][j+3].setText("");
								Design2.count++;
							}
							else if ((j-4>=0 && x2==Design2.btn[i][j-2]&&!checkBlackKing(Design2.btn[i][j-2])&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[1]))&&(isEmpty(i, j-2)||isPiece(i, j-2, piece)||isPiece(i, j-2, Design2.rook[1]))&&(isEmpty(i, j-3)||isPiece(i, j-3, piece)||isPiece(i, j-3, Design2.rook[1])))){
								Design2.btn[i][j].setText("");
								Design2.btn[i][j-4].setText("");
								Design2.count++;
							}
						}
					}
					
					
					if (x2==Design2.btn[i][j]){
						pathBlock=false;
						if ((piece.equals(Design2.pawn[1]))){
							if(i==7&&((i-1>=0&&x1==Design2.btn[i-1][j]&&(isEmpty(i, j)||isPiece(i, j, Design2.queen[1])))||((j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1]&&(isWhite(i, j)||isPiece(i, j, Design2.queen[1])))||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1]&&(isWhite(i, j)||isPiece(i, j, Design2.queen[1])))))){
								Design2.btn[i][j].setText(Design2.queen[1]);
							}
							if((i-1>=0&&x1==Design2.btn[i-1][j]&&(isEmpty(i, j)||isPiece(i, j, piece)))||((j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1]&&isWhite(i, j))||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1]&&isWhite(i, j)))){
								Design2.btn[i][j].setText(piece);
							}
							else if(i<4&&i-2>=0&&x1==Design2.btn[i-2][j]&&isEmpty(i-1, j)&&isEmpty(i, j)){
								Design2.btn[i][j].setText(piece);
							}
						}
						if (piece.equals(Design2.rook[1])&&(!isBlack(i, j))){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x1==Design2.btn[i][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && x1==Design2.btn[i][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i+w<8 && x1==Design2.btn[i+w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){
										
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && x1==Design2.btn[i-w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
							}
						}
						if ((piece.equals(Design2.knight[1])||piece.equals("BK1")||piece.equals("BK2"))&&((i+2<8&&j+1<8&&x1==Design2.btn[i+2][j+1])||(i+2<8&&j-1>=0&&x1==Design2.btn[i+2][j-1])||(i+1<8&&j+2<8&&x1==Design2.btn[i+1][j+2])||(i-2>=0&&j+1<8&&x1==Design2.btn[i-2][j+1])||(i-1>=0&&j+2<8&&x1==Design2.btn[i-1][j+2])||(i-2>=0&&j-1>=0&&x1==Design2.btn[i-2][j-1])||(i-1>=0&&j-2>=0&&x1==Design2.btn[i-1][j-2])||(i+1<8&&j-2>=0&&x1==Design2.btn[i+1][j-2]))&&(!isBlack(i, j))){
							Design2.btn[i][j].setText(piece);
						}
						if((piece.equals(Design2.bishop[1])||piece.equals("BB1")|| piece.equals("BB2"))&&(!isBlack(i, j))){
							for (int w = 0;w<8;w++){
								if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
							}	
						}
						if((piece.equals(Design2.queen[1])||piece.equals("BQ"))&&(!isBlack(i, j))){
							for (int w = 0; w<8;w++){
								if (j+w<8 && x1==Design2.btn[i][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && x1==Design2.btn[i][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i, j-p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i+w<8 && x1==Design2.btn[i+w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && x1==Design2.btn[i-w][j]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if (j+w<8 && i+w<8 && x1==Design2.btn[i+w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j+p)){
											pathBlock=true;
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i-w>=0 && x1==Design2.btn[i-w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j-p)){
											pathBlock=true;
										}	
									}
									if (!pathBlock){	
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(j-w>=0 && i+w<8 && x1==Design2.btn[i+w][j-w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i+p, j-p)){
											pathBlock=true;
											
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
								else if(i-w>=0 && j+w<8 && x1==Design2.btn[i-w][j+w]){
									for (int p = 1; p<w;p++){
										if (!isEmpty(i-p, j+p)){
											pathBlock=true;	
										}
									}
									if (!pathBlock){
										Design2.btn[i][j].setText(piece);
									}
								}
							}
						}
						if((piece.equals(Design2.king[1]))&&!isBlack(i, j)&&!checkBlackKing(Design2.btn[i][j])){
							if ((j+1<8 && x1==Design2.btn[i][j+1])||(i+1<8 && x1==Design2.btn[i+1][j])||(j+1<8 && i+1<8 && x1==Design2.btn[i+1][j+1])||(j-1>=0 && x1==Design2.btn[i][j-1])||(i-1>=0 && x1==Design2.btn[i-1][j])||(j-1>=0 && i-1>=0 && x1==Design2.btn[i-1][j-1])||(j-1>=0 && i+1<8 && x1==Design2.btn[i+1][j-1])||(j+1<8 && i-1>=0 && x1==Design2.btn[i-1][j+1])){
								Design2.btn[i][j].setText(piece);
							}
							else if ((j-2>=0&&x1==Design2.btn[i][j-2]&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[1]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[1])))){
								Design2.btn[i][j].setText(piece);
								Design2.btn[i][j-1].setText(Design2.rook[1]);
							}
							else if ((j+2<8&&x1==Design2.btn[i][j+2]&&!blackkingmove&&!blackrookmove&&(isEmpty(i, j)||isPiece(i, j, piece)||isPiece(i, j, Design2.rook[1]))&&(isEmpty(i, j-1)||isPiece(i, j-1, piece)||isPiece(i, j-1, Design2.rook[1]))&&(isEmpty(i, j+1)||isPiece(i, j+1, piece)||isPiece(i, j+1, Design2.rook[1])))){
								Design2.btn[i][j].setText(piece);
								Design2.btn[i][j+1].setText(Design2.rook[1]);
							}
						}
					}
				}
			}
		queenCounter();
	}
	// isBlack checks if the piece is black or not
	public static boolean isBlack(int v, int w){
		if (Design2.btn[v][w].getText().equals(Design2.king[1])||Design2.btn[v][w].getText().equals(Design2.queen[1])||Design2.btn[v][w].getText().equals(Design2.rook[1])||Design2.btn[v][w].getText().equals(Design2.knight[1])||Design2.btn[v][w].getText().equals(Design2.bishop[1])||Design2.btn[v][w].getText().equals(Design2.pawn[1])){
			return true;
		}
		else{
			return false;
		}
	}
	//isEmpty checks if the location has any piece in it or not
	public static boolean isEmpty(int v, int w){
		if (Design2.btn[v][w].getText().trim().equals(".")||Design2.btn[v][w].getText().trim().equals("")||Design2.btn[v][w].getText().trim().equals(" ")){
			return true;
		}
		else{
			return false;
		}
	}
	//isPiece checks if a specific piece is in the specific place
	public static boolean isPiece(int v, int w, String piece){
		if (Design2.btn[v][w].getText().trim().equals(piece)){
			return true;
		}
		else{
			return false;
		}
	}
	//isWhite checeks if the piece is white or not
	public static boolean isWhite(int v, int w){
		if (Design2.btn[v][w].getText().equals(Design2.king[0])||Design2.btn[v][w].getText().equals(Design2.queen[0])||Design2.btn[v][w].getText().equals(Design2.rook[0])||Design2.btn[v][w].getText().equals(Design2.knight[0])||Design2.btn[v][w].getText().equals(Design2.bishop[0])||Design2.btn[v][w].getText().equals(Design2.pawn[0])){
			return true;
		}
		else{
			return false;
		}
	}
	//queenCounter counts how many of each queen is on the board
	public static void queenCounter(){
		WqueenCount = 0;
		BqueenCount = 0;
		for (int a = 0; a<8; a++){
			for (int b = 0; b<8; b++){
				if (Design2.btn[a][b].getText().equals(Design2.queen[0])){
					WqueenCount++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.queen[1])){
					BqueenCount++;
				}
			}
		}
	}
	//the code below checks if the white king is in danger in a specific position
	public static boolean checkWhiteKing(Object x){
		boolean inDanger = false;	
		int a = 0; int b=0;
		String pieceat = "";
		queenCounter();
		Object BQ[] = new Object[BqueenCount];
		Object BR[] = new Object[2];
		Object BB[] = new Object[2];
		Object BK[] = new Object[2];
		Object BP[] = new Object[8];
		int z = 0; 
		int q = 0;
		int bi = 0;
		int k = 0;
		int r = 0; 
		for (int i = 0; i<8;i++){
			for (int j = 0; j<8; j++){
				if (Design2.btn[i][j].getText().equals(Design2.queen[1])){
					BQ[q] = Design2.btn[i][j];
					q++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.rook[1])){
					BR[r] = Design2.btn[i][j];
					r++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.knight[1])){
					BK[k] = Design2.btn[i][j];
					k++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.bishop[1])){
					BB[bi] = Design2.btn[i][j];
					bi++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.pawn[1])){
					BP[z] = Design2.btn[i][j];
					z++;
				}
				if (x==Design2.btn[i][j]){
					pieceat= Design2.btn[i][j].getText();
					Design2.btn[i][j].setText(Design2.king[0]); 
					a=i;
					b=j;
				}
			}
		}
		for(int s = 0; s<z; s++){
			if (canmoveBlackPawn(BP[s], x)&&(BP[s]!=x)){
				inDanger = true;
			}
		}
		for(int n = 0; n<2; n++){
			if ((canmoveBlackRook(BR[n], x)&&(BR[n]!=x))||(canmoveBlackBishop(BB[n], x)&&(BB[n]!=x))||(canmoveBlackKnight(BK[n], x)&&(BK[n]!=x))){
				inDanger = true;
			}
		}
		for(int t = 0; t<q; t++){
			if (canmoveBlackQueen(BQ[t], x)&&(BQ[t]!=x)){
				inDanger = true;
			}
		}
		Design2.btn[a][b].setText(pieceat);
		return inDanger;
	}
	//The code below checks if the black king is in danger
	public static boolean checkBlackKing(Object x){
		boolean inDanger = false;	
		int a = 0; int b=0;
		String pieceat = "";
		queenCounter();
		Object WQ[] = new Object[WqueenCount];
		Object WR[] = new Object[2];
		Object WB[] = new Object[2];
		Object WK[] = new Object[2];
		Object WP[] = new Object[8];
		int q = 0;
		int bi = 0;
		int k = 0;
		int r = 0; 
		int z = 0; 
		for (int i = 0; i<8;i++){
			for (int j = 0; j<8; j++){
				if (Design2.btn[i][j].getText().equals(Design2.queen[0])){
					WQ[q] = Design2.btn[i][j];
					q++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.rook[0])){
					WR[r] = Design2.btn[i][j];
					r++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.knight[0])){
					WK[k] = Design2.btn[i][j];
					k++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.bishop[0])){
					WB[bi] = Design2.btn[i][j];
					bi++;
				}
				else if (Design2.btn[i][j].getText().equals(Design2.pawn[0])){
					WP[z] = Design2.btn[i][j];
					z++;
				}
				if (x==Design2.btn[i][j]){
					pieceat= Design2.btn[i][j].getText();
					Design2.btn[i][j].setText(Design2.king[1]);
					a=i;
					b=j;
				}
			}
		}
		for(int s = 0; s<z; s++){
			if (canmoveWhitePawn(WP[s], x)&&(WP[s]!=x)){
				inDanger = true;
			}	
		}
		for (int n = 0; n<2; n++){
			if ((canmoveWhiteRook(WR[n], x)&&(WR[n]!=x))||(canmoveWhiteBishop(WB[n], x)&&(WB[n]!=x))||(canmoveWhiteKnight(WK[n], x)&&(WK[n]!=x))){
				inDanger = true;
			}
		}
		for (int t = 0; t<q; t++){
			if(canmoveWhiteQueen(WQ[t], x)&&(WQ[t]!=x)){
				inDanger = true;
			}
		}
		Design2.btn[a][b].setText(pieceat);
		return inDanger;
	}
	//Checks if the black pieces achieved checkmate by moving every single white piece into each one of its possible positions
	//and checking if the king is still in danger when they have moved (it undoes all of the moving)
	public static boolean checkmateWhite(){
		queenCounter();
		Object WQ[] = new Object[WqueenCount];
		Object WR[] = new Object[2];
		Object WB[] = new Object[2];
		Object WK[] = new Object[2];
		Object WP[] = new Object[8];
		int z = 0; 
		int q = 0;
		int bi = 0;
		int k = 0;
		int r = 0; 
		String x2piece = "";
		Object x1 = new Object();
		Object x2 = new Object();
		String piece = "";
		boolean inDanger;
		boolean checkmate = false;
		Object kingAt = new Object();
		for (int a = 0; a<8; a++){
			for (int b = 0; b<8; b++){
				if (Design2.btn[a][b].getText().equals(Design2.queen[0])){
					WQ[q] = Design2.btn[a][b];
					q++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.rook[0])){
					WR[r] = Design2.btn[a][b];
					r++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.knight[0])){
					WK[k] = Design2.btn[a][b];
					k++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.bishop[0])){
					WB[bi] = Design2.btn[a][b];
					bi++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.pawn[0])){
					WP[z] = Design2.btn[a][b];
					z++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.king[0])){
					kingAt = Design2.btn[a][b];
				}
			}
		}
		checkmate = true;
		inDanger = checkWhiteKing(kingAt);
		if (inDanger){
			for (int i = 0; i<8; i++){
				for (int j = 0; j<8; j++){
					for (int u = 0; u<8; u++){
						if (canmoveWhitePawn(WP[u], Design2.btn[i][j])){
							x2piece = Design2.btn[i][j].getText();
							x1 = WP[u];
							x2 = Design2.btn[i][j];
							piece = Design2.pawn[0];
							moveWhite(x1, x2, piece);
							inDanger = checkWhiteKing(kingAt);
							if (!inDanger){
								checkmate = false;
								
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
					}
					for (int t = 0; t<2; t++){
						if (canmoveWhiteKnight(WK[t], Design2.btn[i][j])){
							x2piece = Design2.btn[i][j].getText();
							x1 = WK[t];
							x2 = Design2.btn[i][j];
							piece = Design2.knight[0];
							moveWhite(x1, x2, piece);
							inDanger = checkWhiteKing(kingAt);
							if (!inDanger){
								checkmate = false;
								
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
						if (canmoveWhiteRook(WR[t], Design2.btn[i][j])){
							x1 = WR[t];
							x2 = Design2.btn[i][j];
							piece = Design2.rook[0];
							x2piece = Design2.btn[i][j].getText();
							moveWhite(x1, x2, piece);
							inDanger = checkWhiteKing(kingAt);
							if (!inDanger){
								checkmate = false;
								
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
						if (canmoveWhiteBishop(WB[t], Design2.btn[i][j])){
							x1 = WB[t];
							x2 = Design2.btn[i][j];
							piece = Design2.bishop[0];
							x2piece = Design2.btn[i][j].getText();
							moveWhite(x1, x2, piece);
							inDanger = checkWhiteKing(kingAt);
							if (!inDanger){
								checkmate = false;
								
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}	
					}
					for(int n = 0; n<q; n++){
						if (canmoveWhiteQueen(WQ[n], Design2.btn[i][j])){
							x1 = WQ[n];
							x2 = Design2.btn[i][j];
							piece = Design2.queen[0];
							x2piece = Design2.btn[i][j].getText();
							moveWhite(x1, x2, piece);
							inDanger = checkWhiteKing(kingAt);
							if (!inDanger){
								checkmate = false;
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
					}
					if (canmoveWhiteKing(kingAt, Design2.btn[i][j])){
						x1 = kingAt;
						x2 = Design2.btn[i][j];
						piece = Design2.king[0];
						x2piece = Design2.btn[i][j].getText();
						moveWhite(x1, x2, piece);
						inDanger = checkWhiteKing(x2);
						if (!inDanger){
							checkmate = false;
						}
						undoMove(x1, x2, piece, x2piece);
						Design2.count--;
					}
				}
			}	
		 }
		else {
			checkmate = false;
		}
		return checkmate;
	}
	//checks if the white pieces achieved checkmate 
	public static boolean checkmateBlack(){
		queenCounter();
		Object BQ[] = new Object[BqueenCount];
		Object BR[] = new Object[2];
		Object BB[] = new Object[2];
		Object BK[] = new Object[2];
		Object BP[] = new Object[8];
		int z = 0; 
		int q = 0;
		int bi = 0;
		int k = 0;
		int r = 0; 
		String x2piece = "";
		Object x1 = new Object();
		Object x2 = new Object();
		String piece = "";
		boolean inDanger;
		boolean checkmate = false;
		Object kingAt = new Object();
		for (int a = 0; a<8; a++){
			for (int b = 0; b<8; b++){
				if (Design2.btn[a][b].getText().equals(Design2.queen[1])){
					BQ[q] = Design2.btn[a][b];
					q++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.rook[1])){
					BR[r] = Design2.btn[a][b];
					r++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.knight[1])){
					BK[k] = Design2.btn[a][b];
					k++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.bishop[1])){
					BB[bi] = Design2.btn[a][b];
					bi++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.pawn[1])){
					BP[z] = Design2.btn[a][b];
					z++;
				}
				else if (Design2.btn[a][b].getText().equals(Design2.king[1])){
					kingAt = Design2.btn[a][b];
				}
			}
		}
		checkmate = true;
		inDanger = checkBlackKing(kingAt);
		if (inDanger){
			for (int i = 0; i<8; i++){
				for (int j = 0; j<8; j++){
					for (int u = 0; u<8; u++){
						if (canmoveBlackPawn(BP[u], Design2.btn[i][j])){
							x2piece = Design2.btn[i][j].getText();
							x1 = BP[u];
							x2 = Design2.btn[i][j];
							piece = Design2.pawn[1];
							moveBlack(x1, x2, piece);
							inDanger = checkBlackKing(kingAt);
							if (!inDanger){
								checkmate = false;	
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
					}
					for (int t = 0; t<2; t++){
						if (canmoveBlackKnight(BK[t], Design2.btn[i][j])){
							x2piece = Design2.btn[i][j].getText();
							x1 = BK[t];
							x2 = Design2.btn[i][j];
							piece = Design2.knight[1];
							moveBlack(x1, x2, piece);
							inDanger = checkBlackKing(kingAt);
							if (!inDanger){
								checkmate = false;
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
						if (canmoveBlackRook(BR[t], Design2.btn[i][j])){
							x1 = BR[t];
							x2 = Design2.btn[i][j];
							piece = Design2.rook[1];
							x2piece = Design2.btn[i][j].getText();
							moveBlack(x1, x2, piece);
							inDanger = checkBlackKing(kingAt);
							if (!inDanger){
								checkmate = false;
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
						if (canmoveBlackBishop(BB[t], Design2.btn[i][j])){
							x1 = BB[t];
							x2 = Design2.btn[i][j];
							piece = Design2.bishop[1];
							x2piece = Design2.btn[i][j].getText();
							moveBlack(x1, x2, piece);
							inDanger = checkBlackKing(kingAt);
							if (!inDanger){
								checkmate = false;
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}	
					}
					for(int n = 0; n<q; n++){
						if (canmoveBlackQueen(BQ[n], Design2.btn[i][j])){
							x1 = BQ[n];
							x2 = Design2.btn[i][j];
							piece = Design2.queen[1];
							x2piece = Design2.btn[i][j].getText();
							moveBlack(x1, x2, piece);
							inDanger = checkBlackKing(kingAt);
							if (!inDanger){
								checkmate = false;
							}
							undoMove(x1, x2, piece, x2piece);
							Design2.count--;
						}
					}
					if (canmoveBlackKing(kingAt, Design2.btn[i][j])){
						x1 = kingAt;
						x2 = Design2.btn[i][j];
						piece = Design2.king[1];
						x2piece = Design2.btn[i][j].getText();
						moveBlack(x1, x2, piece);
						inDanger = checkBlackKing(x2);
						if (!inDanger){
							checkmate = false;
						}
						undoMove(x1, x2, piece, x2piece);
						Design2.count--;
					}
				}
			}	
		 }
		else {
			checkmate = false;
		}
		return checkmate;
	}
	//Undoes a movement, used by the checkmate and just  check code
	public static void undoMove (Object x1, Object x2, String p, String x2p){
		for (int i = 0; i<8;i++){
			for(int j = 0; j<8; j++){
				if (x1!=x2){
					if(x1==Design2.btn[i][j]){
						Design2.btn[i][j].setText(p);
						if (Design2.btn[i][j].getText().equals(Design2.king[0])&& i==7 && j==5){
							whitekingmove = false;
						}
						if (Design2.btn[i][j].getText().equals(Design2.king[1])&& i==0 && j==5){
							blackkingmove = false;
						}	
						if (Design2.btn[i][j].getText().equals(Design2.rook[0])&& i==7&&(j==0||j==7)){
							whiterookmove = false;
						}
						if (Design2.btn[i][j].getText().equals(Design2.rook[1])&& i==0&&(j==0||j==7)){
							blackrookmove = false;
						}
					}
					else if (x2==Design2.btn[i][j]&&Design2.btn[i][j].getText().equals(p)){
							Design2.btn[i][j].setText(x2p);
					}
				}
			}
		}
	}
}
