class Driver {

    public static void main(String[] args) {

        // result = condition ? true : false;
        
        int item1, item2;
        item1 = 32;
        item2 = 31;

        // use inline
        System.out.println( (item1 != item2) ? "They have a different price tag." : "They are the same price." );
        
        // get the cheapest price of the two
        int cheapest = (item1 < item2) ? item1 : item2;
        System.out.println("Cheapest price is " + cheapest);

        int id1, id2;
        id1 = 32;
        id2 = 32;

        // check them first
        String info = (id1 == id2) ? "They're the same" : "They're different";
        System.out.println( info );
        
        // change ID if it is the same as another
        id1 = (id1 == id2) ? ++id1 : id1;
        System.out.println("ID for first person is now " + id1);    
        
    }

}
