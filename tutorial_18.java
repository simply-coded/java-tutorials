import static java.lang.System.out;

class Driver {
    public static void main(String[] args) {

        /* infinit loop
        while (true) {
            
            Careful.
            I will 
            run from 
            top to
            bottom forever.
          
        } 
        */    
        
        /* unreachable code 
        while (false) {
            
            This will throw an 
            error because you
            can never use it.             

        }
        */

        // break out of a loop
        while (true) {
            out.println("Time to leave");
            break;
        }

        // counter loop
        int i = 0;
        while (i < 10) {
            out.println("Iteration: " + i);
            i++; // need to update your counter
                 // or you will create an infinit loop
        }

        // conditional loop
        boolean running = true;
        while (running) {
            out.println("I will stop this loop now.");
            running = false;
        }

        // loop first, then check to loop again
        do {
            out.println("I will run at least once.");
        } while(false);

    }
}
