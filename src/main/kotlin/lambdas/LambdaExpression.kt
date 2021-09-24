package lambdas
/*
Write a lambda expression that takes two integer arguments and returns the
greatest of them.
 */
class LambdaExpression {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lambda: (Int, Int) -> Int = { a, b -> maxOf(a, b) }
        }
    }
}