package lambdas

/*
Implement a function that returns the composition of two functions. The
 composition of functions g(x) and h(x) is a function that returns g(h(x)).
 */
class ReturningLambdaFromLambda {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ans = compose({x -> x}, {x -> x + 5})
            println(ans(4))
        }

        fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int {
            return { x -> g(h(x)) }
        }
    }
}