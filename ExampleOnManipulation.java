package com.training.text;

public class ExampleOnManipulation {

	public static void main(String[] args) {
		String s = new String("hello world");
		System.out.println(s);
	
		s = s.concat(" welcome");
		System.out.println("After concate :  "+s);
		
		s = s+" to String";
		System.out.println("Concat using + : "+s);
		           //0123456789 
       String  s1 = "ramu is GooD Boy";//
       System.out.println("convert into upperCase :  "+s1.toUpperCase());
       System.out.println("convert into upperCase :  "+s1.toLowerCase());
		
       //String substring(int index);
       String partString = s1.substring(8);
       System.out.println("Part of a string is : "+partString);
		
     //String substring(int startindex,int endindex); //start index --inclusive,endIndex-exclusive
       String partString2 = s1.substring(8,12);
       System.out.println("part of String using start and end Index is : "+partString2);
       
       // String s3="reveerse"
       //O/p:- r1e1v1e2r1s1e1 --> occureance/repeating/frequencey of character
      
       //char charAt(int index)
       String s3 = "Hadoop is framework";
      char ch= s3.charAt(10);
       System.out.println("fetch the character at specific index position : "+ch);
       
       char ch1[] = {'c','p','g'};
       String st = new String(ch1);// converting individual character into sequence of characters
       System.out.println("After convert into String: "+st);
       
       String wel = "welcome";//sequence of characters
       char ch3[]=wel.toCharArray();//converted into individual character
       System.out.println("After coverting into char array");
       for(char c: ch3) {
    	   System.out.println(c);
       }
       //String[] split(delimiter)
       String st1 = new String("Say Bye Bye to 2024 And Welcome to New Year 2025");
       String spt[]= st1.split(" ");
       System.out.println("After convert line into word(Token)");
       for(String token:spt) {
    	   System.out.println(token);
       }
       System.out.println("After split the line using delimiter #");
       String st2 = "Hadoop#is#framework#to#process#huge#amount#of#data";
      String spt1[]= st2.split("#");
      for(String token:spt1) {
   	   System.out.println(token);
      }
      
      String string = new String("The ramesh suresh ramesh eat five star do nothing....");
      System.out.println("replace r character with s "+string.replace('r','s'));
      System.out.println("replace r character with s at First occurance");
      System.out.println(string.replaceFirst("r","s"));
       
       
      String ts = "ramesh suresh";
     int firstOcccurance= ts.indexOf('s'); //indexOf() will return index position of a character
     System.out.println("index of a character 's' is :"+firstOcccurance);
     
     String ste="";
     String ste1=null;
     System.out.println(ste.isBlank());//true
     System.out.println(ste.isEmpty());//false
     System.out.println("length of the string");
     System.out.println(ste.length());
    
     String m="hello ravi is";
     
     System.out.println("search is : "+m.contains("ra"));//true
      
     String m1="ramu";
     String m2="Ramu";
     System.out.println(m1.equals(m2));//false
     System.out.println(m1.equalsIgnoreCase(m2));//true
     
     String m3="      HelloHi       ";
     System.out.println("Spaces exist in string ? :"+m3.trim());
     System.out.println(" remove the space at end :"+m3.stripTrailing());
     System.out.println(" remove the space at start :"+m3.stripLeading());
      
     
     String sc1="SACHIN";
     String sc2="SAURAV";
     System.out.println(sc2.compareTo(sc1));
     
     String sc3="SAURAV";
     String sc4="SACHIN";
     System.out.println(sc3.compareTo(sc4));
       
     System.out.println("hello \n ramu raju ramesh suresh manish");  
       
     String regex="[0-9]{10}";
     
     System.out.println("8161490191".matches(regex));
       
     String es="8154141901";
     System.out.println(es.matches(regex));
       
       
     String regex1="j...s";
     System.out.println("javs".matches(regex1));
     
     String regex2="[ab]+";
     System.out.println("bb".matches(regex2));
       
       
	}
	
}
