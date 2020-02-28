package src.task17

fun main(args: Array<String>) {

    val aircraft = Aircraft()

    println("""Номер самолета: ${aircraft.number}
        |Максимальная дальность полета: ${aircraft.maxRangeKm}
        |Вместимость бака: ${aircraft.maxVolumeLiters}
        |Расход топлива: ${aircraft.litersPer100Km}""".trimMargin())
}

class Aircraft{

    var number: String = "B7471000"

    var maxRangeKm: Double = 10000.0

    var maxVolumeLiters: Double = 1000.0

    val litersPer100Km: String
    get() = "${maxVolumeLiters / maxRangeKm * 100} литров на 100 км"
}