fun main(){
    val saludo = "hola"
    var nombre: String = "kotlin"

    println("$saludo $nombre")
    println("Ingresa primer numero")
    val num1 = readln().toInt()
    println("Ingresa segundo numero")
    val num2 = readln().toInt()
    var res = num1 + num2
    println("La suma es : $res")
}