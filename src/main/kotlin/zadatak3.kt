fun main (){
    val a1 = Automobil("crni",5)
    val a2 = Automobil("crni",2)
    val a3 = Automobil("crni",10)
    val a4 = Automobil("crni",1)
    val a5 = Automobil("crni",13)

    Automobil.najmladeGodiste()
    Automobil.najstarijeGodiste()
    Automobil.prosjecnoGodiste()

}
abstract class Vozilo (val boja: String, val godiste: Int){
   abstract fun vozi ()
   abstract fun parkiraj ()
   abstract fun ubrzaj()
   abstract fun zaustaviSe()
}

class Automobil (boja: String, godiste: Int): Vozilo(boja, godiste) {
    init {
        ukupnaListaAutomobila.add(this)
    }
    override fun vozi() {
        println("Automobil vozi")
    }
    override fun parkiraj() {
        println("Automobil parkira")
    }
    override fun ubrzaj() {
        println("Automobil ubrzaje")
    }
    override fun zaustaviSe() {
        println("Automobil se zaustavlja")
    }
    companion object {
        val ukupnaListaAutomobila = arrayListOf<Automobil>()
        fun najmladeGodiste() {
            println(ukupnaListaAutomobila.minBy { it.godiste }.godiste)
        }

        fun najstarijeGodiste() {
            println(ukupnaListaAutomobila.maxBy { it.godiste }.godiste)
        }

        fun prosjecnoGodiste() {
            println(ukupnaListaAutomobila.sumOf { it.godiste } / ukupnaListaAutomobila.size.toDouble())
        }

    }

    class Kamion(boja: String, godiste: Int) : Vozilo(boja, godiste) {
        override fun vozi() {
            println("Kamion vozi")
        }
        override fun parkiraj() {
            println("Kamion parkira")
        }
        override fun ubrzaj() {
            println("Kamion ubrzaje")
        }
        override fun zaustaviSe() {
            println("Kamion se zaustavlja")
        }
    }

}

