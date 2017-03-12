import static java.lang.System.out;

class Driver {
    public static void main(String[] args) {

        /**
         * Basics
         */

        // if
        if (true) {
            out.println( "1. I will be used." );
        }

        if (false) {
            out.println( "2. I will NOT be used." );
        }     

        // if else
        if (true) {
            out.println( "3. I will be used." );
        }
        else {
            out.println( "4. I will NOT be used." );
        }
        
        if (false) {
            out.println( "5. I will NOT be used." );
        }
        else {
            out.println( "6. I will be used." );
        }

        // if else-if
        if (true) {
            out.println( "7. I will be used." );
        }
        else if (true) {
            out.println( "8. I will NOT be used." );
        }

        if (true) {
            out.println( "9. I will be used." );
        }
        else if (false) {
            out.println( "10. I will NOT be used." );
        }

        if (false) {
            out.println( "11. I will NOT be used." );
        }
        else if (true) {
            out.println( "12. I will be used." );
        }

        if (false) {
            out.println( "13. I will NOT be used." );
        }
        else if (false) {
            out.println( "14. I will NOT be used." );
        }

        // nested if
        if (true) {
            if (true) {
                out.println("15. I will be used.");
            }
        }
        if (false) {
            if (true) {
                out.println("16. I will NOT be used.");
            }
        }
        if (true) {
            if (false) {
                out.println("17. I will NOT be used.");
            }
        }


        /**
         * Video example
         */
        int items = 12;

        if (items == 12) {
            out.print( "All items here." );
        } 
        else if (items >= 0 && items < 12) {
            out.print( "Missing items." );
        }
        else if (items > 12) {
            out.print( "Extra items." );
        }
        else {
            out.println( "You have really messed up buddy." );
        }

    }
}
