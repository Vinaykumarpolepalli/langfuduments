package com.langfund;

public class DataTypes2 {
	byte b ;
	short s ;
	int i ;
	long l ;
	
	float f;
	double d;
	
	char c;
	boolean b1;
	
	
	

	public static void main(String[] args) {
		DataTypes2 d = new DataTypes2();
        System.out.println("byte default value:"+ d.b);
        System.out.println("short default value:"+ d.s);
        System.out.println("int default value:"+ d.i);
        System.out.println("long default value:"+ d.l);
        
        System.out.println("float default value:"+ d.f);
        System.out.println("double default value:"+ d.d);

        
        System.out.println("char default value:"+ d.c);
        System.out.println("boolean default value:"+ d.b1);
	}

}
