class Solution {
    fun isValid(s: String): Boolean {
        
     val stack = ArrayDeque <Char> ()
     val pairs = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

        for (ch in s)
        {
            when {
                ch =='(' || ch == '{' || ch == '[' -> stack.addLast(ch)

                ch in pairs ->
                    {
                    if(stack.isEmpty() || stack.removeLast() != pairs[ch])
                    return false
                    }
                }
        }
    return stack.isEmpty()
    }
    }
        