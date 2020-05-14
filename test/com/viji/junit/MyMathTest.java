package com.viji.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	//MyMath.sum
	//1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}

	
	@Test
	public void sum_with1numbers() {
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);
	}
	
	
	@Test
	public void sum_with10numbers() {
		int result = myMath.sum(new int[] {3,3,3,3,3,3,3,3,3,3,3});
		assertEquals(3, result);
	}
	
}
