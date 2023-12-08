package com.example.mgckiosk.menu

class DrinkMenu : AbstractMenu() {
    val array = arrayOf("커피","에이드&주스","티","스무디&프라페")
    override fun displayInfo() {
        array.forEachIndexed { index, s ->
            println("${index+1}. ${s}")
        }
        println("0.뒤로")
        var choice = isValidNum(array.size)
        when (choice) {
            1 -> {
                val coffeeMenu = CoffeeMenu()
                coffeeMenu.displayInfo()
            }
            2 -> {
                val adeJuiceMenu = AdeJuiceMenu()
                adeJuiceMenu.displayInfo()
            }
            3 -> {
                val teaMenu = TeaMenu()
                teaMenu.displayInfo()
            }
            4 -> {
                val smoothieFrappeMenu = SmoothieFrappeMenu()
                smoothieFrappeMenu.displayInfo()
            }
            0 ->{
                back(this)
            }
        }
    }
}