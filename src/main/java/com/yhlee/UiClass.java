package com.yhlee;

import java.util.List;
import java.util.Scanner;

public class UiClass {
	
	private static Scanner sc;

	public static void result(List<Integer> strike, List<Integer> ball) {
		if(strike.size()+ball.size() == 0) {
			System.out.println("낫싱");
			return;
		}
		System.out.println(strike.size()+" strike, "+ ball.size()+ " ball");
	}
	
	public static void checkCumNumber(List<Integer> comNumberList) {
		System.out.print("컴퓨터의 입력된 숫자 -> ");
		for (Integer comNumber : comNumberList) {
			System.out.print(comNumber);
		}
		System.out.println();
	}
	
	public static String gameStatus() {
		sc = new Scanner(System.in);
		System.out.println("게임을 다시 시작하려면  yes를 입력하세요.");
		return sc.next();
	}
	
	public static void endGame() {
		System.out.println("게임이 종료 됩니다.");
	}
}
