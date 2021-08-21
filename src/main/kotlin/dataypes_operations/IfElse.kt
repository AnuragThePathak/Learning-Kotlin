package dataypes_operations

class IfElse {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var str= readLine()
//            Simple if-else
            if (str.equals("Fish")){ //we can manage case-sensitivity here as well
                println("Perfect guess")
            } else if (str=="food"){   // it is not good to use == like java
                println("Not correct")
            }else{
                println("Far apart")
            }

//            range based if-else
            var num= readLine()?.toInt()  // this is of type Integer?, hence
            // can't be used like integer
//            var num=Integer.valueOf(readLine())  // // this is of type Integer
            if (num==30){
                println("Super 30")
            } else if (num in 1..29){
                println("Under progress")
            } else{
                println("Stable")
            }
        }
    }
}