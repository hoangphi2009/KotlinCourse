package objectandclass

fun main() {
    var myDog = Dog("kiki",15,"yellow")
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    myDog.say()
    myDog.weight = 20
    println("My dog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    var myDogs = arrayOf(Dog("kiki",15,"yellow"),Dog("bog",25,"red"))
    println("My dog have name ${myDogs[1].name} ${myDogs[1].weight} ${myDogs[1].color}")

    var myDog1 = Dog01("auno",25,"yellow")
    println("My dog have name ${myDog1.name} ${myDog1.weight} ${myDog1.color}")

    var myDog2 = Dog02("popy",35)
    println("My dog have name ${myDog2.name} ${myDog2.weight} ${myDog2.color}")

    var myDog3 = Dog03("POPY",1,"null")
    println("My dog have name ${myDog3.name} ${myDog3.weight} ${myDog3.color}")
    //myDog3.weight = 4 (set value) if weight is lower than 5 sent warning


}