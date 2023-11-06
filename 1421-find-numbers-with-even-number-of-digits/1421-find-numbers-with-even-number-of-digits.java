class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
         return count;
    }
    boolean even(int num){
        int digits = countdigits(num);
        return digits % 2 == 0;
    }
    int countdigits(int num){
        return (int)Math.log10(num) + 1;
    }
}