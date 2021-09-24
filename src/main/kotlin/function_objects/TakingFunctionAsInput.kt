package function_objects

class TakingFunctionAsInput {
    companion object {
        fun square(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
            continuation(value * value, context)
        }
    }
}