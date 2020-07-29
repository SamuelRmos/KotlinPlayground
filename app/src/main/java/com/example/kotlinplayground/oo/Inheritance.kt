package com.example.kotlinplayground.oo

import kotlin.math.pow

open class Shape(val name: String) {
    open fun area() = 0.0
}

class Circle(name: String, val radius: Double): Shape(name) {
    override fun area() = Math.PI * radius.pow(2.0)
}

fun main() {
    val smallCircle = Circle("Small Circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}