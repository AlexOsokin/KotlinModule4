fun main(args: Array<String>) {
    println("Информация об автомобиле: ${Auto("Toyota", "белый", "о007oo777")}")
}

data class Auto(val brand: String, val color: String, val number: String)