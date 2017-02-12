import static java.lang.System.out;

class Driver {
    public static void main(String[] args) {

        int a = 12;
        int b = 13;

        out.print("a = b : "); out.println( a == b );
        out.print("a ≠ b : "); out.println( a != b );
        out.print("a < b : "); out.println( a < b );
        out.print("a > b : "); out.println( a > b );
        out.print("a ≤ b : "); out.println( a <= b );
        out.print("a ≥ b : "); out.println( a >= b );

        out.println("\ncharacter comparison");
        char chrA = 'A';
        int intA = 65; // check out an ASCII table

        out.print("chrA = intA : "); out.println( chrA == intA );

        char chrB = 'B';
        char chrC = 67; // check out an ASCII table
        char chrD = 'D';

        out.print("chrB < chrC : "); out.println( chrB < chrC );
        out.print("chrB = chrD : "); out.println( chrB == chrD );
        out.print("chrB > chrD : "); out.println( chrB > chrD );

        String name1 = "Zoey";
        String name2 = "Zoey"; // uses same address as name1 for optimization
        String name3 = new String("Zoey"); // forces a new address to be used
        
        out.println("\ncompare address locations");
        out.print("name1 = name2 : "); out.println( name1 == name2 );
        out.print("name1 = name3 : "); out.println( name1 == name3 );        

        out.println("\ncompare contents");
        out.print("name1 = name2 : "); out.println( name1.equals(name2) );
        out.print("name1 = name3 : "); out.println( name1.equals(name3) );
        
    }
}
