class Driver {
    public static void main(String[] args) {

        String firstName = "Luke";
        String lastName = "Miller";
        byte age = 32;
        double carCost = 82382.32342;

        System.out.printf("My name is %s %.1s., and I'm %d years old.\n", firstName, lastName, age);
        System.out.format("I own a $%,.2f car.", carCost);

        String fullName = String.format("%s %s", firstName, lastName);

        System.out.printf(" Which is good for being in my %.1s0s", age );

        // old way of doing things
        System.out.println("\n" + fullName + " is my name.");

    }
}
