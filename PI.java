interface PI {
    default double piTime(int x) {
        return (Math.PI * x);
    }
}
/**
 * returns pi multiplied by x
 */