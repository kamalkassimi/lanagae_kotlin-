
// Exercice 1
// Ajouter des fonction presonneilses
fun String.removeFristElement():String{
    if(length <= 2  ){
        return this
    }
    return this.substring(1,length -1)
}
// Exercice 2
//1 En Utilisant les extensions Kotlin , creer une fonction d'enchage a Mutablelist <Int >
fun MutableList<Int>.revasdElemanet(index0:Int, index1:Int){
    var new  = this[index1]
    this[index1] =this[index0]
    this[index1]=new
}
// calcule du perimetre a une class circle
fun Circal(Qatar:Double):Double{
    return Math.PI* Qatar
}
// 3
class  Student1 constructor(var maek:Int){
    fun Student1.isExcellent():Boolean{
        var l = maek > 90
        return l
}


}
//creer en class une petite application POO en kotlin
//1
fun main() {
        var list= mutableListOf<Int>(1,5,5,8,9,7,11,88,55,44,7)
        var list1 = mutableListOf(1,8,8,7,44,66,77)
            var modificationList= list.revasdElemanet(1,3)
            println(list)
        var Student00= Student1(95)
        var str = "kassimi kamal "
             println(str.removeFristElement())

    }





// 3






//fun revasdElemanet(index1:Int, index0:Int){
//    var new= 0
//    var new1=0
//    var list= mutableListOf(1,5,8,7,6,7)
//       new  = list[index1] //5
//       new1 = list[index0]
//       list[index0] =new //5
//       list[index1]=new1
//      println(list)
//}
//mutableListOf
