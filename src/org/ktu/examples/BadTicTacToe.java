package org.ktu.examples;

public class BadTicTacToe {
	private static final int BOARD_SIZE = 3;
	private int board[][] = new int[BOARD_SIZE][BOARD_SIZE];
	private boolean over;
	private int winner;
	private int currentPlayer;
	public BadTicTacToe(){
		reset();
	}
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(int currentPlayer) {
		if(currentPlayer > 2 || currentPlayer < 1){
			throw new IllegalArgumentException();
		}
		this.currentPlayer = currentPlayer;
	}
	public boolean isOver() {
		return over;
	}
	public void setWinner(int winner) {
		if(currentPlayer > 2 || currentPlayer < 1){
			throw new IllegalArgumentException();
		}
		this.winner = winner;
	}
	public void setOver(boolean isOver) {
		this.over = isOver;
	}
	public void reset(){
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = 0;
			}
		}
		over = false;
		winner = 0;
		System.out.println("Game begins!");
		drawBoard();
		System.out.println("Now it's player 1 turn!");
		currentPlayer = 1;
	}
	public int getWinner() {
		return winner;
	}
	public boolean mark(int i, int j, int mark){
		if(i > BOARD_SIZE || j > BOARD_SIZE || mark == 0){
			throw new IllegalArgumentException();
		}
		if(board[i][j] == 0){
			board[i][j] = mark;
			return true;
		}
		return false;
	}
	public boolean makeTurn(int i, int j){
		int playerId = currentPlayer;
		if(winner != 0){
			throw new IllegalStateException("This game has already been finished! The winner is player: " + winner);
		}
		if(over){
			throw new IllegalStateException("This game has already been finished as a draw!");
		}
		boolean res = mark(i, j, playerId);
		if(!res){
			System.out.println("This position is already taken");
			drawBoard();
			return false;
		}
		if(checkWinCondition()){
			System.out.println("We have a winner: player " + playerId + "!");
			winner = playerId;
			over = true;
			drawBoard();
			return true;
		}
		if(checkDrawCondition()){
			System.out.println("Game over: draw!");
			winner = 0;
			over = true;
			drawBoard();
			return true;
		}
		drawBoard();
		currentPlayer = nextPlayer();
		return true;
		
	}
	private int nextPlayer(){
		if(currentPlayer == 1){
			System.out.println("Now it's player 2 turn!");
			return 2;
		}
		if(currentPlayer == 2){
			System.out.println("Now it's player 1 turn!");
			return 1;
		}
		return 1;
	}
	private void drawBoard(){
		String marker = getMarker();
		String nextLine;
		for(int i = 0; i < BOARD_SIZE; i++){
			nextLine = "";
			for(int j = 0; j < BOARD_SIZE; j++){
				nextLine += getSymbol(board[i][j]);
				if(j < BOARD_SIZE -1){
					nextLine += "|";
				}
			}
			System.out.println(nextLine);
			if(i < BOARD_SIZE -1){
				System.out.println(marker);
			}
		}
	}
	private String getMarker(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < BOARD_SIZE;i++){
			sb.append("----");
		}
		return sb.toString();
	}
	private String getSymbol(int pid){
		switch(pid){
		case 0:
			return "   ";
		case 1:
			return " X ";
		case 2:
			return " O ";
		default:
			return " " + pid + " ";
		}
	}
	
	private boolean checkDrawCondition(){
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				if(board[i][j] == 0) return false;
			}
		}
		return true;
	}
	private boolean checkWinCondition(){
		return checkHorizonalLines() || checkVerticalLines() || checkDirectDiagonal() || checkInverseDiagonal();
	}
	private boolean checkHorizonalLines(){
		for(int i = 0; i < BOARD_SIZE; i++){
			int mark = board[i][0];
			if(mark == 0){
				continue;
			}
			for(int j = 1; j < BOARD_SIZE; j++){
				if(board[i][j] != mark){
					break;
				}
				if(j == BOARD_SIZE-1){
					return true;
				}
			}
		}
		return false;
	}
	private boolean checkVerticalLines(){
		for(int i = 0; i < BOARD_SIZE; i++){
			int mark = board[0][i];
			if(mark == 0){
				continue;
			}
			for(int j = 1; j < BOARD_SIZE; j++){
				if(board[j][i] != mark){
					break;
				}
				if(j == BOARD_SIZE-1){
					return true;
				}
			}
		}
		return false;
	}
	private boolean checkDirectDiagonal(){
		int mark = board[0][0];
		for(int i = 0; i < BOARD_SIZE; i++){
			if(mark == 0){
				break;
			}
			if(board[i][i] != mark){
				break;
			}
			if(i == BOARD_SIZE-1){
				return true;
			}
		}
		return false;
	}
	private boolean checkInverseDiagonal(){
		int oppositePos = BOARD_SIZE -1;
		int mark = board[oppositePos][0];
		for(int i = 0; i < BOARD_SIZE; i++){
			if(mark == 0){
				break;
			}
			if(board[oppositePos-i][i] != mark){
				break;
			}
			if(i == BOARD_SIZE-1){
				return true;
			}
		}
		return false;
	}
}
