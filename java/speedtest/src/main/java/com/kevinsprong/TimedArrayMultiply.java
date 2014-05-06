package com.kevinsprong;

import org.apache.commons.math.linear.RealMatrix;

public class TimedArrayMultiply {
	public static void arrayMultiply(RealMatrix A, RealMatrix B) {
		int nrows = A.getRowDimension();
		int ncols = A.getColumnDimension();
		
		double[][] C = new double[nrows][ncols];
		for (int i = 0; i < nrows; i++) {
			for (int j = 0; j < nrows; j++) {
				C[i][j] = A.getEntry(i, j) * B.getEntry(i, j);
			}
		}
	}
}
