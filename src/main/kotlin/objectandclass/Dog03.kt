package objectandclass

import java.lang.IllegalArgumentException

class Dog03(name_para:String, weight_para: Int, color_para: String) {
    val name = name_para.uppercase()
        get() {
            return field.lowercase()
        }
    var weight = weight_para
        set(value) {
            field = if(value>5) value else throw IllegalArgumentException("weight is low")
        }
    var color = color_para

    fun say(){
        println("gau gau" +
                "")
    }
}