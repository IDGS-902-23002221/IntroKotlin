fun main(){
    var carga = 0

    while (carga <=100){
        println("carga: $carga%")
        Thread.sleep(2000)
        carga += 15
    }
    println("La carga es: $carga%")
}