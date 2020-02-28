package src.task22

fun main(args: Array<String>) {

    val aircraft = Boeing747("B7471000", 10000.0, 1000.0, 500)
    aircraft.displayParametrs()
}

interface Passenger{
    val maxCapacity: Int
}

abstract class Aircraft(protected var number: String, protected var maxRangeKm: Double, protected var maxVolumeLiters: Double){
    protected val litersPer100Km: String
        get() = "${maxVolumeLiters / maxRangeKm * 100} литров на 100 км"

    open fun displayParametrs(){
        println("""Номер самолета: $number
        |Максимальная дальность полета: $maxRangeKm
        |Вместимость бака: $maxVolumeLiters
        |Расход топлива: $litersPer100Km""".trimMargin())
    }
}

class Boeing747(
        number: String,
        maxRangeKm: Double,
        maxVolumeLiters: Double,
        override val maxCapacity: Int): Aircraft(number, maxRangeKm, maxVolumeLiters), Passenger{
    override fun displayParametrs() {
        super.displayParametrs()
        println("|Максимальная вместимость: $maxCapacity человек")
    }
}