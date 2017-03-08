import java.util.Random;

class Driver {

    public static void main(String[] args) {

        Random rnd = new Random();

        // -2,147,483,648 to 2,147,483,647 - values that an integer can hold
        int n1 = rnd.nextInt();
        System.out.println("Generated number is " + n1);

        // 0 to 20
        int n2 = rnd.nextInt(21);
        System.out.println("Generated number is " + n2);

        // 5 to 35        
        /* 
        int n3 = 5 + rnd.nextInt(35 + 1 - 5);
        int n3 = rnd.nextInt(36 - 5) + 5; 
        */
        int n3 = rnd.nextInt(31) + 5; 
        System.out.println("Generated number is " + n3);

        // 1000 to 9999 - 4 digit number
        int n4 = 1000 + rnd.nextInt(10000 - 1000);
        System.out.println("Generated number is " + n4);

        // 2 to 3 - using a function
        int n5 = rndRange(2,3);
        System.out.println("Generated number is " + n5);

        // -3 to 564 - using a function
        int n6 = rndRange(-3, 564);
        System.out.println("Generated number is " + n6);

        // 1 to 6 - using an overloaded function
        int rollDie = rndRange(6); //OR: int rollDie = rndRange(1,6);
        System.out.println("Die landed on " + rollDie);

        // 1 to 2 - using an overloaded function
        int flipCoin = rndRange(2); //OR: int flipCoin = rndRange(1,2);
        if (flipCoin == 1) {
            System.out.println("Heads!");
        }
        else if (flipCoin == 2) {
            System.out.println("Tails!");
        }        

    }

    public static int rndRange(int start, int finish) {
        return (
            new Random().nextInt(finish + 1 - start) + start
        );
    }
    // always start at 1.
    public static int rndRange(int finish) {
        return rndRange(1, finish);
    }

}
