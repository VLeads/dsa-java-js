class Solution {

    public static int getMaxi(int[] arr, int N) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMini(int[] arr, int N) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 6, -6, 8, 15, 0 };
        int N = arr.length;

        int min = getMini(arr, N);
        int max = getMaxi(arr, N);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}