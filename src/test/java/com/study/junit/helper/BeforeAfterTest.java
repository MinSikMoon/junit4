package com.study.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BeforeAfterTest {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	public BeforeAfterTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {{"AACD", "CD"},
		{"ACD", "CD"}};
		return Arrays.asList(expectedOutputs);
	}
    @Test
    public void test() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void test2() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

}
