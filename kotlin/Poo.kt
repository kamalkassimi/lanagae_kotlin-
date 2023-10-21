open  class  Presone( var age:Int, var prenom:String,var height:Float) {

      constructor(a:Int):this(15,"kassimi",1.9f)
       constructor(a:Int,b:String):this(15,"kassimi",1.9f)

     var name:String ="kamal"
         get() =field
         set(value) {field= value}
    inner class garsane (){
         fun AfichegeMessage(){
             println("c'set class garssne name  ${prenom}  age  ${age}   height =  ${height}")
         }
     }

    init {
      var age:Int
      var  prenom:String
    }
//    fun Affichege(){
//        println(" age ${age}  prenom ${prenom}")
//    }
//     init {
//         if (age > 5 && height < 1.5) {
//             println("${age} is height ${height}  ")
//         } else if (age > 7 && height < 1.6) {
//             println("${age} is height ${height} ")
//         } else {
//             println(" No sorry is shor  ")
//         }
//     }
//    var bool= age > 5 && height < 1.5
//var messege = when(bool){
//    true ->"${age} is height ${height} in when  "
//    else -> " No sorry is shor in when "
//}
}
data class  Etudiant(var name:String, var code:String, var sexe:String, var adress:String, var age: Int)


fun main() {


    var  p= Etudiant("name", "code", "sexe","adress",18)
    var list = ArrayList<Etudiant>()
// Ajouetr Etudint 10
    for (i in 0..3){
        print("Enter number of name   :\n ")
        var  name= readLine()!!.toString()
        print("Enter number of code   :\n ")
        var  code= readLine()!!.toString()
        print("Enter number of sexe   :\n ")
        var  sexe= readLine()!!.toString()
        print("Enter number of adress :\n ")
        var adress = readLine()!!.toString()
        print("Enter number of age    :\n ")
        var  age= readLine()!!.toInt()
          p= Etudiant(name, code, sexe,adress,age)
        list.add(p)
    }
    //3
    list.sortBy { it.age }
    //4
    list.groupBy { it.sexe }
    //5
    list.groupBy { it.sexe }.get("Femme")

    //1 Affichage le nom premier
    for(nom in list){
        if(nom.sexe=="garcon"){
            println(nom)
            break
        }
    }
// Modification le nom premier
    for(nom in list){
        if(nom.sexe=="garcon"){
            print("Enter number of name   :\n ")
            var  name= readLine()!!.toString()
            print("Enter number of code   :\n ")
            var  code= readLine()!!.toString()
            print("Enter number of sexe   :\n ")
            var  sexe= readLine()!!.toString()
            print("Enter number of adress :\n ")
            var adress = readLine()!!.toString()
            print("Enter number of age    :\n ")
            var  age= readLine()!!.toInt()
            nom.name  = name
            nom.code  = code
            nom.sexe  = sexe
            nom.adress= adress
            nom.age=age
            println(nom)
            break
        }
    }
    // Creer une lict contanter
     var listContsnte= mutableListOf<String>()
    for (i in list) {
        listContsnte.add(i.name)
    }
    println(listContsnte)
//09 deledel en Entudoits
    var removeEtudos= readLine()!!.toString()
    for (i in list){
        if (i.sexe == removeEtudos)
            list.remove(i)
    }


// 10
    println(list.reversed())
    // 11
    println(list.clear())





}





















