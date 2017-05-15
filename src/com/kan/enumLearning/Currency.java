package com.kan.enumLearning;

import static com.kan.enumLearning.CurrencyDenom.*;

public class Currency {
  private int currency; //CurrencyDenom.PENNY,CurrencyDenom.NICKLE,
                        // CurrencyDenom.DIME,CurrencyDenom.QUARTER
  
  public static void main(String a[]){
    System.out.println(DIME);
    
    CurrencyDenom cd = new CurrencyDenom();
    int x =cd.DIME ;
    x=33;
    
    System.out.println(x);
    
    CurrencyEnum ce = CurrencyEnum.DIME;
    
    ce = CurrencyEnum.NICKLE;
    //compilation error  

   // ce =44;  
  }
}


