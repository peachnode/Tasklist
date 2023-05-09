package tasklist

val reminder = mutableListOf<String>()
const val SINGLE_DIGITS = 9
fun main() {
    // write your code here
    println("Input the tasks (enter a blank line to end):")
    while (true) {
        val userInput = readln().trimIndent()
        if (userInput.isEmpty()) break
        else reminder.add(userInput)
    }
    if (reminder.isEmpty()) {
        println("No tasks have been input")
    } else {
        for (index in reminder.indices) {
            var suffix = "${index + 1} "
            if (index + 1 <= SINGLE_DIGITS) suffix += " "
            println(suffix + reminder[index])
        }

    }
}


