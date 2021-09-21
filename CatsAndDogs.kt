import kotlin.random.Random

abstract class Animal(){
    abstract var name: String
    abstract var age: Int
    abstract fun talk()
}
class Dogs(name: String, age: Int) : Animal(){
    override var name: String = name
    override var age: Int = age
    override fun talk() {
        println("$name: Woof")
    }
}

class Cats(name: String, age: Int) : Animal(){
    override var name: String = name
    override var age: Int = age
    override fun talk() {
        println("$name: Meow")
    }
}

fun main(){
    val dogs = arrayOf(
        Dogs("Rufus", Random.nextInt(10)),
        Dogs("Fred", Random.nextInt(10)),
        Dogs("Spot", Random.nextInt(10)),
        Dogs("dogName1", Random.nextInt(10)),
        Dogs("dogName2", Random.nextInt(10)),
    )
    val cats = arrayOf(
        Cats("Lili", Random.nextInt(10)),
        Cats("Meep", Random.nextInt(10)),
        Cats("Patchy", Random.nextInt(10)),
        Cats("Furball", Random.nextInt(10)),
        Cats("Snowball", Random.nextInt(10)),
    )
    for (c in cats){
        print("${c.name}, ${c.age} | ")
    }
    println()
    for (d in dogs){
        print("${d.name}, ${d.age} | ")
    }
    println()

    for (c in cats){
        c.talk()
        for (d in dogs)
            if(d.age > c.age)
                d.talk()
    }
}