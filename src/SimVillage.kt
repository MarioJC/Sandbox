fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    println(greetingFunction("Guyal", 2))

//    println(greetingFunction)
//    () -> kotlin.String


    // itt Python kan een named function NIET als argument worden meegegeven aan andere functies!

    fun myGreetingFunction() : String {
        val currentYear = 2019
        return "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(myGreetingFunction())

//    println(myGreetingFunction)
//    error: function invocation 'myGreetingFunction()' expected
}