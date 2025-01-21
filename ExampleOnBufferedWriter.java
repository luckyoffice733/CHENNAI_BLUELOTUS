package com.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnBufferedWriter {

	public static void main(String[] args) {
		//try with resources
		try(FileWriter fw= new FileWriter("C:\\Users\\sainath\\CG\\demoOnJava\\src\\tempBuffer.txt");
			 BufferedWriter bw = new BufferedWriter(fw);//it will take agrument of FileWriter.
				){
         bw.write(100);//d
		 bw.newLine();	
		 bw.write("hello");//hello
		 bw.newLine();
		 char ch[]= {'a','e','i','o','u'};
		 bw.write(ch);//aeiou
		 bw.newLine();
		 bw.write("100");
		
	     bw.flush();		
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
