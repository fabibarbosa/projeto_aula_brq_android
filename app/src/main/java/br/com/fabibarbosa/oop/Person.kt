package br.com.fabibarbosa.oop

abstract class Person(val name : String, var age : Int, var gender : String) {
    fun info() : String {
        var info = "A pessoa se chama ${this.name
        } e tem ${this.age} anos de idade"

        return info
    }
}
