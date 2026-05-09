
fun main(){
    var valor: Int
    do {
        print("Ingresa el diametro de la tuberia:")
        valor = readln().toInt()
        if(valor <= 0){
           println("Ingresa un numero positivo") 
        }
    } while(valor <= 0)
        print("El diametro de tu tuberia es $valor")
}