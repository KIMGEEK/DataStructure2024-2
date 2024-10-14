data class TestDataClass(
    var a: Int,
    val b: String = "Empty"
) {
    var c: Boolean = false

    override fun equals(other: Any?): Boolean{
        if (other == null || other !is TestDataClass){
            return false
        }
        return this.a == other.a && this.b == other.b && this.c == other.c
    }

    override fun toString(): String {
        return "Var a = $a, Var b = $b, c = $c"
    }
}
