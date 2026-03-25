fun sum(x: Int, z: Int): Int {
    return x + z
}

fun main() {
    println("Enter value of a: ")
    val a: Int = readln().toInt()
    println("Enter value for b: ")
    val b: Int = readln().toInt()
    val s = sum(a,b)
    println("Sum = $s")

}