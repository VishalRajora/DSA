package Arrays;

class Pair {
    long min, max;

    public Pair(long first, long second) {
        this.min = first;
        this.max = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "Min=" + min +
                ", max=" + max +
                '}';
    }
}
