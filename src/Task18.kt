package src.task18

fun main(args: Array<String>) {

    val aircraft = Aircraft("B7471000", 10000.0, 1000.0)

    println("""Номер самолета: ${aircraft.number}
        |Максимальная дальность полета: ${aircraft.maxRangeKm}
        |Вместимость бака: ${aircraft.maxVolumeLiters}
        |Расход топлива: ${aircraft.litersPer100Km}""".trimMargin())
}

open class Aircraft(var number: String, var maxRangeKm: Double, var maxVolumeLiters: Double){
    val litersPer100Km: String
        get() = "${maxVolumeLiters / maxRangeKm * 100} литров на 100 км"
}