/* Create calculator. */

public class Calculator {
  public Calculator() {}
  public int add(int a, int b) {
    return a+b;
  }
  public int subtract(int a, int b) {
    return a-b;
  }
  public int multiply(int a, int b) {
    return a*b;
  }
  public int divide(int a, int b) {
    if (b != 0) {
      return a/b;
    }
    else {
      System.out.println("You cannot divide by 0.");
      return 0;
    }
    
  }
  public int modulo(int a, int b) {
    if (b != 0) {
      return a%b;
    }
    else {
      System.out.println("Division by 0 not allowed.");
      return 0;
    }
  }
  
  public static void main(String[] args) {
  
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45,11));

    
}
}



