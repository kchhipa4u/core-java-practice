/**
 * 
 */
package com.kan.enumLearning;

/**
 * @author kanhaiya.chhipa
 *
 */
public enum DaysEnum {
  
  MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
  
  int x ;
  private DaysEnum(int a){
    x =a;
  }
  
  public static void main(String a[]){
    System.out.println(DaysEnum.FRIDAY);
    System.out.println(DaysEnum.FRIDAY.ordinal());
    
    DaysEnum[] de = DaysEnum.values();
    
    for (DaysEnum daysEnum : de)
    {
      System.out.println(daysEnum.name());
    }
  }
}
