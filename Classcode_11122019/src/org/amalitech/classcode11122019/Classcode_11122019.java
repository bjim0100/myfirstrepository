package org.amalitech.classcode11122019;

public class Classcode_11122019 {
     public static void main(String args[]) {
	    
    	 //1.Declaring an Integer
    	 int x;
    	 x = 2;
    	 int y;
    	 y = 7;
    	 System.out.println(x);

    	 System.out.println(x + y);
    	 
    	 String pre_stmnt = "x + y=";
    	 
    	 System.out.println(pre_stmnt + x + y);
    	 System.out.println(pre_stmnt+ (x + y));
    	 
    	 String eql = "=";
    	 
    	 System.out.println("x + y" + eql + " " );
    	 
    	 //Multiplication
    	 String pre_stmnt_multiply = "x * y " + eql;
    	 System.out.println(pre_stmnt_multiply + (x * y) );
    	 
    	 System.out.println("the above code has been reorganised");
    	 System.out.println(x + y + pre_stmnt);
    	 //Division
    	 String pre_stmnt_division = "x / y =";
    	 
    	 System.out.println(pre_stmnt_division + x / y);
    	 
    	 //Concatenation
    	 //Casting
    	 //double x + x; //this is illegal the variable
    	 // x has been used earlier
    	 double x_d = (double) x;
    	 double y_d = (double) y;
    	 System.out.println("x_d / y_d = "+ x_d/y_d);
    	 
    	 //using float(s)
    	 float x_f = (float)x;
    	 float y_f = (float)y;
    	 
    	 System.out.println("x_f / y_f =" + (x_f/y_f));
    	 int a = ++x;
    	 System.out.println("a : "+a);
    	 
    	 int b = x++;
    	 System.out.println("b : "+b);
    	
}
}
