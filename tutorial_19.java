import static java.lang.System.out;

class Driver {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            out.println("Loop #: " + i);
        }

        for (int i = 10; i > 0; i-=2) {
            out.println("Loop #: " + i);
        }

        // for each loop will be discussed later in detail as well as arrays
        String[] listOfNames = new String[] {"Jeremy", "Ally","Bob","Katy"};

        for (String name : listOfNames) {
            out.println(name);
        }

    }
}
