@FunctionalInterface
interface Filter {
    boolean test(String n);
}
@FunctionalInterface
interface Adder {
    int run(int n1, int n2);
}
//
//
public class Driver {

    public static void main(String[] args) {
        
        // main example
        String[] friends = { "jim", "kate", "bill", "mark", "devin", "alice", "melvin", "jeremy", "bob" };

        Messenger group = new Messenger(friends);
        String mess = "RSVP to my party.";

        group.send(mess, n -> n.charAt(0) == 'm');
        group.send(mess, n -> n.length() == 4);
        group.send(mess, n -> true);

        // create a lambda
        Adder add = (a, b) -> a + b;

        // execute a lambda
        int result1 = add.run(56, 79);

        // execute a lambda immediately
        int result2 = ( (Adder) (a, b) -> a + b ).run(13,28);

        // multiple statements in a lambda
        int result3 = ((Adder)(a, b) -> {
            System.out.print("The result = ");
            return a + b;
        }).run(5, 16);
        System.out.println(result3);
    }

}
//
//
class Messenger {

    protected String[] contactList;

    public Messenger(String[] names) {
        contactList = names;
    }

    public void send(String message, Filter filter) {
        for (String name: contactList) {
            if (filter.test(name)) {
                System.out.println(name + ": " + message);
            }
        }
    }

}
