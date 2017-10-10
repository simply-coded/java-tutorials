public class Driver {
  static int classVarResult;

  public static void main(String[] args) {
    // Using a class varaible. All methods can change this.
    add1(5, 3);
    System.out.println(classVarResult);

    // Returing a varaible from a method directly
    int methodVarResult = add2(23, 4);
    System.out.println(methodVarResult);

    // Doing so means I can use it inline with other code.
    System.out.println( "5 + 2 + 8 = " + (add2(5, 2) + 8) );

    // Returning different types
    System.out.println( divide(22, 4) );

    // Making a method that tests a condition
    if (isEven(5461 * 6)) {
      System.out.println("result is even");
    } else {
      System.out.println("result is odd");
    }
  }

  public static void add1(int n1, int n2) {
    classVarResult = n1 + n2;
  }

  public static int add2(int n1, int n2) {
    int result = n1 + n2;
    return result;
  }

  public static double divide(double n1, double n2) {
    return n1 / n2;
  }

  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      // if this happens it will exit out of the method. return false will not happen
      return true; 
    }
    return false;        
  }
}
