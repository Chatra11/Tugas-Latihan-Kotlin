fun main(){
    val Pangkat = {angka1: Int , angka2: Int -> Math.pow(angka1.toDouble(), angka2.toDouble())}
    println("2 pangkat 7  = ${Pangkat(2,7).toInt()}")
}