fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    println("${"*".repeat(n) + '\n'}".repeat(m))
}