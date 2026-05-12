fun main() {
    val m1 = Array(3) { IntArray(3) }
    val m2 = Array(3) { IntArray(3) }

    println("Ingresa los valores de la primera matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
            print("[$i][$j]: ")
            m1[i][j] = readLine()!!.trim().toInt()
        }
    }

    println("\nIngresa los valores de la segunda matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
            print("  [$i][$j]: ")
            m2[i][j] = readLine()!!.trim().toInt()
        }
    }

    println("\nResultado:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${m1[i][j] + m2[i][j]}\t")
        }
        println()
    }
}   