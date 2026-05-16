fun main(){
    val altura = FloatArray(5)
    var suma = 0f
    for(i in 0..altura.size-1){
        print("Ingresa la altura:")
        alturas[i] = readln().toFloat()
        suma += altura[i]
    }
    val promedio = suma / altura.size 
    print("Altura promedio: $promedio")
    var altos = 0 
    var bajos = 0 
    for(i in 0..altura.size-1)
        if(altura[i] > promedio)
        altos++
    else
         bajos++
    println("Cantidad de personas mas altas que el primedio: $altos")
    println("Cantidad de personas mas bajas que el primedio: $bajos")

}