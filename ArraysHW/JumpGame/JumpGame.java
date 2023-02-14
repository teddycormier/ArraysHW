public class JumpGame {
    public static int minJumps(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int farthest = 0; // farthest index that can be reached in the current jump
        int currentEnd = 0; // ending index of the current jump

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        int minJumps = minJumps(nums);
        System.out.println("Minimum number of jumps to reach the last index: " + minJumps);
    }
}
