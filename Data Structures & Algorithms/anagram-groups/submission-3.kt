class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // create freq array list of source strings
        val freqList = mutableListOf<String>()

        for((index,word )in strs.withIndex()){
            val freq=IntArray(26)
            for(char in word){
                val index = char - 'a'
                freq[index]++
            }
            freqList.add(freq.joinToString(separator = "#"))
        }
        // create a map with keys of unique arrays string represenations and add the indexes of same freqarray
        val indexMap = mutableMapOf<String,MutableList<Int>>()

        for(itemKey in freqList){
            
            if(!indexMap.containsKey(itemKey)){
                
                freqList?.forEachIndexed{index, word ->
                    if(word == itemKey){
                       indexMap.getOrPut(itemKey) { mutableListOf() }.add(index)
                    }
                }
            }
        }

        // create a values into a list and group the words based on indexes

        val indicesCollection = indexMap.values.toList()
        val words = mutableListOf<List<String>>()
        for(innerIndexArray in indicesCollection){
            val innerList = innerIndexArray.map { index -> strs[index] }
        words.add(innerList)
            
        }
return words
    }
}
