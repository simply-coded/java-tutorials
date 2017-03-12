import static java.lang.System.out;

class Driver {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 3;

        // all of them have to be true in order to get back true
        out.println("Logical and ( && )");
        out.println( a == c && a < b );
        out.println( a <= c && b == 5 && b < c ); 

        // only one of them has to be true to get back true
        out.println("Logical or ( || )");        
        out.println( a < c || a < b );
        out.println( a != 3 || c > b || a == 4 ); 

        // one has to be true the other has to be false to get back true
        out.println("Bitwise exclusive or ( ^ )");        
        out.println( a == c ^ a == b );
        out.println( a != 3 ^ c > b ); 
        out.println( a == 3 ^ b == 5 );        

        // combine them together
        out.println("Using them together");
        out.println( a == c && a < b || a == 3 );
        out.println( a == c && a >= b || a == 3 );   

        // reverse the check     
        out.println("Logical not ( ! )");
        out.println( a == c && a < b || a == 3 );
        out.println( !(a == c) );   
        out.println( !(a > b) );

    }
}
