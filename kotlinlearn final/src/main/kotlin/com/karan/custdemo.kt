package com.karan

data class Customer(val name: String, val email: String)

fun main() {
    val fred = Customer("fred", "hello.email.com")
    println(fred)

}