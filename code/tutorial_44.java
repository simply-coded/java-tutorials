/**
 * CLASS
 */
class Driver {
    //
    public static void main(String[] args) {

        /* 
            Different ways to do the same thing
                //
                String[] familyMembers;
                familyMembers = new String[3];
                familyMembers[0] = "Jeremy";
                familyMembers[2] = "Kate";
                familyMembers[1] = "Bobby";
                
                //
                String[] familyMembers = new String[3];
                familyMembers[0] = "Jeremy";
                familyMembers[2] = "Kate";
                familyMembers[1] = "Bobby";                
                
                //
                String[] familyMembers;
                familyMembers = new String[]{"Jeremy", "Kate", "Bobby"};
                
                //
                String[] familyMembers = new String[]{"Jeremy", "Kate", "Bobby"};
                
                //
                String[] familyMembers = {"Jeremy", "Kate", "Bobby"};

        */

        // Example
        String[] familyMembers = {"Jeremy", "Kate", "Bobby"};

        // Accessing
        System.out.println( familyMembers[2] );

        // Changing
        familyMembers[2] = "Katy";       
        System.out.println( familyMembers[2] );

        // Checking
        if ( familyMembers[0].equals("Jeremy") ) {
            System.out.println("Hello Jeremy");
        }
        else {
            System.out.println("Intruder");
        }

        // Looping through
        for (String name : familyMembers) {
            System.out.println( name );
        }

        for (int i = 0; i < familyMembers.length; i++) {
            System.out.println( familyMembers[i] );
        }
        
    }
    //
}
