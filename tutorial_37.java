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

        Dog labPit = lab.breed(pit);

        // All return the same value because the variable is a part of the class, not the instances.
        /*
            // This only works if numberOfDogs is public and static
            System.out.println( Dog.numberOfDogs );
        
            // These only work if numberOfDogs is public, and only return the same value if it is static as well          
            System.out.println( lab.numberOfDogs );
            System.out.println( pit.numberOfDogs );
            System.out.println( dane.numberOfDogs );
            System.out.println( labPit.numberOfDogs );
        
            // This doesn't work because we are trying to call this non-static method in a static way.
            // Changing getNumberOfDogs() to static method would allow this to work.
            System.out.println( Dog.getNumberOfDogs() );
        */

        System.out.println( lab.getNumberOfDogs() );
        System.out.println( pit.getNumberOfDogs() );
        System.out.println( dane.getNumberOfDogs() );
        System.out.println( labPit.getNumberOfDogs() );

    }
        
}
/**
 * Dog class
 */
class Dog {    
    private static int numberOfDogs;
    private String name, color;    
    private int age, health;
    private double height, maxHeight;
    private boolean male;
    // 
    // constructors
    //
    public Dog() {
        name = "";
        color = "";
        age = 0;
        health = 100;
        height = 0.5;
        maxHeight = 2;
        male = true;
        numberOfDogs++;
    }
    //
    public Dog(String c, double mH, boolean g) {
        name = "";
        color = c;
        age = 0; 
        health = 100;
        height = 0.5;
        maxHeight = mH;
        male = g;
        numberOfDogs++;
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
    public int getNumberOfDogs() {
        return numberOfDogs;
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
    public void attacks(Dog d) {
        d.setHealth(d.getHealth() - rndRange(1,10));
    }
    //
    public String toString() {
        return String.format(
            "Name: %s, Color: %s, Age: %d, Health: %d, Height: %.2f, Max-Height: %.2f, Gender: %s \n"
            ,name, color, age, health, height, maxHeight, (male ? "Male" : "Female")
        );
    }
    //
    public Dog breed(Dog d) {
        if (this.male ^ d.getGender()) {
            Dog pup = new Dog();
            // set color of pup
            switch(rndRange(1,3)) {
                case 1:
                    pup.setColor(this.color);
                    break;
                case 2:
                    pup.setColor(d.getColor());
                    break;
                case 3:
                    pup.setColor(this.color + " & " + d.getColor());
                    break;
            }
            // set height of pup
            double avg = (this.maxHeight + d.getMaxHeight()) / 2;
            pup.setMaxHeight(avg);
            // set gender of pup
            switch(rndRange(0,1)) {
                case 0:
                    pup.setGender(false);
                    break;
                case 1:
                    pup.setGender(true);
                    break;
            }
            // return the new created pup
            return pup;
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
