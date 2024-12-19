package com.langfund;

public  class AccessModifier1 {
	
	protected static int  a = 12;
	public final String names  = "vinay";
			

	public static void main(String[] args) {
		AccessModifier1 am = new AccessModifier1();
	
		System.out.println(a);
	    System.out.println(am.names);

	}

}
