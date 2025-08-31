import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge two arrays into a third and sort it
    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        // Copy elements from arr1
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // Copy elements from arr2
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        // Sort the merged array
        Arrays.sort(arr3);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr3 = new int[arr1.length + arr2.length];

        mergeArrays(arr1, arr2, arr3);

        System.out.println("Array after merging:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
