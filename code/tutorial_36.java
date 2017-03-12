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
         
         //System.out.println( labPit.toString() );
         System.out.println( labPit ); // will automatically call toString()
                  
    }
    
}
/**
 * Dog class
 */
class Dog {    
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

            double avg = (this.maxHeight + d.getMaxHeight()) / 2;
            pup.setMaxHeight(avg);

            switch(rndRange(0,1)) {
                case 0:
                    pup.setGender(false);
                    break;
                case 1:
                    pup.setGender(true);
                    break;
            }

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
