package com.yhlee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNumber {
	
	private static Scanner sc;
	
	public static List<Integer> userNumberList(int size) {
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int userInputNumber = sc.nextInt();
		String convert = String.valueOf(userInputNumber);
		
		List<Integer> userNumber = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			userNumber.add(Character.getNumericValue(convert.charAt(i)));
		}
		return userNumber;
	}
}
