package com.example.mgckiosk

class MainMenu : AbstractMenu() {
    val main1 = arrayOf("음료","푸드","상품")

    override fun displayInfo() {
        println("MEGA커피에 오신 것을 환영합니다!!!")
        println("[ 메뉴판 ]")
        main1.forEachIndexed { index, s ->
            println("${index+1}. ${s}")
        }
        println("0.프로그램 종료")
        var choice = isValidNum(main1.size)
        when (choice) {
            1 -> {
                val drinkMenu = DrinkMenu()
                drinkMenu.displayInfo()
            }
            2 -> {
                val food = FoodMenu()
                food.displayInfo()
            }
            3 -> {
                val product = ProductMenu()
                product.displayInfo()
            }
            0 ->{
                System.exit(0)
            }
        }


    }

}