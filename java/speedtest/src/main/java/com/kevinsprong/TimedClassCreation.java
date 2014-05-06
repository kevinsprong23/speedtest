package com.kevinsprong;

public class TimedClassCreation {
	public static void classCreation() {
		// make a class
		for (int i = 0; i < 10000; i++) {
			BlankClass bc = new BlankClass();
		}
	}
}
