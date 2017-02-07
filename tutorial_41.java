import java.util.Random;


/**
 * CLASS
 */
class PetStore {
    public static void main(String[] args) {
        //
        Dog lab = new Dog("Brown", 3, true);
        Dog pit = new Dog("Black", 2.5, false);
        Dog dane = new Dog("White", 4.2, true);
        //
        Cat scar = new Cat("Yellow", 1, true);
        Cat milk = new Cat("Spotted", 0.6, false);        
    }
}


/**
 * CLASS
 */
abstract class Mammal {    
    //
    private static int count = 0;
    private String name, color;
    private int age, health;
    private double height, maxHeight;
    private boolean male;
    //
    public Mammal() {
        name = "";
        color = "";
        age = 0;
        health = 100;
        height = 0.5;
        maxHeight = 2;
        male = true;
        count++;
    }    
    public Mammal(String n, String c, double mH, boolean g) {
        name = "";
        color = c;
        age = 0;
        health = 100;
        height = 0.5;
        maxHeight = mH;
        male = g;
        count++;
    }
    //
    public void setName(String n) {
        name = n;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setGender(boolean g) {
        male = g;
    }
    public void setMaxHeight(double mH) {
        maxHeight = mH;
    }
    public void setHealth(int h) {
        health = h;
    }
    //
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getMaxHeight() {
        return maxHeight;
    }
    public int getAge() {
        return age;
    }
    public int getHealth() {
        return health;
    }
    public boolean getGender() {
        return male;
    }
    public int getCount() {
        return count;
    }
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
            health -= rndRange(15, 20);
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
    public void attacks(Mammal d) {
        int damage = rndRange(1, 10);
        d.setHealth(d.getHealth() - damage);
        System.out.println(name + " inflicted " + damage + " damage on " + d.getName());
    }
    //
    public String toString() {
        return String.format(
            "Name: %s, Color: %s, Age: %d, Health: %d, Height: %.2f, Max-Height: %.2f, Gender: %s \n", name, color, age, health, height, maxHeight, male ? "Male" : "Female"
        );
    }
    //
    public abstract Mammal breed(Mammal d);
    //
    private int rndRange(int start, int finish) {
        return (new Random().nextInt(finish + 1 - start) + start);
    }    
}


/**
 * CLASS
 */
class Dog extends Mammal {
    //
    public Dog() {
        super();
    }
    public Dog(String c, double mH, boolean g) {
        super("", c, mH, g);
    }
    //
    @Override
    public void attacks(Mammal d) {
        int damage = rndRange(5, 20);
        d.setHealth(d.getHealth() - damage);
        System.out.println(getName() + " inflicted " + damage + " damage on " + d.getName());
    }
    //
    @Override
    public Dog breed(Mammal d) {
        if (getGender() ^ d.getGender() && d instanceof Dog) {
            String tempC;
            switch (rndRange(1, 3)) {
                case 1:
                    tempC = getColor();
                    break;
                case 2:
                    tempC = d.getColor();
                    break;
                default:
                    tempC = getColor() + " & " + d.getColor();
                    break;
            }
            double tempH = (getMaxHeight() + d.getMaxHeight()) / 2;
            boolean tempG;
            switch (rndRange(0, 1)) {
                case 0:
                    tempG = false;
                    break;
                default:
                    tempG = true;
                    break;
            }
            return new Dog(tempC, tempH, tempG);
        } else {
            return null;
        }
    }
    //
    private int rndRange(int start, int finish) {
        return (new Random().nextInt(finish + 1 - start) + start);
    }
}


/**
 * CLASS
 */
class Cat extends Mammal {
    //
    public Cat() {
        super();
    }
    public Cat(String c, double mH, boolean g) {
        super("", c, mH, g);
    }
    //
    @Override
    public Cat breed(Mammal d) {
        if (getGender() ^ d.getGender() && d instanceof Cat) {
            String tempC;
            switch (rndRange(1, 3)) {
                case 1:
                    tempC = getColor();
                    break;
                case 2:
                    tempC = d.getColor();
                    break;
                default:
                    tempC = getColor() + " & " + d.getColor();
                    break;
            }
            double tempH = (getMaxHeight() + d.getMaxHeight()) / 2;
            boolean tempG;
            switch (rndRange(0, 1)) {
                case 0:
                    tempG = false;
                    break;
                default:
                    tempG = true;
                    break;
            }
            return new Cat(tempC, tempH, tempG);
        } else {
            return null;
        }
    }
    //
    private int rndRange(int start, int finish) {
        return (new Random().nextInt(finish + 1 - start) + start);
    }
}
