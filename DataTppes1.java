package com.langfund;

public class DataTppes1 {
	byte b = -127;

	short s =32767;
	int i =  2147483647;
	int i2 = 'a';
	long l = 9223372036854775807l;
	
	
	float f = 598.765428792f;
	double b1 = 922.337203685477580987654347d;
	float f1 =  213.434567890f;
	float f2 = 324.85925908109585838933909402904950093f;
	float f3 = 'a';
	float f4 =10;
	
	
    double bo2  = 77329758904329876678908973654567890873456789098765434567898765434567898765433455555678900983234567890987654345678999999999876543456788d;
	
    
    char c  = 'v';
	char c1 = 65;
	char c2 =63;
	char c3 ='5';
	char c4 = '\u0040';
	
	boolean b2 = true;
	//boolean b3 = 'flase';
	//boolean b4 = FALSE;
	String  st = "vinay";
	String st1 = "kumar";
	
	
	int i1 = 'h';
	
	
	
	public static void main(String[] args) {
		
		
		DataTppes1 d = new  DataTppes1();
		
		System.out.println( "range of bytes :"+d.b);
		System.out.println("range of short :"+d.s);
		System.out.println("range of int :"+d.i);
		System.out.println("range of int :"+d.i2);
		
		System.out.println("range of long : "+d.l);
		
		
		
		System.out.println("range of float;"+d.f);
		System.out.println("range of double:"+d.b1);
		
		
		
		System.out.println( "char letter:"+d.c);
		System.out.println("char letter :"+d.c1);
		System.out.println("char letter :"+d.c2);
		System.out.println("char letter :"+d.c3);
		System.out.println("char letter :"+d.c4);
		
		System.out.println("boolean :"+d.b2);

		
		System.out.println("float of range :"+d.f1);
		System.out.println("float of range :"+d.f2);
		System.out.println("float of range :"+d.f3);
		System.out.println("float of range :"+d.f4);
		
		System.out.println("double of range :"+ d.bo2);
		
		System.out.println("string letter of st : "+d.st);
		System.out.println("string letter of st1 : "+d.st1); 
		
		System.out.println("intger range of :"+d.i1);
	}

}
