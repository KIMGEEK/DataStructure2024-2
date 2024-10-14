interface TestInterface {
    val a: Int
    fun f1(): String = "Interface: f1 called"
    fun f2(a: String) {println("Interface: f2 called")}
    fun f3(a: String): String {
        return "Interface: f3 called. a = $a"
    }
}

class ChildOfInterface(val x: Int): TestInterface {
    override val a: Int = x
    override fun f1(): String = "ChildOfInterface: f1 called"
    override fun f2(a: String) {println("ChildOfInterface: f2 called. a=$a")}
    fun f4(): String = "ChildOfInterface: f4 called. x = $x"
}