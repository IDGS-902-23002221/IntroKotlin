fun main(parametro: Array<String>){
    print("Ingrese coordenada x del punto:")
    val x = readln().toInt()
    print("Ingrese coordenada del punto:")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println("Primer Cuadrante")
        x < 0 && y > 0 -> println("Segundo Cuadrante")
        x < 0 && y < 0 -> println("Tercer Cuadrante")
        x > 0 && y < 0 -> println("Cuarto Cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}