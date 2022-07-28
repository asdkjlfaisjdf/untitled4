import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    val largest = largest(a, b, c)
    val smallest = smallest(a, b, c)
    println(largest)
    println(smallest)

}

fun largest(first: Int, second: Int, third: Int): Int {
    var max = first
    if (second > max) {
        max = second
    }
    if (third > max) {
        max = third
    }
    return max
}

fun smallest(first: Int, second: Int, third: Int): Int {
    var min = first
    if (second < min) {
        min = second
    }
    if (third < min) {
        min = third
    }
    return min
}

//raqamlarning eng kattasi keyin esa neg kichigi