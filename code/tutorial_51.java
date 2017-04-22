class Driver {

    public static void main(String[] args) {
      
        System.out.println( factorial(4) );
        looper(0);
        looper(5,20,2);
        
    }

    static void looper(int i) {
        System.out.println(i);
        i++;
        if (i < 10) {
            looper(i);
        }
    }

    static void looper(int start, int end, int step) {
        System.out.println(start);
        start += step;
        if (start < end) {
            looper(start, end, step);
        }
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;            
        }
        return n * factorial(n - 1);
    }
    
}
