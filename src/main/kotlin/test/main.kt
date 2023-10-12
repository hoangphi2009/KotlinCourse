package test

fun main() {
    var myDog = Dog("kiki",15,"yellow")
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    myDog.say()
    myDog.weight = 20
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
}