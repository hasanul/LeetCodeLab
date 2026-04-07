public class Solution {
    private int sum;
    private int count;
    private int[] window;

    public MovingAverage(int size) {
        window = new int[size];
        sum = 0;
        count = 0;
    }

    public double next(int val) {
        int index = count % window.length;
        sum += val - window[index];
        window[index] = val;
        count++;
      
        return (double) sum / Math.min(count, window.length);
    }
}
