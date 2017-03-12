import java.util.Random;

/**
 * Driver class
 */
class PetStore {

    public static void main(String[] args) {
         
        Dog lab = new Dog("Brown", 3, true);
        Dog pit = new Dog("Black", 2.5, false);
        Dog dane = new Dog("White", 4.2, true);

        lab.setName("Barker");
        pit.setName("Whiskey");
        dane.setName("Spider");

        // breed() returns a Mammal so we have to store it as such.
        // we'll deal with this shortcoming in the next video
        Mammal labPit = lab.breed(pit);
        
    }
        
}
/**
 * Mammal class
 */
class Mammal {    
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
        m.setHealth(m.getHealth() - rndRange(1,10));
    }
    //
    public String toString() {
        return String.format(
            "Name: %s, Color: %s, Age: %d, Health: %d, Height: %.2f, Max-Height: %.2f, Gender: %s \n"
            ,name, color, age, health, height, maxHeight, (male ? "Male" : "Female")
        );
    }
    //
    public Mammal breed(Mammal m) {
        if (this.male ^ m.getGender()) {
            
            // create color for baby
            String tempC;
            switch(rndRange(1,3)) {
                case 1:
                    tempC = this.color;
                    break;
                case 2:
                    tempC = m.getColor();
                    break;
                default:
                    tempC = this.color + " & " + m.getColor();
                    break;
            }
            // set height of baby
            double tempH = (this.maxHeight + m.getMaxHeight()) / 2;
            
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
            return new Mammal("", tempC, tempH, tempG);
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
 * Dog class
 */
class Dog extends Mammal {

    public Dog() {
        super();
    }

    public Dog(String c, double mH, boolean g) {
        super("Dogger", c, mH, g);
    }

}

/**
 * Cat class
 */
class Cat extends Mammal {
    public Cat() {
        super();
    }

    public Cat(String c, double mH, boolean g) {
        super("Catter", c, mH, g);
    }
}
