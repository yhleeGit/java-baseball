package com.test.yhlee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.yhlee.Baseball;

public class BaseballGameTest {

	private final int SIZE = 3;
	
	@Test
	@DisplayName("baseballGame")
	void baseballGameTest() {
		Baseball.baseballGame(SIZE);
	}

}
