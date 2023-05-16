interface Difference {
    default int sub(int x, int y) {
        return x - y;
    }
}
    
    /**
     * returns the difference of x and y
     */