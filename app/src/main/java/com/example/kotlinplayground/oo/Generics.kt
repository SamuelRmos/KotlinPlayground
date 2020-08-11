package com.example.kotlinplayground.oo

import java.util.*

class Timeline<T> {
    private val date2Data: MutableMap<Date, T> = mutableMapOf()

    fun add(element: T) {
        date2Data[Date()] = element
    }

    fun getLatest(): T {
        return date2Data.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): Timeline<E> {
    val result = Timeline<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main() {
    val timeLine: Timeline<Int> = Timeline()
    timeLine.add(2)
    println(timeLine.getLatest())

    val timeline = timelineOf("yellow", "red", "black")
}