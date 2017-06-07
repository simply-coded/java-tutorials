//
//
public class Driver {
    
    public static void main(String[] args) {        
        String[] friends = {"jim","kate","bill","mark","devin","alice","melvin","jeremy","bob"};                  
        String space = " ";
        
        // example 1 - normal show method
        Messenger messager1 = new MyMessenger(friends);
        messager1.show();

        // example 2 - create a class to override the show method
        Messenger messager2 = new BetterMessenger(friends);
        messager2.show();

        // example 3 - create an anonymous class to override the show method
        Messenger messager3 = new MyMessenger(friends) {
            public void show() {
                for (String name : contactList) {
                    System.out.print(name + " ");
                }
                System.out.println();
            }
        };
        messager3.show();

        // example 4 - create an anonymous class to implement the entire interface
        final String sp = space;
        final String[] names = friends;
        Messenger messager = new Messenger() {              

            public void send(String message) {
                for (String name : names) {
                    System.out.println(name + ": " + message);
                }
            }

            public void show() {
                for (String name : names) {
                    System.out.print(name + sp);
                }
                System.out.println();
            }
        };
        messager.show();    
        
        // changing space variable now works because we created the sp variable.
        space = "  ";        
    }

}
//
//
class MyMessenger implements Messenger {

    protected String[] contactList;

    public MyMessenger(String[] names) {
        contactList = names;
    }
 
    public void send(String message) {
        for (String name : contactList) {
            System.out.println(name + ": " + message);
        }
    }

    public void show() {
        for (String name : contactList) {
            System.out.println(name);
        }
    }

}
//
//
class BetterMessenger extends MyMessenger {

    public BetterMessenger (String[] names) {
        super(names);
    }

    @Override
    public void show() {
        for (String name : contactList) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
//
//
interface Messenger {

    void send(String message);
    void show();    

}
