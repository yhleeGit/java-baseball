package com.test.yhlee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.yhlee.RandomNumber;

public class RandomNumberTest {

	@Test
	@DisplayName("랜덤 수에 대한 확인을 진행한다.")
	void randomNumberTest(){
		int size = 3;
		List<Integer> comNumberList = RandomNumber.comNumber(size);
		assertThat(comNumberList.size()).isEqualTo(size);
		for (Integer comNumber : comNumberList) {
			System.out.print(comNumber);
		}
		System.out.println();
	}
	
}
