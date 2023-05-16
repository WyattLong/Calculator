interface Product {
    default int mult(int x, int y) {
        return x * y;
    }
}
    
    /**
     * returns the product of x and y
     */