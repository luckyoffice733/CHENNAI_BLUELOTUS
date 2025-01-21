package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnFileReader2 {
	
	public static void main(String[] args) {
		//try-with resources
		try(FileReader fr = new FileReader("C:\\Users\\sainath\\CG\\demoOnJava\\src\\simple.txt")){
			
			int ch = fr.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
