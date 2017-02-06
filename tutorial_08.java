class Driver 
{
  public static void main(String[] args)
  {
  
    // addition
    int result01 = 11 + 5;          // 16        

    // subtraction
    int result02 = 11 - 5;          // 6

    // multiplication
    int result03 = 11 * 5;          // 55

    // division
    int result04 = 11 / 5;          // 2   -integers cannot contain decimals, so they are removed (not rounded up or down)
    int result05 = 10 / 5;          // 2   
    int result06 = 3 / 5;           // 0   

    double result07 = 11 / 5;       // 2.0 -integers cannot contain decimals, but storing it as a double will add on .0
    double result08 = 11.0 / 5.0;   // 2.2 
    double result09 = 11 / 5.0;     // 2.2 -integer 11 will be converted into a double 11.0 in this operation
    double result10 = 11.0 / 5;     // 2.2 -integer 5 will be converted into a double 5.0 in this operation

    // modulus 
    int result11 = 11 % 5;          // 1   -5 goes into 11 two times with '1' left over
    int result12 = 24 % 6;          // 0   -6 goes into 24 four times with '0' left over
    int result13 = 31 % 4;          // 3   -4 goes into 31 seven times with '3' left over
    int result14 = 5 % 7;           // 5   -7 goes into 5 zero times with '5' left over

    // power
    double result15 = Math.pow(2, 3);               // 8.0  -two cubed
    double result16 = Math.pow(4, 0);               // 1.0  -four to the power of zero
    double result17 = Math.pow(243, 0.2);           // 3.0  -the 5th root of 243
    double result18 = Math.pow(25, (1.0 / 2.0));    // 5.0  -square root of 25
    double result19 = Math.sqrt(25);                // 5.0  -square root of 25

    /** 
     * Auto Casting: 
     *      If a larger primitive data type performs an operation with another smaller primitive data type, it will automatically cast
     *      the smaller primitive data type to the larger data type. When it can it will default to integer for numbers, and double for numbers with decimals.
     * Example: 
     *      (int)5 + (double)6 = (double)5 + (double)6
     *      (short)3 - (byte)25 = (short)3 - (short)25
     *      (int)10 * (long)135 = (long)10 * (long)135         * 
     *      (long)30 / (float)5f = (float)30f / (float)5f
     *      (byte)80 - (int)50 * (double)20 = (double)80 - (double)50 * (double)20
    */         

  }
}
