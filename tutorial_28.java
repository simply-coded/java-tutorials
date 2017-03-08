class Driver {
    int a;
    // access to: 'a'

    void method1() {
        int b;
        // access to: 'b' and 'a'
    }

    void method2() {
        int c;
        // access to: 'c' and 'a'
    }
}
