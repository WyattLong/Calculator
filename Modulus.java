interface Modulus {
    default int mod(int x, int y) {
        return x % y;
    }
}
 /**
 * returns the modulus of x and y
 */