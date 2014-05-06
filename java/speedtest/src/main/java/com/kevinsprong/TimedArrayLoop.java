package com.kevinsprong;

public class TimedArrayLoop {
	public static void ArrayLoop() {
		// make an array
		int[] x = new int[10000000];
		for (int i = 0; i < 10000000; i++) {
			x[i] = 1; // java.util.Arrays.fill uses a loop internally anyways
		}
		
		// loop and multiply each element by 2
		@SuppressWarnings("unused")
		int y;
		for(int el : x) {
			y = el * 2;
		}
	}
}
