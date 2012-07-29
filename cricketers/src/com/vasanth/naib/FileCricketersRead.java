package com.vasanth.naib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCricketersRead {

	/**
	 * @param args
	 */

 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\Users\\i068090\\Desktop\\separate.html"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}
