public class ArrayStats {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }
}