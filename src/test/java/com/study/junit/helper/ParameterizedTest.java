package com.study.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParameterizedTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class==");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after Class==");
	}

	@Before
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void tearddown() {
		System.out.println("after test");
	}

}