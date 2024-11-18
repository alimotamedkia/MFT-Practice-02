fun main() {

    val firstNames = mutableListOf<String>()
    while (true) {
        println("[1] Enter name:")
        println("[2] View List:")
        println("[3] Search in List:")
        println("[0] Exit")

        when (readln()) {
            1.toString() -> {
                println("Please enter name:")
                firstNames.add(readln().lowercase())
            }

            2.toString() -> {
                firstNames.forEach { println(it) }
            }

            3.toString() -> {
                val firstName = readln().lowercase()
                if (firstNames.contains(firstName)) {
                    println("$firstName is valid in list")
                } else {
                    println("Unfortunately, the $firstName is not on the list.")
                }
            }

            0.toString() -> {
                println("Bye Bye!")
                break
            }
        }
    }
}
