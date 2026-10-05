public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {15, 42, 8, 93, 27, 64};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}
