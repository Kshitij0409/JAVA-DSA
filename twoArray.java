package Array;

public class twoArray {
    public static int[] sumArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            result[i] = arr1[i] + arr2[i];

        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};

        int[] arr2 = {4, 3, 2, 1};

        int[] result = sumArrays(arr1, arr2);

        for (int x : result) {

            System.out.print(x + " ");

        }

    }
}
