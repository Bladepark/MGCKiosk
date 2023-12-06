package com.example.mgckiosk

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
                val drink = DrinkMenu()
                drink.displayInfo()
            }
            2 -> {
                val adeJuice = AdeJuiceMenu()
                adeJuice.displayInfo()
            }
            3 -> {
                val tea = TeaMenu()
                tea.displayInfo()
            }
            4 -> {
                val smoothieFrappe = SmoothieFrappeMenu()
                smoothieFrappe.displayInfo()
            }
            0 ->{
                back(this)
            }
        }
    }
}