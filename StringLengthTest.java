//package com.test;

import java.util.*;

public class StringLengthTest {
	
	  /**
	    Design and implement a program that creates an exception class called StringTooLongException, designed to be thrown when a string is discovered that has too many characters in it.
In the main client class of the program, read strings from the user until the user enters "DONE".
If a string that has too many characters (more than 10) is entered, throw the StringTooLongException.
Handle the exception by printing an appropriate message, and then continue processing more strings.	    
	  */
     public static void main(String[] args) {
    	 
    	 Scanner input = new Scanner(System.in);
    	 String inputString="";
    	 int i=0;
    	 boolean inputMoreString=true;
    	 while(inputMoreString  || i>100)
    	 {
    		 i++;
    		 inputString="";
    		 System.out.println("Please enter String");
    		 inputString = input.nextLine();
    		 if(inputString!=null && inputString.equalsIgnoreCase("DONE")){    			 
    			 inputMoreString=false;
    			 System.out.println("We are done and exiting the Program");
    		 }
    		 try{
    			 boolean isValidString = validStringLength(inputString);    			 
    		 }catch(StringTooLongException e){
    			 System.out.println(e.getMessage());
    		 }
    	 }    	 
    	   
     }
     
     public static boolean validStringLength( String validStringInput ) throws StringTooLongException{
    	 if(validStringInput!=null && validStringInput.trim().length()>10){
    		 throw new StringTooLongException("String '"+validStringInput+ "' length is "+validStringInput.trim().length()+ " which is greater than 10.");
		 } 
    	 return true;
     }
}