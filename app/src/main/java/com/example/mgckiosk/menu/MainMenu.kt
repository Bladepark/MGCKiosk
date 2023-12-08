package com.example.mgckiosk.menu

class MainMenu : AbstractMenu() {
    val mainList = arrayOf("음료","푸드","상품","쿠폰발급","배달 요청 목록")

    override fun displayInfo() {
        println("MEGA커피에 오신 것을 환영합니다!!!")
        println("[ 메뉴판 ]")
        mainList.forEachIndexed { index, s ->
            println("${index+1}. ${s}")
        }
        println("0.프로그램 종료")
        var choice = isValidNum(mainList.size)
        when (choice) {
            1 -> {
                val drinkMenu = DrinkMenu()
                drinkMenu.displayInfo()
            }
            2 -> {
                val foodMenu = FoodMenu()
                foodMenu.displayInfo()
            }
            3 -> {
                val productMenu = ProductMenu()
                productMenu.displayInfo()
            }
            4 -> {
                println("할인쿠폰이 발급되었습니다.")  //Lv.6  할인쿠폰을 발급
                println("[ 쿠폰번호 ] \n3000원 할인쿠폰 : 1234ABCD\n5000원 할인쿠폰 : ILOVEMEGA\n10000원 할인쿠폰 : COFFEHOLIC ")
                val mainMenu = MainMenu()
                mainMenu.displayInfo()
            }
            5 -> {
                println("미구현입니다...")  //Lv.6  할인쿠폰을 발급
                val mainMenu = MainMenu()
                mainMenu.displayInfo()
            }
            0 ->{
                System.exit(0)
            }
        }


    }

}