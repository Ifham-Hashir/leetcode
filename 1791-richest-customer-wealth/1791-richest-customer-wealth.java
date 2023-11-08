class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] nums: accounts){
            int sum = 0;
            for(int num: nums){
                sum += num;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}