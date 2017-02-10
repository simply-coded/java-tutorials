public class Driver {
    public static void main(String[] args) {

        float leaving = 60232.54f;
        int population = 78272;
        byte arriving = 94;

        // No need to cast (int)arriving because byte is smaller
        // than int and will fit without worry of losing data.
        population += arriving;
        
        // Need to cast because java doesn't know that after the subtraction
        // we will be under the 30,000 range that short can hold
        short leftover = (short)(population - leaving);        
        
        // No need to cast because double can fit both int and float.
        double loss = leaving / population * 100;
               

        // how much they can hold
        /*
            byte	1 byte	-128 to 127
            short	2 bytes	-32,768 to 32,767
            int	    4 bytes	-2,147,483,648 to 2,147,483, 647
            long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	4 bytes	±3.40282347E+38F (6-7 significant decimal digits) 
            double	8 bytes	±1.79769313486231570E+308 (15 significant decimal digits)
            char	2 byte	0 to 65,536 (unsigned)
            boolean	1 bit   false, true
        */       

    }
}
