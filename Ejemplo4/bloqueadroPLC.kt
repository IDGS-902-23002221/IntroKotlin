fun main(){
    val contrasenia = "123"
    var errores = 0 

    while(errores < 3){
        print("Ingresa la contrasenia")
        val pass = readln()

        if(pass == contrasenia){
            println("Acceso concedido")
            return
        }else {
            errores++
            println("contrasenia incorrecta: Numero de intentos ${3-errores}")
        }
    }
    println("Demasiados intentos. Saliendo...")
}