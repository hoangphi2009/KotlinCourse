package abstractclass

abstract class fish(){
    abstract val color: String
}
class Shark: fish(){
    override val color: String ="gray"
}class Plecostoums: fish(){
    override val color: String ="gold"
}
fun makefish(){
    val shark = Shark()
    val plecostoums = Plecostoums()

    println("Shark have color is ${shark.color}")
    println("Shark have color is ${plecostoums.color}")
}

