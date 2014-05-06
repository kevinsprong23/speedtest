package com.kevinsprong;

import org.apache.commons.math.linear.RealMatrix;

public class TimedMatrixMultiply {
	public static void matrixMultiply(RealMatrix A, RealMatrix B) {
		RealMatrix C = A.multiply(B);
	}
}
