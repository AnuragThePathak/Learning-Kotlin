package function_objects

/*
Implement a function generator.

It returns the function by the name given. Support three functions:

    "identity" (returns its argument).
    "half" (returns its argument divided by 2).
    "zero" (returns 0).

If the name is unknown, return the "zero" function.
 */

class FunctionGeneration {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val theFunc = generate("half") // We are creating the object
//            We get the function object returned by generate function

            println(theFunc(16)) // using the returned function object like a normal function.
        }

        fun generate(functionName: String): (Int) -> Int {
            return when(functionName) {
                "identity" -> ::identity
                "half" -> ::half
                else -> ::zero
            }
        }

        fun zero(x: Int) = 0
        fun half(x: Int) = x / 2
        fun identity(x: Int) = x

    }
}
