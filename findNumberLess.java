package Array;

public class findNumberLess {
    public int countLessThan(int[] digits, int target) {
        int count = 0;

        for (int num : digits) {
            if (num < target) {
                count++;
            }
        }

        return count;
    }
}
