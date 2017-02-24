class Driver {
    public static void main(String[] args) {

        // setup some variables
        String name = "Kate";
        String lName = "Lolilagier";
        
        // input data as variables or literals.
        greeting(name, lName, 32);
        
        // call method without arguments
        line();

        // call method with arguments
        section(1);

        System.out.println("a) Who's your favorite person that breathes?");
        System.out.println("b) Do they like mangos?");

        section(2);
        System.out.println("a) Are you ok with people that walk?");
        System.out.println("b) Do you drink water in any form?");
        line();
        
    }

    static void line() {
        System.out.println("---------------------------------");
    }

    static void section(int secNum) {
        System.out.println("\nSection " + secNum + ":");
        System.out.println("---------------------------------");
    }

    static void greeting(String name, String last, int age) {
        // name varaible here is different than the one in the main method.
        System.out.print("Welcome, " + name + " " + last);
        System.out.println(" of " + age + " years old.");
    }
}
