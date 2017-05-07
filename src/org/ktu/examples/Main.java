package org.ktu.examples;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addOne(6));
		
		ConstructLTConverter conv = new ConstructLTConverter();
		for(int i = -105; i < 105; i++){
			System.out.println(String.format("%1$s: %2$s", i, conv.getNumberName(i)));
		}
		Random r = new Random(System.currentTimeMillis());
		for(double i = -105; i < 105; i+=0.01){
			if(r.nextInt(10) == 0)
				System.out.println(String.format("%1$s: %2$s", i, conv.getDoubleName(i)));
		}
		System.out.println(String.format("%1$s: %2$s", true, conv.getBoolName(true)));
		System.out.println(String.format("%1$s: %2$s", false, conv.getBoolName(false)));
		playTicTacToe();
	}
	private static void playTicTacToe(){
		System.out.println("How many tictactoes would you like?");
		Scanner scanner = new Scanner(System.in);
		String res = scanner.nextLine();
		int cnt = Integer.parseInt(res);
		BadTicTacToe gameController = new BadTicTacToe();
		int trex;
		for(int i = 0; i < cnt; i++){
			if(gameController.isOver()){
				gameController.reset();
			}
			System.out.println("Chuse pozishn (0-8)");
			res = scanner.nextLine();
			trex = Integer.parseInt(res);
			gameController.makeTurn(trex/3, trex%3);
			if(!gameController.isOver()){
				i--;
			}
		}
	}

}
