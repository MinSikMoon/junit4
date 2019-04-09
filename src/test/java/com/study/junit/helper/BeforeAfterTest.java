package com.study.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTest {

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
        System.out.println("test1 executed");
    }

}
