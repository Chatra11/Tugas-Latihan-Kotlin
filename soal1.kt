import kotlin.math.sqrt

fun jarak(a: Int, b: Int, c: Int, d: Int){
    var Jarak = sqrt(((a*c)*(a*c)+(b*d)*(b*d)).toDouble())
    println("Jarak dari titik t1($a,$b) dan t2($c,$d) adalah $Jarak")
}
fun main (){
    jarak(2,3,8,7)
    jarak(5,3,-8,-4)
}
