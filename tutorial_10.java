public class Driver 
{
  public static void main(String[] args) 
  {          

      int num1 = 5, num2 = 4, num3 = 9;

      // change value of num1
      num1 = num2;
      num1 = 23;

      // add 6 to num1
      num1 = num1 + 6;
      num1 += 6;           

      // subtract 2 from num1
      num1 = num1 - 2;
      num1 -= 2;

      // divide num1 by 3
      num1 = num1 / 3;
      num1 /= 3;

      // multiply num1 by 10;
      num1 = num1 * 10;
      num1 *= 10;

      // all arithmetic operations follow PEMDAS
      num1 = 3;
      num1 = 4 * num2 + num3 - 1 + 10 / 2 % num1; 
      //  4 * 4 + 9 - 1 + 10 / 2 % 3
      //  16 + 9 - 1 + 10 / 2 % 3
      //  16 + 9 - 1 + 5 % 3   
      //  16 + 9 - 1 + 2
      //  25 - 1 + 2
      //  24 + 2
      //  26
      // num1 = 26

      num1 = (2 + 5) * num1 - num2;
      //  2 + 5 * 26 - 4
      //  7 * 26 - 4
      //  182 - 4
      //  178
      // num1 = 178

    } 
  }
