package inheritance

fun main() {
    var myDog = Dog()
    println("myDog Food: ${myDog.food}")
    println("myDog Image: ${myDog.name}")
    println("myDog Habitat: ${myDog.habitat}")
    myDog.say()
    myDog.eat()
    println("----------------------------")
    var myFish = Fish()
    println("myFish Food: ${myFish.food}")
    println("myFish Image: ${myFish.name}")
    println("myFish Habitat: ${myFish.habitat}")
    println("----------------------------")
    var phi_address = Address("Đá Hàng","Quốc Lộ","VietName")
    var employee = Employee("Phi",12,phi_address)
}