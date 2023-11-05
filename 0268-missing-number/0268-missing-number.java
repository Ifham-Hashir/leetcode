class Solution {
    public int missingNumber(int[] nums) {
        int total = nums.length;
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return (total*(total + 1)/2) - sum;
    }
}