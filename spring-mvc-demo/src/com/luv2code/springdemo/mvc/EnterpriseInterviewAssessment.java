package com.luv2code.springdemo.mvc;



	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	// Uncomment below classes to send network request if needed.
	// import java.net.HttpURLConnection;
	// import java.net.URL;

	public class EnterpriseInterviewAssessment {
	    public static void main(String args[] ) throws Exception {
	        String inputData = "1 \n 2 \n 3 \n 4 \n 5 \n 6 \n 7 \n 8 \n 9 \n 10 \n 16 \n 25";
	   /*     String thisLine = null;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while ((thisLine = br.readLine()) != null) {
	            inputData += thisLine + "\n";
	        }
	        
	   */
	        // Output the solution to the console
	        codeHere(inputData);
	    }
	    
	    
	    public static String codeHere(String inputData) throws NullPointerException {
	        // Use this function to write your solution;
	        int length = 0;
	        int lastDeleted = 0;
	        boolean deleted = false;
	        
	        String[] str = null;
	        ArrayList<Integer> data2 = new ArrayList<Integer>();
	        
		    str = inputData.split(" \n ");
	        
	        for (String s : str){
	            int num = 0;
	            num = Integer.valueOf(s);
	                if (Math.sqrt(num) == Math.round(Math.sqrt(num))) {
	                    lastDeleted = num;
	                    deleted = true;
	                } else {
	                    data2.add(Integer.parseInt(s));
	                }
	                length = data2.size();
	        }
	        
	        for(Integer d : data2 ){
	        System.out.println(d);
	        }
	        
	        System.out.println();
	        System.out.println(length);
	        
	        if (deleted) {
	            System.out.println(lastDeleted);
	        } 
	        
	        return data2.toString();
	        
	    }
}
	

