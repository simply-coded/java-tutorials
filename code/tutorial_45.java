/**
 * CLASS
 */
class Driver {
    //
    public static void main(String[] args) {

        /*
            Different ways to do the same thing

                // 1
                int[][] scores = new int[3][5];
                scores[0][0] = 89;
                scores[0][1] = 90;
                scores[0][2] = 94;
                scores[0][3] = 97;
                scores[0][4] = 88;
                scores[1][0] = 65;
                scores[1][1] = 45;
                scores[1][2] = 56;
                scores[1][3] = 23;
                scores[1][4] = 87;
                scores[2][0] = 78;
                scores[2][1] = 89;
                scores[2][2] = 99;
                scores[2][3] = 90;
                scores[2][4] = 75;

                // 2
                int[][] scores = new int[3][]{
                    {80,90,94,97,88},
                    {65,45,56,23,87},
                    {78,89,99,90,75}
                };

                // 3
                int[][] scores = {
                    {80,90,94,97,88},
                    {65,45,56,23,87},
                    {78,89,99,90,75}
                };

            
            // Ragged\Jagged Arrays

                // 1
                int[][] scores = new int[3][];
                scores[0] = new int[4];
                scores[1] = new int[3];
                scores[2] = new int[5];

                // 2
                int[][] scores = new int[][] {
                    new int[4],
                    new int[3],
                    new int[5]
                }

                // 3
                int[][] scores = {
                    {1,2,3,4},
                    {1,2,3},
                    {1,2,3,4,5}
                }


        */
        
        int[][] scores = {
            {80,90,94,97,88},
            {65,45,56,23},
            {78,89,99,90,75}
        };   

        // accessing an item
        System.out.println( scores[1][3] );

        // changing an item
        scores[1][3] += 30;
        System.out.println( scores[1][3] );

        // looping through first layer using for each
        for ( int[] test : scores) {            
            System.out.println( test[3] );
        }

        // looping through all using for each
        for ( int[] test : scores) {            
            for ( int score : test) {                
                System.out.print( score + " " );
            }
            System.out.println();            
        }

        // looping through all using for
        for ( int r = 0; r < scores.length; r++ ) {
            for ( int c = 0; c < scores[r].length; c++) {                
                System.out.print( scores[r][c] + " " );
            }
            System.out.println();
        }
        
    }
    //
}
