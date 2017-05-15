package com.kan.enumLearning;

public enum CurrencyEnum {
  // PENNY, NICKLE, DIME, QUARTER
  // But for this to work you need to define a member variable and a constructor
  // because PENNY (1) is actually calling a constructor which accepts int value
  
  PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
  private int value;

  private CurrencyEnum(int value)
  {
    this.value = value;
  }
}
