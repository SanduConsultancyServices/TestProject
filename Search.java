/**
 * 
 */
package com.aop;

import java.util.ArrayList;
import java.util.List;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 hello
import java.io.BufferedReader;
import java.io.InputStreamReader;
new comments are getting added, this is the program to read the input from keybaod
*/
import java.util.Scanner;

class Search {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            //System.out.println("hello world");
        }
        */
		List l = new ArrayList();
		List targetList = new ArrayList();
        //System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the number of transaction :");
        int q = Integer.valueOf(scan.nextLine());
        //System.out.println(q +" ==Enter transaction amounts");
       
        String st = scan.nextLine();
        Scanner scanSt = new Scanner(st);
        while(scanSt.hasNext()){
        	l.add(scanSt.next());
        
        }
        
        //System.out.println("Please enter the target count");
        Scanner scanInt = new Scanner(System.in);
        int T= scanInt.nextInt();
        //System.out.println("Please enter"+ T +"amaounts");
        int temp = 0;
        //System.out.println("Please enter"+ T +"amaounts");
        while (true){
        	if (temp ==T)
        		break;
        	temp = temp+1;
        	scanInt = new Scanner(System.in);
        	targetList.add(scanInt.nextLine());
        	
        }
        
         for (int i =0; i<T;i++){
       	
            	  
            	  int target = Integer.valueOf((String) targetList.get(i));
     
      // 	System.out.println("target :"+target);
       	int tempTarget = 0;
       	for (int j=0; j<q; j++){
       		tempTarget =tempTarget +  Integer.valueOf((String)l.get(j));
       		if(tempTarget>=target){
       			System.out.println(  (j+1));
       			break;
       		}
       		
       	}
       }
        
    }
}
