interface Square {
    default int sq(int x) {
        return x * x;
    }
}
/**
 * returns the square of x
 */