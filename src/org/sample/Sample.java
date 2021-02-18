package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;

public class Sample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\MuzamilFolder\\InnerFolder\\newfile.txt");
		boolean mkdir = f.mkdir();
		System.out.println("Main Folder : " + mkdir);
		
		boolean mkdirs = f.mkdirs();
		System.out.println("Inner Folder : "+ mkdirs);
		
		boolean createNewFile = f.createNewFile();
		System.out.println("File : "+ createNewFile);
		
		boolean canWrite = f.canWrite();
		System.out.println("Can Write : "+ canWrite);
		
		boolean canRead = f.canRead();
		System.out.println("Can Read : "+canRead);
		
		boolean canExecute = f.canExecute();
		System.out.println("Can Execute"+canExecute);
		
		FileUtils.write(f, "Hi im Muzamil");
		
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		
		String readFileToString = FileUtils.readFileToString(f);
		System.out.println(readFileToString);
		
		String s ="\t" + "Selenium Tester";
		
		FileUtils.write(f, s, true);
		
		String[] list = f.list();
		for (String strg : list) {
			System.out.println(strg);
			
		}
		
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
		}
		
	}
}
