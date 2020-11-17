package com.yhlee;

import java.util.ArrayList;
import java.util.List;


public class Baseball {
	
	private static List<Integer> comNumberList = new ArrayList<Integer>();
	private static List<Integer> strike = new ArrayList<Integer>();
	private static List<Integer> ball = new ArrayList<Integer>();
	private static String GAME_STATUS_CHECK = "yes";
	
	public static void baseballGame(int size) {
		while(GAME_STATUS_CHECK.equals("yes")) {
			init();
			comNumberList = RandomNumber.comNumber(size);
			UiClass.checkCumNumber(comNumberList);
			playTheGame(size);
			GAME_STATUS_CHECK = UiClass.gameStatus();
		}
		UiClass.endGame();
	}
	
	private static void playTheGame(int size) {
		while(strike.size() != size) {
			init();
			List<Integer> userNumber = UserNumber.userNumberList(size);
			windUp(userNumber);
			UiClass.result(strike, ball); 
		}
	}
	
	private static void windUp(List<Integer> userNumber) {
		for(int i=0; i<comNumberList.size(); i++) {
			strikeCheck(userNumber, i);
			ballCheck(userNumber, i);
		}
	}
	
	private static void strikeCheck(List<Integer> checkList, int seq) {
		Integer comNumber = comNumberList.get(seq);
		if(comNumber.equals(checkList.get(seq))) {
			strike.add(comNumber);
		}
	}

	private static void ballCheck(List<Integer> checkList ,int seq) {
		Integer comNumber = comNumberList.get(seq);
		if(checkList.contains(comNumber) && !strike.contains(comNumber)) {
			ball.add(comNumber);
		}
	}
	
	private static void init() {
		strike = new ArrayList<Integer>();
		ball = new ArrayList<Integer>();
	}
	
}
