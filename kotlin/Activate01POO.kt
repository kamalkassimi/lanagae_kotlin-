
class University(val nom:String,val anneDeFondation:Int) {
    val listProf = ArrayList<Professor>()
    val listStud = ArrayList<Student>()
    fun hire(prof:Professor){
        listProf.add(prof)
    }
    fun enroll(stud:Student){
        listStud.add(stud)
    }}
class Professor(var nompr: String, var age:Int, salaireAnnuel:Int, ){
    var listCours= ArrayList<Cours>()
    fun teach(cour:Cours){
        listCours.add(cour)
    }
    fun doOralExam(): Result {
        return Result.SUCCES
    }

}
class Student(var nom:String,var age:Int,matricule:Int){
    var listCours=ArrayList<Cours>()
    var succesPropabilty:Int=45
    var logic = when{
        succesPropabilty<100 && succesPropabilty>0 -> true
        else -> false
    }
    fun enroll(cour: Cours) {
        listCours.add(cour)
        println("this student learn $cour")
    }
    fun takeExam(cour: Cours){
        println("student take exame $cour"
    }
    fun learn(){
        if (logic){
            succesPropabilty+=2
        }
    }
    fun party(){
        if (logic){
            succesPropabilty-=2
        }
    }
    fun grade(result: Result):Result{
        return  result
    }

}

enum class Result {
    SUCCES,ECHEC
}
data  class Cours(var name: String)

//    MATH,PHYSIQUE,CHEMIQUE,ARABE,ENGLISH,FRANCER



fun main() {
    var University0 = University("Ntic",2023)
    var Professor0 = Professor("hossame",43,5000)
    var Student0= Student("kamal",100,1578)
    var Coures0= Cours("Python")
    University0.hire(Professor0)
    University0.enroll(Student0)
    Professor0.teach(Coures0)
    Student0.enroll(Coures0)
    Student0.party()
    Student0.party()
    Student0.party()
    Student0.learn()

}