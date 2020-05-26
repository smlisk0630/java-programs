public class Calculator {
  public Calculator() {

  }

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    //This method saves the results to a variable then prints the variable//
    int addition = myCalculator.add(5,7);
    System.out.println(addition);
    //This method prints the results directly//
    System.out.println(myCalculator.subtract(45,11));
    //Both methods are correct//
    int multiplication = myCalculator.multiply(12,12);
    System.out.println(multiplication);
    System.out.println(myCalculator.divide(8,4));
  }
}