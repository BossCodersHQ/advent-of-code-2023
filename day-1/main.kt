import java.io.File

fun main() {
    var filename = "./input.txt"
    var file = File(filename)
    var input: List<String> = listOf()

    try {
        input = file.readLines()
        println(input)
    } catch (e: Exception) {
        println("Error: $e")
    }

    var total: Int = 0
    input.forEach { str ->
        var num: String = str.filter { it.isDigit() }
        var firstNum = num.first()
        var lastNum = num.last()
        var shortNum = "$firstNum$lastNum" 
        total += shortNum.toIntOrNull() ?: 0
        println(shortNum)
    }
    println("Total: $total")
}
