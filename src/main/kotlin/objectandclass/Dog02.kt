package objectandclass

class Dog02(name_para:String, weight_para: Int) {
    val name = name_para.uppercase()
    var weight = weight_para
    var color :String? = null
    constructor(name: String,weight: Int,color_para: String):this(name,weight){
        this.color = color
    }
    fun say(){
        println("gau gau" +
                "")
    }
}