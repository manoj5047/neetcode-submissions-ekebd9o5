class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     val seen : HashMap<Int,Int> = hashMapOf()
     for (i in nums.indices){
        val compliment = target - nums[i]
        if(seen.keys.contains(compliment)){
            return intArrayOf(seen.getValue(compliment),i)
        }
        seen[nums[i]] = i
     }
     return intArrayOf()
}}
