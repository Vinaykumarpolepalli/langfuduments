package com.langfund;

public class GlobalVariable1 {
	
	
	static int globalvar = 10;
	int globalvar1= 30;

	public static void main(String[] args) {
		GlobalVariable1 g = new GlobalVariable1();
		
		System.out.println("Global value in the calss level :"+globalvar);
		
		globalvar = 28;
		System.out.println("Global  value in the main menthod & udpating one :"+globalvar);
		System.out.println("global variable which is instance :"+g.globalvar1);

	}

}
