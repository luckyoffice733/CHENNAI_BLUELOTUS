package com.training.text;

public class ExampleOnStringBuffer {
   public static void main(String[] args) {
	   StringBuffer sb  = new StringBuffer();
	   
	   System.out.println("default capacity : "+sb.capacity());
	   System.out.println("From St is : "+sb);
	   
	   sb.append("have a break and taste the tunder");
	   
	   System.out.println(sb);
	   //System.out.println("default capacity : "+sb.capacity());
	   
	   StringBuffer sb1 = new StringBuffer("hello world");
	   System.out.println("sb1 is : "+sb1);
	   
	   sb1.insert(5,',');
	   System.out.println("after insert at specifice index position");
	   System.out.println(sb1);//hello, world
	   
	   System.out.println("reverse of string : "+sb1.reverse());
	   
	   StringBuffer sb2 = new StringBuffer("Hello World Welcome");
	   System.out.println("before  : "+sb2);
	   sb2.setCharAt(11,',');
	   System.out.println("after replace a character at specific index : "+sb2);
	   
	   
	   StringBuffer sb3= new StringBuffer("Boost is the scret of my enery");
	   System.out.println("before delete characters : "+sb3);
	   
	   sb3.delete(13,18);
	   System.out.println("After delete characters : "+sb3);
	   
	   String st =new String(sb3);
	   
	   String st2 = new String("hello");
	   
	   //convert into StringBuffer
	   
	   StringBuffer sb4 = new StringBuffer(st2);
	   
	   
	   
	   
	   
	   
	   
}
}
