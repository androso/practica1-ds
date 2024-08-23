import kotlin.text.toDouble

fun calculate(numUno: Double, numDos: Double, operacion: String): Double? {
    return when (operacion) {
        "+" -> numUno + numDos
        "-" -> numUno - numDos
        "*" -> numUno * numDos
        "/" -> {
            if (numDos == 0.0) {
                null 
            } else {
                numUno / numDos
            }
        }
        "**" ->
                if (numUno == 0.0 && numDos == 0.0) null
                else {
                    Math.pow(numUno, numDos)
                }
        else -> null 
    }
}

fun main() {
    println("Enter base number:")
    val num1 = readLine()?.toDouble()
    println("You selected $num1")

    println("Enter second number:")
    val num2 = readLine()?.toDouble()
    println("You selected $num2")
    println("Enter the operation you'd like to perform (+, -, *, /, **):")
    val operacion = readLine()
    println("You selected $operacion")

    if (num1 != null && num2 != null && operacion != null) {
        val result = calculate(num1, num2, operacion)
        if (result != null) {
            println("The result of the operation is: $result")
        } else {
            println("Error: Invalid operation or trying do divide by zero.")
        }
    } else {
        println("Error: Invalid input. Please enter valid numbers and an operation.")
    }
}