fun main() {
    runSimulation()
}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Mario"))
    println(greetingFunction("Mario"))
    println(greetingFunction("Mario"))
    println(greetingFunction("Mario"))
    println(greetingFunction("Mario"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}