class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val result= mutableSetOf<Int>()

        for(num in nums){
            val answer = result.add(num)
            if(!answer)return true
        }

        return false
    }
}
