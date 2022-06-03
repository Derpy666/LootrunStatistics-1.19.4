package net.mcplayhd.lootrunstatistics.chests.utils;

public class MinMax {

    private int min;
    private int max;

    public MinMax() {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }

    public MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getDifference() {
        return max - min;
    }

    public boolean isEmpty() {
        return min == Integer.MAX_VALUE && max == Integer.MIN_VALUE;
    }

    public void consider(int i) {
        min = Math.min(min, i);
        max = Math.max(max, i);
    }

}
