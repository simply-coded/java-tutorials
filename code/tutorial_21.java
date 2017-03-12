import java.util.Scanner;

class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);       

        System.out.print("Input your first name: "); 
        String fName = scan.nextLine();
        System.out.print("Input your last name: "); 
        String lName = scan.nextLine();
        System.out.println("Hello, " + fName + " " + lName);


        // MORE EXAMPLES

        System.out.println("\n\n****Words from a sentence.");
        System.out.println("Enter 2 or more words.");
        // can store in a variable
        String first = scan.next();
        System.out.println("First word is: " + first);
        // can be done inline
        System.out.println("Second word is: " + scan.next());
        // get rid of any other words they typed including the enter button
        scan.nextLine();
                
        System.out.println("\n\n****Whole sentence.");
        System.out.println("Type as many words as you want.");
        // get everything until you hit enter
        System.out.println("You typed:\n" + scan.nextLine());

        System.out.println("\n\n****Multiline sentence.");
        // custom delimieter instead of enter
        scan.useDelimiter("//");
        System.out.println("To stop typing enter two forward slashes '//' followed by the enter button");
        System.out.println("You typed:\n" + scan.next());
        
        // clear the scanner (well if there is only one line to clear)
        scan.nextLine();
                
        // reset delimieter to the original one if you want
        System.out.println("\n\n****Removing custom delimiter.");
        scan.reset();
        System.out.println("The enter button should stop the input now.");
        System.out.println("You typed: " + scan.next());
        
    }
}
