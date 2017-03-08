/**
 * Driver class
 */
class PetStore {
    
    public static void main(String[] args) {

         Dog lab = new Dog();

         /*
          Our dogs data fields are private so we 
          can't accidently or purposely change them
          
          lab.age = 128 // not valid

          */
    }
    
}
/**
 * Dog class
 */
class Dog {
    // set up class variables (data fields) 
    private String name;
    private String color;
    private int age;
    private double height;
    private boolean male;
}
