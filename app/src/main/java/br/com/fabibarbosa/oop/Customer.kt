package br.com.fabibarbosa.oop

class Customer(name: String, age: Int, gender: String) : Person(name, age, gender) {
    var superMarket = emptyArray<Product>()

    fun buy (product : Product) {
        this.superMarket[superMarket.size + 1]
    }

    fun total () {
        var total = Double
        for (Product in superMarket) {
           // total + Product.price
        }
    }
}