package com.yhlee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	
	public static List<Integer> comNumber(int size){
		List<Integer> comNumberList = new ArrayList<Integer>();
		while(comNumberList.size() < size) {
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
