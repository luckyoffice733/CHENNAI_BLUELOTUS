package com.training.io;

import java.io.FileReader;
import java.io.IOException;

public class ExampleOnFileReader1 {
	
	public static void main(String[] args) {
		FileReader fr=null; //creating file object
		try{
			fr = new FileReader("C:\\Users\\sainath\\CG\\demoOnJava\\src\\simple.txt");
			
			int ch = fr.read();//it will return first character from the file
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=fr.read(); //increment for next character.......
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}finally {
			try {
				fr.close(); //closing file reader object
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
