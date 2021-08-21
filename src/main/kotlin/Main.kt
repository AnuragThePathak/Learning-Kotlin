fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")
    var a=12
    var b:Byte=5
    var p=b+1445
    var c:Int=b+123
//    var d:Int =b  //it'll get error
    var d:Int = b.toInt()  // this is what we must do to get above thing
//    println(p, b)
    println("p= $p, c=$c")
}