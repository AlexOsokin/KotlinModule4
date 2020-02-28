package src.task19

fun main(args: Array<String>) {

    val aircraft = Boeing747("B7471000", 10000.0, 1000.0, 500)

    println("""Номер самолета: ${aircraft.number}
        |Максимальная дальность полета: ${aircraft.maxRangeKm}
        |Вместимость бака: ${aircraft.maxVolumeLiters}
        |Расход топлива: ${aircraft.litersPer100Km}
        |Максимальная вместимость: ${aircraft.maxCapacity} человек""".trimMargin())
}

open class Aircraft(var number: String, var maxRangeKm: Double, var maxVolumeLiters: Double){
    val litersPer100Km: String
        get() = "${maxVolumeLiters / maxRangeKm * 100} литров на 100 км"
}

class Boeing747(
        number: String,
        maxRangeKm: Double,
        maxVolumeLiters: Double,
        var maxCapacity: Int):
        Aircraft(number, maxRangeKm, maxVolumeLiters)