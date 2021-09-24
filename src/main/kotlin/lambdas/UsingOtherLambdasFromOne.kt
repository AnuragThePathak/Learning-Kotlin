package lambdas

/*
Suppose you have a predicate originalPredicate: (Char) -> Boolean and you want
to have the opposite predicate. Write a predicate notPredicate that takes a
 Char variable and returns the opposite of originalPredicate from that variable.
 */
class UsingOtherLambdasFromOne {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val originalPredicate: (Char) -> Boolean = { ch ->
                ch.lowercaseChar() in 'a'..'z'
            }

            val notPredicate: (Char) -> Boolean = { ch ->
                !originalPredicate(ch)
            }
        }
    }
}