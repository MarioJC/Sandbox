class LootBox<T> (item: T) {
    var open = false
    private var loot: T = item

    fun fetch(): T? {
        return loot.takeIf { open }
    }
}

class Fedora(val name: String, val value: Int)

class Coin(val value: Int)

fun main() {
    val lootBoxOne = LootBox(Fedora("a generic-looking Fedora", 15))
    val lootBoxTwo = LootBox(Coin(15))

    lootBoxOne.open = true
    lootBoxOne.fetch()?.run {
        println("You retrieve $name from the box!")
    }
}