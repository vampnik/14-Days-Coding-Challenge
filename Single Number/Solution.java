class Solution {
    public static int frequency(int a[], int n, int x)
    {
        int count = 0;
        for (int i=0; i < n; i++)
        if (a[i] == x){
            count++;
        }
        return count;
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i =0; i<nums.length; i++){
            result = frequency(nums, nums.length, nums[i]);
            if (result >1){
                continue;
            }
            else {
                System.out.println(nums[i]);
            }
        }
        return result ;
    }
    public static void main (String [] args){
        int [] myArr = {2,1,2};
        singleNumber(myArr);
    }
}