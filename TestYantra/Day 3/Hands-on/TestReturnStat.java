package com.tyss.corejava;

/**
 * @author Abisheikha
 */
public class TestReturnStat {
	public void Test() {
		System.out.println("test");
		return;
		/*
		 * as return doesn't return any value, it doesn't throw error if null is
		 * returned, it'll throw an error as it is a literal(true, false, null)
		 */

	}

	public static void main(String[] args) {
		TestReturnStat t = new TestReturnStat();
		t.Test();
	}
}
