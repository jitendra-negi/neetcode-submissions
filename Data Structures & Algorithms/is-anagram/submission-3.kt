class Solution {
    fun isAnagram(s: String, t: String): Boolean {

       val preS= s.lowercase().filter{ it.isLetter()}
       val sortedS = preS.toCharArray().sorted().joinToString("")
       val preT= t.lowercase().filter{ it.isLetter()}
       val sortedT = preT.toCharArray().sorted().joinToString("")

        return sortedS == sortedT
    }
}
