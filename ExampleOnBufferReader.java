package com.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnBufferReader {

	public static void main(String[] args) {
		//try-with resources
		try(FileReader fr = new FileReader("C:\\Users\\sainath\\CG\\demoOnJava\\src\\simple.txt");
			BufferedReader br = new BufferedReader(fr);	
				){
			  
			System.out.println("Reading line by line");
			String line =br.readLine();//it will return first line
			while(line!=null) {
				System.out.println(line);
				line=br.readLine(); //next line ......
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
