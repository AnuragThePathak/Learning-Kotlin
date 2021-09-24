package lambdas

class ComplexLambdas {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lambda: (Long, Long) -> Long = { a, b ->
                var prdct: Long = 1
                for (i in a..b) {
                    prdct *= i
                }
                prdct
            }
        }
    }
}