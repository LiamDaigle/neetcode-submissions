class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i]))
                return new int[] {hashMap.get(nums[i]), i};
            hashMap.put(target - nums[i], i);
        }

        //If done correctly, this will never get hit due to the constraints.
        return null;
    }
}
