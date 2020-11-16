package com.test.yhlee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Scanner;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumber {

	private static Scanner sc;

	@Test
	@DisplayName("사용자 입력값에 대한 테스트")
	void userNameCheckTest() {
		int size = 3;
		List<Integer> userNumberList = userNumberList(size);
		assertThat(userNumberList.size()).isEqualTo(size);
	}
	
	public static List<Integer> userNumberList(int size) {
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int userInputNumber = sc.nextInt();
		String convert = String.valueOf(userInputNumber);
		assertThat(convert.length()).isEqualTo(size);
		
		List<Integer> userNumber = Lists.newArrayList();
		for(int i = 0; i < size; i++) {
			userNumber.add(Character.getNumericValue(convert.charAt(i)));
		}
		return userNumber;
	}
}
