public class Driver {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;

        // post-incrementation. adds one to your variable
        a++;
        // a=1, b=0, c=0

        // pre-incrementation. adds one to your variable
        ++a;
        // a=2, b=0, c=0

        // post-decrementation. subtracts one from your variable
        a--;
        // a=1, b=0, c=0

        // pre=decrementation. subtracts one from your variable
        --a;
        // a=0, b=0, c=0

        // do operations left to right.    
        a = b++; // same as: a = b; b += 1;
        // a=0, b=1, c=0

        a = ++b; // same as: a = (b += 1);
        // a=2, b=2, c=0

        a = c--; // same as: a = c; c -= 1;
        // a=0, b=2, c=-1

        a = --c; // same as: a = (c -= 1);
        // a=-2, b=2, c=-2

    }
}
