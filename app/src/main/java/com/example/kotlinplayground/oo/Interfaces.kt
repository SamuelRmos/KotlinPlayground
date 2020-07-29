package com.example.kotlinplayground.oo

interface Drivable {
    fun drive()
}

class Bicycle : Drivable {
    override fun drive() {
        println("Driving bicycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving boat")
    }
}

fun main() {
    val drivable: Drivable = Bicycle()
    drivable.drive()
}