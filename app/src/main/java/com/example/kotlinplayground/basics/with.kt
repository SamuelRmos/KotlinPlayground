package com.example.kotlinplayground.basics

fun main() {

    val props = System.getProperties()

//    props.list(System.out)
//    props.propertyNames().toList()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}