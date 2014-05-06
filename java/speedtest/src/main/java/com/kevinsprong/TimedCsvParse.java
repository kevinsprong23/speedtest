package com.kevinsprong;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TimedCsvParse {
	public static void csvParse(String filePathIn) {
		BufferedReader fileIn = null;
		try {
			fileIn = new BufferedReader(
					new FileReader(new File(filePathIn)));
			String line;
			double fifthNumber;
			while ((line = fileIn.readLine()) != null) {
				fifthNumber = Double.parseDouble(line.trim().split(",")[4]);
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
