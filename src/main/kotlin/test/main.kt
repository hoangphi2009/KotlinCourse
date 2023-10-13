package test

fun main() {
    var myDog = Dog("kiki",15,"yellow")
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    myDog.say()
    myDog.weight = 20
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    var myDogs = arrayOf(Dog("kiki",15,"yellow"),Dog("bog",25,"red"))
    println("My dog have name ${myDogs[1].name} ${myDogs[1].weight} ${myDogs[1].color}")

    var myDog1 = Dog01("kiki",15,"yellow")
    println("My dog have name ${myDog1.name} ${myDog1.weight} ${myDog1.color}")

}