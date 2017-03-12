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
         if (labPit == null) {
             System.out.println("Couldn't breed these two dogs.");
         }
         else {
             System.out.println("A new dog was created.");
         }
                  
    }
    
}
/**
 * Dog class
 */
class Dog {    
    private String name, color;    
    private int age;
    private double height, maxHeight;
    private boolean male;
    // 
    // constructors
    //
    public Dog() {
        name = "";
        color = "";
        age = 0;
        height = 0.5;
        maxHeight = 2;
        male = true;
    }
    //
    public Dog(String c, double mH, boolean g) {
        name = "";
        color = c;
        age = 0; 
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
    // methods
    //
    public void birthday() {
        age++;

        if (height < maxHeight) {
            height += 0.8;
        }
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
            // genders didnt match
            return null;
        }
    }
    //
    public static int rndRange(int start, int finish) {
        return (
            new Random().nextInt(finish + 1 - start) + start
        );
    }
}
