package com.kan.fundamentals;

public class PassByReferenceConfusion
{
  public static void main(String args[]) {
    Car car1 = new Car("BMW");
    System.out.println("Brand of Car Inside main() before: " + car1.brand);
    printBrand(car1);
    System.out.println("Brand of Car Inside main() after printBrand: " + car1.brand);
    printBrandAgaian(car1);
    System.out.println("Brand of Car Inside main() after printBrandAgain: " + car1.brand);
    }

    public static void printBrand(Car car2) {
    car2.brand = "Maruti";
    System.out.println("Brand of Car Inside printBrand(): " + car2.brand);
    }

    public static void printBrandAgaian(Car car3) {
    car3 = new Car("Mercdes");
    System.out.println("Brand of Car Inside printBrandAgain(): " + car3.brand);
    }
    
    private static class Car{
      private String brand;
   
      public Car(String brand){
          this.brand = brand;
      }

  }

    
}
