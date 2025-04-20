package Videos.V8_Arrays;

public class P5_Max {
    public static int Maximum(int[] arr, int start, int end) {
        if (start > end || arr == null) return -1;
        int maxVal = arr[start];
        for (int i=start; i<=end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50};
        System.out.println(Maximum(arr, 0, 3));
    }
}
