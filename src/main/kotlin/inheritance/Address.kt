package inheritance

class Address(
    val street: String,
    val district: String,
    val country: String
) {
    // gọi biến thì hàm tostring giúp tạo ra một chuỗi
    // nếu không có toString thì sẽ hiện ra một hashCode
    override fun toString(): String {
        return "$street,$district,$country"
    }
}