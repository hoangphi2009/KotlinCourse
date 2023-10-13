package inheritance

class Employee(
    val name: String="",
    val id: Int,
    val address: Address

) {
    //khối khởi tạo tự động xuất thông tin
    init {
        display()
    }
    fun display(){
        println("Empliyee Name: $name")
        println("Empliyee id: $id")
        println("Empliyee address: $address")
    }
}