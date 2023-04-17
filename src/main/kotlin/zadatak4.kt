fun main (){

}

interface Drivable {
abstract fun vozi ()
abstract fun stani ()
}
class Romobil (): Drivable {
    override fun vozi() {
        println("Romobil vozi")
    }
    override fun stani() {
        println("Romobil se zaustavlja")
    }
}
class Bicikl (): Drivable {
    override fun vozi() {
        println("Bicikl se vozi")
    }
    override fun stani() {
        println("Bicikl se zaustavlja")
    }
}