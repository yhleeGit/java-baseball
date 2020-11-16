package com.test.yhlee;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballGame {

	private static List<Integer> comNumberList = Lists.newArrayList();
	private static List<Integer> strike = Lists.newArrayList();
	private static List<Integer> ball = Lists.newArrayList();
	
	@Test
	@DisplayName("baseballGame")
	void baseballGame() {
		comNumberList = RandomNumber.comNumber();
		System.out.print("컴퓨터의 입력된 숫자 -> ");
		for (Integer comNumber : comNumberList) {
			System.out.print(comNumber);
		}
		System.out.println();
		playTheGame();
	}

	void playTheGame() {
		while(strike.size() != 3) {
			strike = Lists.newArrayList();
			ball = Lists.newArrayList();
			List<Integer> userNumber = UserNumber.userNumberList();
			windUp(userNumber);
			System.out.println(strike.size()+" strike, "+ ball.size()+ " ball");
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
}
