package com.kevinsprong;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;

public class RunTests {
    public static void main( String[] args ) {
    	
    	// eww, a hard-coded absolute path
    	String dataDir = "C:/Users/ksprong/Documents/Personal/speedtest/data/";
    	
    	//---------------------------------------------------------------------
        // run an array loop and time it
    	double[] timeElapsed = new double[10];
    	long tSt;
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedArrayLoop.ArrayLoop();
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	FileWriter results = null;
    	try {
			results = new FileWriter(new File("results/arrayLoop.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	
    	//---------------------------------------------------------------------
    	// read in a file and time it
    	timeElapsed = new double[10];
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedFileIO.fileIO(dataDir + "longtext.txt");
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	results = null;
    	try {
			results = new FileWriter(new File("results/fileIO.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	
    	//---------------------------------------------------------------------
    	// parse a csv and time it
    	timeElapsed = new double[10];
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedCsvParse.csvParse(dataDir + "longcsv.csv");
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	results = null;
    	try {
			results = new FileWriter(new File("results/csvParse.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	
    	//---------------------------------------------------------------------
    	// array multiply a large Matrix
    	double[][] A = new double[1000][1000];
    	for (int i = 0; i < 1000; i++) {
    		for (int j = 0; j < 1000; j++) {
    			A[i][j] = 2;
    		}
    	}
    	RealMatrix Am = new BlockRealMatrix(A);
    	
    	double[][] B = new double[1000][1000];
    	for (int i = 0; i < 1000; i++) {
    		for (int j = 0; j < 1000; j++) {
    			B[i][j] = 3;
    		}
    	}
    	RealMatrix Bm = new BlockRealMatrix(B);
    	
    	timeElapsed = new double[10];
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedArrayMultiply.arrayMultiply(Am, Bm);
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	results = null;
    	try {
			results = new FileWriter(new File("results/arrayMultiply.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	
    	//---------------------------------------------------------------------
    	// matrix multiply a large Matrix
    	timeElapsed = new double[10];
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedMatrixMultiply.matrixMultiply(Am, Bm);
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	results = null;
    	try {
			results = new FileWriter(new File("results/matrixMultiply.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	
    	//---------------------------------------------------------------------
        // make a bunch of blank classes and time it
    	timeElapsed = new double[10];
    	for (int i = 0; i < 10; i++) {
    		tSt = System.nanoTime();
    		TimedClassCreation.classCreation();
    		timeElapsed[i] = ((double) (System.nanoTime() - tSt)) / 1e9; // sec
    	}
    	
    	// write it out
    	results = null;
    	try {
			results = new FileWriter(new File("results/classTest.csv"));
			for (double t : timeElapsed) {
				results.write(Double.toString(t) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				results.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	System.out.println("Done");
    }
}
