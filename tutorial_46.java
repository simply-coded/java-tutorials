/**
 * CLASS
 */
class Calculator {
    //
    public static void main(String[] args) {        
        int[] nums = new int[] { 12, 5, 3, 0 };
        
        try {
            int result = intDivide( 18, nums[3] );
            System.out.println( "The answer is " + result );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "This index is not available, or Cannot by zero." );
        } catch (java.lang.ArithmeticException e) {
            System.out.println( "Cannot divide by zero." );
        } catch (Exception e) {            
            throw e;
        }             

    }
    //
    static int intDivide( int n1, int n2 ) {
        return ( n1 / n2 );
    }
}
