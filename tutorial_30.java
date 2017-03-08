/**
 * Driver class
 */
class PetStore {
    
    public static void main(String[] args) {

         // create an instance of our Dog class using our three different constructors
         Dog lab1 = new Dog();
         Dog lab2 = new Dog("Mike", "brown", true);
         Dog lab3 = new Dog("Barker");
                  
    }
    
}
/**
 * Dog class
 */
class Dog {    
    private String name;
    private String color;
    private int age;
    private double height;
    private boolean male;

    // by default constructor will set everything to null, 0, or false
    public Dog() {
        name = "";
        color = "";
        age = 0;
        height = 0.5;
        male = true;
    }

    public Dog(String n, String c, boolean g) {
        name = n;
        color = c;
        age = 0; // optional because it will automatically set primitive data types to zero
        height = 0.5;
        male = g;
    }

    public Dog(String name) {
        /* need to specify which variable is from your class 
           and which one is the argument using the 'this' keyword
        */
        this.name = name;
    }

}
