package com.training.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOnPrintWriter {

	public static void main(String[] args) {
		//try with resources
		try(FileWriter fw= new FileWriter("C:\\Users\\sainath\\CG\\demoOnJava\\src\\temp.txt");
			PrintWriter pw = new PrintWriter(fw)){
			
			pw.println("weclome to java");//string
			pw.println(100); //Integer
			pw.write(100);//d
			pw.println("");
			pw.println(true);//boolean
			char ch[] = {'a','e','i','o','u'};
		     pw.print(ch);
		
            pw.flush();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
		
		
	}
}
