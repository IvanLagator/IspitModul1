fun main (){
zadatak2(78,56)
}

fun zadatak2(n1: Int, n2: Int) {
    val numbers = when {
        n1 < n2 -> n1..n2
        n1 > n2 -> n2..n1
        else -> {
            println("Numbers are equal")
            return
        }
    }
    for (i in numbers) {
        println(i)
    }
}



