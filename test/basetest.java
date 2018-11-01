package com.java.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class basetest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		File file = new File("scr/baseDir/testDir/subDir2/Shackelton.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * String name = "testDir/subDir2" + File.pathSeparator + "Shackelton.txt"; File
		 * f = new File(name); System.out.println("exists " + f.exists());
		 */
	}

}
