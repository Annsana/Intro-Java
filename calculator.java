//Creating a public class
public class Calculator{

  //Creating a constructor
  public Calculator(){

  }

  //Creating a public method
  public int add(int a, int b){
     return a+b; 
  }
  public int subtract(int a, int b){
    return a-b;
  }
  public int multiply(int a , int b){
    return a*b;
  }
  public int divide(int a, int b){
    return a/b;
  }
  public int modulo(int a, int b){
    return a%b;
  }

  //Creating a main() method
  public static void main(String[] args){
    
    //Creating a Calculator object 
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(10,5));
    System.out.println(myCalculator.modulo(10,7));

  }
}
