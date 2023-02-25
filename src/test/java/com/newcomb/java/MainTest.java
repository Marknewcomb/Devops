package com.newcomb.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
	@BeforeAll
	static void setup() {
		System.out.println("Before All...");
	}
	@Test
	void assertTest() {
		assertTrue(true);
	}
	@ParameterizedTest
	@CsvSource({
		"10,20,30",
		"100,200,300"
	})
	void paramsTest(int a, int b, int result) {
		assertEquals(result,(a + b));
	}
}
