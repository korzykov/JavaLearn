package Leetcode;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (answer[0] > 0 || answer[1] > 0) {
                break;
            }
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ca = twoSum(new int[]{3, 3}, 6);
        for (int i = 0; i < ca.length; i++) {
            System.out.print(ca[i]);
        }


    }
}
