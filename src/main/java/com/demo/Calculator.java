package com.demo;

/**
 * Calculator
 *
 */
public class Calculator
{
	//Addition
    public int add(int a, int b){
		return a+b;
	}
    
    //Substraction
    public int sub(int a, int b){
		return a-b;
	}
    
    //Multiplication
    public int mul(int a, int b){
		return a * b;
	}
    
    //Division
    public int div(int a, int b){
    	int result = 0;
    	try {
    		result = a/b;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		return result;
	}

}
