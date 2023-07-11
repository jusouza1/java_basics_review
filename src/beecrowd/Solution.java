package beecrowd;

class Solution {


    public static void main(String[] args) {
        int[] nums =  new int[] {1,3,4,2};
        int[] result = twoSum(nums, 6);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }



    public static int[] twoSum(int[] nums, int target) {
        int sum;
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if ((sum == target) && (nums[i] != nums[j])) {
                    int index1 = findIndex(nums, nums[i]);
                    int index2 = findIndex(nums, nums[j]);
                    if (index1 < index2) {
                        indexes[0] = index1;
                        indexes[1] = index2;
                    } else {
                        indexes[0] = index2;
                        indexes[1] = index1;
                    }
                    return indexes;
                } else if ((sum == target) && (nums[i] == nums[j])){
                    int[] result = repeatedList(nums, nums[i]);
                    indexes[0] = result[0];
                    indexes[1] = result[1];
                    return indexes;
                }
            }
        }

        return indexes;
    }

    public static int findIndex(int[] nums, int element) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public static int[] repeatedList(int nums[], int element) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                indexes[0] = i;
                for (int j = i+=1; j < nums.length ; j++) {
                    if (nums[j] == element) {
                        indexes[1] = j;
                    }
                }
                break;
            }
        }

        return indexes;
    }
}