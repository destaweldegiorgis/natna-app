package test2;

public class ArrayMulitply {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] newNums = multiply(nums);
        for (int a : newNums)
            System.out.print(a + " ");
    }

    private static int[] multiply(int[] nums) {

        if (nums == null || nums.length == 0)
            return null;

        int[] newNums = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {
            int product = 1;
            for (int i = 0; i < nums.length; i++) {
                if (k != i)
                    product = product * nums[i];
            }
            newNums[k] = product;
        }
        return newNums;
    }
}
