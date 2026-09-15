class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val resultArray = IntArray(26)
        if(s.length==t.length==false) return false
        for(i in 0 until s.length){
            resultArray[s[i] -'a']++
             resultArray[t[i] -'a']--
        }
        for(i in 0..25){
            if(resultArray[i]>0) return false
        }
        return true
    }
}
