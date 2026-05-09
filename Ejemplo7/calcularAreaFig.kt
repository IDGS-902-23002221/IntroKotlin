import kotlin.math.pow
import kotlin.math.PI

fun calcularArea(fig: Int){
    when(fig){
        1 -> {}
        2 -> {}
        3 -> {}
        4 -> {}
    }
} 

fun main(){
    var salir = false
    while (!salir){
        limpiarPantalla()
        println("Elije la figura:")
        println("1 = Cuadrado")
        println("2 = Rectandgulo")
        println("3 = circulo")
        println("4 = triangulo")
        println("0 = Salir")

        val fig = readln().toInt()

        when(fig){
            1 -> {cuadrado(); pausar() }
            2 -> {rectandulo(); pausar() }
            3 -> {circulo(); pausar() }
            4 -> {triangulo(); pausar() }
            0 -> salir = true
            else -> println("opcion invalida")
        }
    }
}

fun limpiarPantalla(){
    ProcessBuilder("cmd","/c","cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun cuadrado(){
    print("Ingresa el valor de un lado del cuadrado")
    val lado = readln().toDouble()
    print("El valor es ${lado.pow(2)}")
    
    print("\nPresiona Enter para salir...")
    readln()
}

fun rectandulo(){
    print("Ingresa la base:")
    var base = readln().toDouble()
    print("Ingresa la altura")
    var altura = readln().toDouble()
    print("El area del rectangulo es: ${base*altura}")
    
    print("\nPresiona Enter para salir...")
    readln()
}

fun circulo(){
    print("Ingrese el valor del radio")
    var radio = readln().toDouble()
    print("El valor del circulo es ${PI*radio.pow(2)}")

    print("\nPresiona Enter para salir...")
    readln()
}

fun triangulo(){
    print("Ingrese el valor de la base")
    var base = readln().toDouble()
    print("Ingrese el valor de la altura")
    var altura = readln().toDouble()
    print("El valor es ${(base*altura)/2}")

    print("\nPresiona Enter para salir...")
    readln()

fun pausar(){
    println("\nPresiona Enter para continuar...")
    readln()
}

}