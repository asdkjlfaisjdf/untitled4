import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()

    if (a < b && a < c) {
        println(b + c)
    } else if (b < a && b < c) {
        println(b + c)
    } else if (c < a && c < b) {
        println(a + b)
    }
    //uchta raqamning ikkita katta sonning yigindisi


}