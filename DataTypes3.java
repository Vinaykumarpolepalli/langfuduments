package com.langfund;

public class DataTypes3 {
	
byte b ;
short s;
int i ;
long l ;

float f;
double d ;

char c ;
boolean b1 ;


	public static void main(String[] args) {
		DataTypes3 d = new DataTypes3();
		d.demo();
		
		

	}

	public void demo() {
		System.out.println("range of byte:"+ b);
		System.out.println("range of short :"+ s);
	    System.out.println("range of intger:"+ i);
	    System.out.println("range of long:"+ l);
	    
	    System.out.println("range of float:"+ f);
	    System.out.println("range of double :"+ d);
	    
	    System.out.println("range of char:"+ c);
	    
	    System.out.println("range of boolen :"+ b1);
}
}
