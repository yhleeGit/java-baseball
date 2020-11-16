package com.test.yhlee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballGame {

	private static List<Integer> comNumberList = Lists.newArrayList();
	private static List<Integer> strike = Lists.newArrayList();
	private static List<Integer> ball = Lists.newArrayList();
	private String GAME_STATUS_CHECK = "yes";
	private final int SIZE = 3;
	
	@Test
	@DisplayName("baseballGame")
	void baseballGame() {
		assertThat(SIZE).isBetween(1, 9);
		while(GAME_STATUS_CHECK.equals("yes")) {
			init();
			comNumberList = RandomNumber.comNumber(SIZE);
			UiClass.checkCumNumber(comNumberList);
			playTheGame();
			GAME_STATUS_CHECK = UiClass.gameStatus();
		}
		UiClass.endGame();
	}

	void playTheGame() {
		while(strike.size() != SIZE) {
			init();
			List<Integer> userNumber = UserNumber.userNumberList(SIZE);
			windUp(userNumber);
			UiClass.result(strike, ball);
		}
	}
	
	void windUp(List<Integer> userNumber) {
		for(int i=0; i<comNumberList.size(); i++) {
			strikeCheck(userNumber, i);
			ballCheck(userNumber, i);
		}
	}
	
	void strikeCheck(List<Integer> checkList, int seq) {
		Integer comNumber = comNumberList.get(seq);
		if(comNumber.equals(checkList.get(seq))) {
			strike.add(comNumber);
		}
	}

	void ballCheck(List<Integer> checkList ,int seq) {
		Integer comNumber = comNumberList.get(seq);
		if(checkList.contains(comNumber) && !strike.contains(comNumber)) {
			ball.add(comNumber);
		}
	}
	
	void init() {
		strike = Lists.newArrayList();
		ball = Lists.newArrayList();
	}
}
