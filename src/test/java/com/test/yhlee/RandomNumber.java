package com.test.yhlee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Random;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumber {

	@Test
	@DisplayName("랜덤 수에 대한 확인을 진행한다.")
	void randomNumberTest(){
		List<Integer> comNumberList = comNumber();
		assertThat(comNumberList.size()).isEqualTo(3);
		for (Integer comNumber : comNumberList) {
			System.out.print(comNumber);
		}
		System.out.println();
	}
	
	public static List<Integer> comNumber(){
		List<Integer> comNumberList = Lists.newArrayList();
		while(comNumberList.size() < 3) {
			makeRandomNumber(comNumberList);
		}
		return comNumberList;
	}
	
	static void makeRandomNumber(List<Integer> comNumberList) {
		Random random = new Random();
		int nextInt = random.nextInt(9)+1; //기능 요구 사항 1부터 9까지 조건
		if(!comNumberList.contains(nextInt)) {	//중복값 확인 작업
			comNumberList.add(nextInt);
		}
	}
}
