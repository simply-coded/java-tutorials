class Driver {
    public static void main(String[] args) {

        System.out.println("Arguments used: " + args.length);

        // handle different amount of arguments
        if ( args.length == 1) {
            System.out.println("First argument is:" + args[0]);            
        }
        else if ( args.length == 2 ) {
            System.out.println("First argument is:" + args[0]);
            System.out.println("First argument is:" + args[1]);
        }
        else {
            System.out.println("Wrong number of arguments");
        }
        
        // print all your arguments one after the other
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
