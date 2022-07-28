import java.util.*

fun main() {


    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    var min = 0


    if (a < b && c < a) {
        min = a
        println(min)

    } else {

        if (b < a && b < c) {
            min = b
            println(min)
        } else {
            if (c < a && c < b) {
                min = c
                println(min)


            }
        }
    }
}