// solution 00
class Preson constructor(var name:String ,var  age:Int) {
    //constructor(private val name:String ,private val  age:Int)

    private  val name1:String  =""
    private  val  age1:Int = 0
    init {
        this.name= name1
        this.age = age1
    }

    fun getNaem():String{
           return  this.name
       }
    fun getAge1():Int{
        return this.age
    }
}
// solution 01
class Preson1 constructor(private  val name:String ,private  val  age:Int) {
    //constructor(private val name:String ,private val  age:Int)
    fun getNaem():String{
        return  this.name
    }
    fun getAge1():Int{
        return this.age
    }
}

fun main() {
    var p = Preson("kamal",19)
    println(p.getAge1())
}