package com.langfund;

public class TypesVariables1 {
	
	int no = 1;
	String name= "vinay";
    
	
	static int id  =  4238;
	static String  idcard = "polepalli";
	
	
//	 TypesVariables1 (int a ){
//		System.out.println("this is frist consture");
//	
//			 
//		}
//	
//	 TypesVariables1(String name){
//		 System.out.println("this is the second consture");
//	
//	}
	
	public static void main(String[] args) {
	 TypesVariables1 t = new TypesVariables1();
	 
     int id = 100;
     String idcard = "police";
     
     System.out.println(id);
     System.out.println(idcard);
     
     System.out.println( TypesVariables1.id);
     System.out.println(TypesVariables1.idcard);
     
    // System.out.println(t.id);
     //System.out.println(t.idcard);
     
    
     
     System.out.println(t.no);
     System.out.println(t.name);
     
     
     
	}

//	void main1 () {
//		                  //In other method we can't access local variables 
//        System.out.println(id);
//      System.out.println(idcard);
//	}
}
