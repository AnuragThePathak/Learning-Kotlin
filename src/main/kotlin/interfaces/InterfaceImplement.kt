package interfaces

class InterfaceImplement: Engine {

    override fun stopEngine(key: Boolean) = key

    fun engineTest1() = Engine.coolEngine()
    fun engineTest2() = Engine.batteryUse()
    fun engineTest3() = startEngine()
}

fun main() {
    val interfaceImplement = InterfaceImplement()
    interfaceImplement.engineTest1()
    interfaceImplement.engineTest2()
    interfaceImplement.engineTest3()

    println(interfaceImplement.stopEngine(true))
}