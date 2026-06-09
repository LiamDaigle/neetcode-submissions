class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const seenMap = {}
        for(let i = 0; i < nums.length; i++){
            if(seenMap[nums[i]] !== undefined)
                return true;
            seenMap[nums[i]] = 1;
        }
        return false;
    }
}
