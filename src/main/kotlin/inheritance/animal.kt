package inheritance

open class animal{
    // nếu ko muốn cho kế thừa thì sửa dụng private trước properties
    open var name: String="name"
    open var food: String="food_animal"
    open var habitat: String="habitat_animal"
    open fun say(){
        println("the animal is saying")
    }
    open fun eat(){
        println("the animal is eating")
    }
    open fun sleep(){
        println("the animal is sleeping")
    }

}