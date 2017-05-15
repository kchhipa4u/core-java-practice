package com.kan.fundamentals;

public class JavaCast {
    public static void main(String... args) {
         
        Integer integer = new Integer(10);
        Float floatt = new Float(20F);
        
        int i=10;
        float f = 10f;
        
        //i = f;  // compiler error type mismatch
        i= (int) f;
 
        //this is not a cast - error
         //integer = floatt; //compiler error - incompatible types
         //integer = (Integer) floatt;//compiler error - inconvertible types
         
        //upcast - widening conversion
        Object obj = integer; //no explicit cast required
        System.out.println(obj);
 
        //downcast - narrowing conversion
        Integer in = (Integer)obj;//only subtype
        System.out.println(in);
 
        //downcast - Object to String
        //runtime issue - instance Object is not of String
        String str = (String)obj;//ClassCastException
    }
}
