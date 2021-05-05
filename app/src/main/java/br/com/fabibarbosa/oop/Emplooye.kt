package br.com.fabibarbosa.oop

class Emplooye(name: String, age: Int, gender: String, var salary : Double) : Person (name, age, gender){
    var identificationId : String = ( (0..100).random()  + this.age ).toString()

    fun increase(value : Double) {
        this.salary += value
    }

    fun myId () : String {
        return this.identificationId
    }


}