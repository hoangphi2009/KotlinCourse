package inheritance

open class Dog : animal() {
    override var name: String ="kiki"
    override var food: String = "meat"
    override var habitat: String = "home"

    override fun say() {
        println("the Dog name: ${name.uppercase()}")
    }

    override fun eat() {
        println("the Dog eat: ${food.uppercase()}")
    }
}