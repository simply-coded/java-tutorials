import java.util.Random;


/**
 * CLASS: driver
 */
class PetStore implements Store, Tax {
    //
    public static void main(String[] args) {
        
        Dog lab = new Dog("Brown", 3, true);
        Dog pit = new Dog("Black", 2.5, false);
        Dog dane = new Dog("White", 4.2, true);

        Cat scar = new Cat("Yellow", 1, true);
        Cat milk = new Cat("Spotted", 0.6, false);  

        System.out.println("Tax rate is " + taxRate);
        System.out.printf("Cost with tax of a $4.32 item is $%.2f", Tax.applyTax(4.32) );

    }
    //
    @Override
    public Object buy(double cost) {
        return null;
    }
    //
    @Override
    public double sell(Object item) {
        return 0.0;
    }
    //
    @Override
    public double price(Object item) {
        return 0.0;
    }    
    //
    @Override
    public Object trade(Object item) {
        if (item instanceof Dog) {
            return new Dog();
        }
        else if (item instanceof Cat) {
            return new Cat();
        }
        else {
            System.out.println("Item not tradable");
            return item;
        }
    }
}



/**
 * INTERFACE
 */
interface Store extends Tax {
    Object buy(double cost);
    double sell(Object item);
    double price(Object item);

    default Object trade(Object item) {
        return new Object();
    }
}



/**
 * INTERFACE
 */
interface Tax {
    double taxRate = 0.08;
    
    static double applyTax(double price) {    
        return (price * taxRate) + price;    
    }
}



/**
 * CLASS
 */
abstract class Mammal {   
    // 
    private static int numberOfMammals;
    private String name, color;    
    private int age, health;
    private double height, maxHeight;
    private boolean male;
    // 
    // constructors
    //
    public Mammal() {
        name = "";
        color = "";
        age = 0;
        health = 100;
        height = 0.5;
        maxHeight = 2;
        male = true;
        numberOfMammals++;
    }
    //
    public Mammal(String n, String c, double mH, boolean g) {
        name = n;
        color = c;
        age = 0; 
        health = 100;
        height = 0.5;
        maxHeight = mH;
        male = g;
        numberOfMammals++;
    }
    //
    // setters
    //
    public void setName(String n) {
        name = n;
    }
    //
    public void setColor(String c) {
        color = c;
    }
    //
    public void setGender(boolean g) {
        male = g;
    }
    //
    public void setMaxHeight(double mH) {
        maxHeight = mH;
    }
    //
    public void setHealth(int h) {
        health = h;
    }
    //
    // getters
    //
    public String getName() {
        return name;
    }
    //
    public String getColor() {
        return color;
    }
    //
    public double getHeight() {
        return height;
    }
    //
    public double getMaxHeight() {
        return maxHeight;
    }
    //
    public int getAge() {               
        return age;
    }
    //
    public boolean getGender() {
        return male;
    }
    // 
    public int getHealth() {
        return health;
    }
    //
    public int getNumberOfMammals() {
        return numberOfMammals;
    }
    // 
    // methods
    //
    public void birthday() {
        if (isDead()) {
            return;
        }        
        age++;
        
        if (height < maxHeight) {
            height += 0.8;
        }
        if (age >= 15) {
            health -= rndRange(15,20);
        }
        if (health < 0) {
            health = 0;
        }
    }
    //
    public boolean isDead() {
        return (health == 0);        
    }
    //
    public void attacks(Mammal m) {
        int damage = rndRange(1,10);
        m.setHealth(m.getHealth() - damage);
        System.out.printf("%s inflicted %d damage on %s",name,damage,m.getName());
    }
    //
    public String toString() {
        return String.format(
            "Name: %s, Color: %s, Age: %d, Health: %d, Height: %.2f, Max-Height: %.2f, Gender: %s \n"
            ,name, color, age, health, height, maxHeight, (male ? "Male" : "Female")
        );
    }    
    //
    // tools
    //
    private int rndRange(int start, int finish) {
        return (
            new Random().nextInt(finish + 1 - start) + start
        );
    }    
    //
    // abstract 
    //
    public abstract Mammal breed(Mammal m);
    //
}



/**
 * CLASS
 */
class Dog extends Mammal {    
    //
    // constructors
    //
    public Dog() {
        super();        
    }
    //
    public Dog(String c, double mH, boolean g) {
        super("Dogger", c, mH, g);
    }
    //
    // methods
    //
    @Override
    public void attacks(Mammal m) {
        int damage = rndRange(5,20);
        m.setHealth(m.getHealth() - damage);
        System.out.printf("%s inflicted %d damage on %s\n",getName(), damage, m.getName());
    }
    //
    @Override
    public Dog breed(Mammal m) {
        if (getGender() ^ m.getGender() && m instanceof Dog) {
            
            // create color for baby
            String tempC;
            switch(rndRange(1,3)) {
                case 1:
                    tempC = getColor();
                    break;
                case 2:
                    tempC = m.getColor();
                    break;
                default:
                    tempC = getColor() + " & " + m.getColor();
                    break;
            }
            // set height of baby
            double tempH = (getMaxHeight() + m.getMaxHeight()) / 2;
            
            // set gender of baby
            boolean tempG;
            switch(rndRange(0,1)) {
                case 0:
                    tempG = false;
                    break;
                default:
                    tempG = true;
                    break;
            }
            // return the new created baby
            return new Dog(tempC, tempH, tempG);
        }        
        else {
            // genders weren't compatible
            return null;
        }
    }
    //
    // tools
    //
    private int rndRange(int start, int finish) {
        return (
            new Random().nextInt(finish + 1 - start) + start
        );
    }
    //
}



/**
 * CLASS
 */
class Cat extends Mammal {
    //
    // constructors
    //
    public Cat() {
        super();
    }
    //
    public Cat(String c, double mH, boolean g) {
        super("Catter", c, mH, g);
    }
    //
    // methods
    //
    @Override
    public Cat breed(Mammal m) {
        if (getGender() ^ m.getGender() && m instanceof Cat) {
            
            // create color for baby
            String tempC;
            switch(rndRange(1,3)) {
                case 1:
                    tempC = getColor();
                    break;
                case 2:
                    tempC = m.getColor();
                    break;
                default:
                    tempC = getColor() + " & " + m.getColor();
                    break;
            }
            // set height of baby
            double tempH = (getMaxHeight() + m.getMaxHeight()) / 2;
            
            // set gender of baby
            boolean tempG;
            switch(rndRange(0,1)) {
                case 0:
                    tempG = false;
                    break;
                default:
                    tempG = true;
                    break;
            }
            // return the new created baby
            return new Cat(tempC, tempH, tempG);
        }        
        else {
            // genders weren't compatible
            return null;
        }
    }
    //
    // tools
    //
    private int rndRange(int start, int finish) {
        return (
            new Random().nextInt(finish + 1 - start) + start
        );
    }
    //
}
