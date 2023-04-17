fun main() {
    val zadatak5 = Array(100) { it * 2 }

    val zbrojBrojeva = zadatak5.sum()
    println("Zbroj svih brojeva je: $zbrojBrojeva")

    val srednjaVrijednostBrojeva = zadatak5.average()
    println("Srednja vrijednost brojeva je: $srednjaVrijednostBrojeva")
}