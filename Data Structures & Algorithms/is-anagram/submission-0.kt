class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sca = s.toCharArray()
        val tca = t.toCharArray()
        sca.sort()
        tca.sort()
        println(sca)
        println(tca)
        return sca.toList().equals(tca.toList())
    }
}
