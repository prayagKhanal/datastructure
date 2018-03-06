package leetcodePractice;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,11,7,15};
		int target = 9;
		int[] values = {9,9}; 
		Solution s1 = new Solution();
		values = s1.twoSum(nums,target);
		System.out.print(values[0] +" " + values[1]);
	}
	
	

}

class Solution{
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i +1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
