public class Driver {
  
  public static void main(String[] args) {
    System.out.println(greeting());
    System.out.println(greeting("Jeremy"));
    if (greeting("Hannah", 12)) {
      System.out.println(", please show me your parents permission slip.");
    }    
  }

  public static String greeting() {
    return "Hello, and welcome to my app.";
  }

  public static String greeting(String name) {
    return "Hello " + name + ", welcome to my app.";
  }

  /* 
    This one has the same signiture as the method above and thus cannot be used.
    signiture = method name & parameter amount and type.
  public static void greeting(String fullName) {
    System.out.println("Hello " + name + ", welcome to my app.");
  }
  */

  public static boolean greeting(String name, int age) {
    System.out.print("Hello " + name);
    
    // Are they under 18
    if (0 < age && age < 18) {
      return true;
    } else {
      return false;
    }
  }
}
