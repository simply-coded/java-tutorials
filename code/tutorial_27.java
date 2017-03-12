class Driver {
    //
    public static void main(String[] args) {          
        
        System.out.println( greeting() );
        System.out.println( greeting("Jeremy") );
        System.out.println( greeting("Jeremy", "England") );
        
    } 
    //
    static String greeting() {
        return greeting("Person", "");
    }
    //
    static String greeting(String f) {
        return greeting(f, "");
    }
    // added a ternary operator here as per request to get rid of the extra space when only putting a first name.
    static String greeting(String f, String l) {        
        return (
            "--------------------------------\n" +
            "Hello, " + f + (l.equals("") ? "": " ") + l + ". Welcome to my app.\n" +
            "--------------------------------"    
        );
    }
    //
}
