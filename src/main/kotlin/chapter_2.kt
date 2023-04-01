fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${if (args.isNotEmpty()) args[1] else "someone"}!")
    println("Program arguments: ${args.joinToString()}")
    println(max(5, 8))
    val question =
        "The Ultimate Question of Life, the Universe, and Everything"
    val answer: Int = 42
    val yearsToCompute: Double = 7.5e6
    println(yearsToCompute)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maximum(a: Int, b: Int): Int = if (a > b) a else b


// 2.2 Classes and properties