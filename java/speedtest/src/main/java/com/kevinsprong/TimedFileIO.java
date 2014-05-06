package com.kevinsprong;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TimedFileIO {
	public static void fileIO(String filePathIn) {
		BufferedReader fileIn = null;
		try {
			fileIn = new BufferedReader(
					new FileReader(new File(filePathIn)));
			String line;
			String thisLine;
			while ((line = fileIn.readLine()) != null) {
				thisLine = line;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
