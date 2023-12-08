package com.example.mgckiosk.menu

class SmoothieFrappeMenu : AbstractMenu() {
    val smoothieFrappe = arrayOf(arrayOf("플레인요거트스무디",1500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("슈크림허니퐁크러쉬",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("망고요거트스무디",2500,"대충 맛과 향이 좋다는 설명")
        ,arrayOf("딸기퐁크러쉬",2000,"대충 맛과 향이 좋다는 설명")
    )
    override fun displayInfo() {
        for(i in smoothieFrappe.indices){
            println("${i+1}. ${smoothieFrappe[i][0]} | ${smoothieFrappe[i][1]} | ${smoothieFrappe[i][2]}")
        }
        println("0.뒤로")
        var choice = isValidNum(smoothieFrappe.size)
        when (choice) {
            1 -> {
                val drink = CoffeeMenu()
                drink.displayInfo()
            }
            2 -> {
                val food = FoodMenu()
                food.displayInfo()
            }
            3 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            4 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            5 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            6 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            0 ->{

            }
        }
    }
}