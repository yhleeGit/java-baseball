package com.test.yhlee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.yhlee.UserNumber;

public class UserNumberTest {

	@Test
	@DisplayName("사용자 입력값에 대한 테스트")
	void userNameCheckTest() {
		int size = 3;
		List<Integer> userNumberList = UserNumber.userNumberList(size);
		assertThat(userNumberList.size()).isEqualTo(size);
	}
	
}
