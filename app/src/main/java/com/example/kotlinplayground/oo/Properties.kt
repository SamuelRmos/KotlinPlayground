package com.example.kotlinplayground.oo

class City {
    var name: String = ""
    var population: Int = 0
}

fun main() {
    val berlin = City()
    berlin.name = "Berlin"
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}